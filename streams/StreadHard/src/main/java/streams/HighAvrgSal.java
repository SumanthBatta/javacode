package streams;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class HighAvrgSal {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
        new Employee(1, "Ram", "Team", 388458349),
        new Employee(2, "Shyam", "IT", 575000),
        new Employee(3, "Priya", "HR", 478788000),
        new Employee(4, "Aman", "Finance", 626000),
        new Employee(5, "Neha", "Finance", 53000));

        Map<String,Double> result  =employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        Map<String, Double> result = employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.averagingDouble(employees1-> employees1.getSalary())));
//        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

//      Map<String,Double> result =
//              employees.stream()
//                      .collect(Collectors.groupingBy(Employee::getDepartment
//               ,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(result);
        System.out.println(result.entrySet().stream().max(Map.Entry.comparingByValue()));

        // Optional: Sort departments by average salary descending
        result.entrySet().stream().
                sorted(Map.Entry.<String, Double>comparingByValue().reversed()).
                forEach(entry ->
                        System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue()));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        result.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
                . forEach(entry ->
                        System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue()));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        result.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                . forEach(entry ->
                        System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue()));
}
    }
