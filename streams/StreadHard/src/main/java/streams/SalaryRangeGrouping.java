package streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryRangeGrouping {
    static class Employee{
        String name;
        double salary;

        Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        String getName(){return name;}
        Double getSalary(){return salary;}
        @Override
        public String toString() {
            return name + " :" + salary;
        }
    }
    public enum SalaryRange{
        LOW, //0-50k
        MEDIUM, // 50k-100k
        HIGH, //100k+
    }
    private static SalaryRange getSalaryRange(Double salary) {
        if(salary < 50000) return SalaryRange.LOW;
        if(salary<100000) return  SalaryRange.MEDIUM;
        else return SalaryRange.HIGH;
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice",45000),
                new Employee("bob",78000),
                new Employee("charlie",120000),
                new Employee("devid",99000),
                new Employee("Eva",30000),
                new Employee("Fank",105000)
        );

        /* Medium -> bob 78000.0 , david 99000 below 1lakh after 50k
        low - alice, eva upto 50k
        high - charlie, frank after 1lakh
         */

        Map<SalaryRange,List<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(
                        //Range
//                        e -> {
//                            if(e.getSalary() < 50000) return SalaryRange.LOW;
//                            if(e.getSalary()<100000) return  SalaryRange.MEDIUM;
//                            else return SalaryRange.HIGH;
                        e -> getSalaryRange(e.getSalary())));

        System.out.println(collect);
                        }



    }

