package serialization;


import java.io.*;


//public class Test1 implements Serializable {
//    String name;
//    int id;
//    transient String pass;
//
//    public Test1(String name, int id, String pass) {
//        this.name = name;
//        this.id = id;
//        this.pass = pass;
//    }
public class Test {
    public static void main(String[] args) throws Exception {
     Test1 test = new Test1("sam",1,"sns");

     try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("text.ser"))) {
         out.writeObject(test);
     } catch (IOException e) {
         e.printStackTrace();
     }

     try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("text.ser"))){
         Test1 deserialized = (Test1) in.readObject();
         System.out.println("object deserialized");
         System.out.println("Name: " + deserialized.name);
         System.out.println("ID: " + deserialized.id);
         System.out.println("Pass: " + deserialized.pass);
     }







        // Case 1: Include salary
        Employee e1 = new Employee("Sumanth", 101, 75000, true);
        serialize(e1, "emp1.ser");

        // Case 2: Skip salary
        Employee e2 = new Employee("Sumanth", 102, 90000, false);
        serialize(e2, "emp2.ser");

        // Deserialize both
        deserialize("emp1.ser");
        deserialize("emp2.ser");
    }

    static void serialize(Employee e, String filename) throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(e);
        }
    }

    static void deserialize(String filename) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Employee emp = (Employee) ois.readObject();
            System.out.println("Deserialized: " + emp.name + " | Salary: " + emp.salary);
        }
    }
}

