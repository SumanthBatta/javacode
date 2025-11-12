package serialization;
import java.io.*;
public class Test1 implements  Serializable {
    String name;
    int id;
    transient String pass;

    public Test1(String name, int id, String pass) {
        this.name = name;
        this.id = id;
        this.pass = pass;
    }

    public static void main(String[] args){

    }
}


