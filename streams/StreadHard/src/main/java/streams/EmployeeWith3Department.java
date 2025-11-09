package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeWith3Department {
   static class WorkRecord{
       String name;
       String dept;
       WorkRecord(String name, String dept){
           this.name = name;
           this.dept = dept;
       }
       public String getName() {return name;}
       public String getDept(){return dept;}

       @Override
       public String toString() {
           return dept;
       }
   }
    public static void main(String[] args) {
        List<WorkRecord> records = Arrays.asList(
                new WorkRecord("suman","cse"),
                new WorkRecord("suman","mech"),
                new WorkRecord("suman","civil"),
                new WorkRecord("kiran","mech"),
                new WorkRecord("kiran","cse"),
                new WorkRecord("sumanth","cse"),
                new WorkRecord("sumanthB","ece"),
                new WorkRecord("Im","cse"),
                new WorkRecord("Im","cse"),
                new WorkRecord("Im","ece"));
        Map<String,List<WorkRecord>> record = records.stream().collect(Collectors.groupingBy(WorkRecord::getName));
        System.out.println(record);
        List<String> list = record.entrySet().stream().filter(e-> e.getValue().size()>=3).map(Map.Entry::getKey).toList();
        System.out.println(list);
        List<String> employees = records.stream().collect(Collectors.groupingBy(WorkRecord::getName, Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>=3).map(Map.Entry::getKey).toList();
        System.out.println(employees);

    }
}
