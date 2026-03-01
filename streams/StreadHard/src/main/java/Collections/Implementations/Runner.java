package Collections.Implementations;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(45);
        list.insert(12);

        list.insertAtStart(2);
        list.insertAt(0,3);
        list.show();
        System.out.println("--------");
        list.delete(2);
        list.show();
    }
}
