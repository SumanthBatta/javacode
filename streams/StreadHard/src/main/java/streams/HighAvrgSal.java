package streams;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class HighAvrgSal {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
        new Employee(1, "Ram", "Team", 348349),
        new Employee(2, "Shyam", "IT", 55000),
        new Employee(3, "Priya", "HR", 48000),
        new Employee(4, "Aman", "Finance", 62000),
        new Employee(5, "Neha", "Finance", 53000));


      Map<String,Double> result =
              employees.stream()
                      .collect(Collectors.groupingBy(Employee::getDepartment
               ,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(result);
        System.out.println(result.entrySet().stream().max(Map.Entry.comparingByValue()));

}
    }
