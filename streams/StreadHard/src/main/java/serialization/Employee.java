package serialization;

import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int id;
    double salary;
    transient boolean includeSalary; // control flag

    public Employee(String name, int id, double salary, boolean includeSalary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.includeSalary = includeSalary;
    }

    // Custom serialization
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject(); // serialize normal fields

        // 👇 conditional serialization
        if (includeSalary) {
            oos.writeDouble(salary);
        } else {
            oos.writeDouble(0.0);
        }
    }

    // Custom deserialization
    private void readObject(ObjectInputStream ois)
            throws IOException, ClassNotFoundException {
        ois.defaultReadObject();

        // 👇 read based on what was written
        this.salary = ois.readDouble();
    }
}
