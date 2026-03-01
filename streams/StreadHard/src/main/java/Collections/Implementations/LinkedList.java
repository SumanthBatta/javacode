package Collections.Implementations;

public class LinkedList {
    Node head;

    public void insert(int data){ //every insert new node
        Node node = new Node();
        node.data = data;
        node.next=  null;
        if(head == null){ //first node case
            head = node;
        }
        else{
           Node n = head;

           while(n.next!=null){
                n = n.next;
           }
           n.next = node;
        }

    }

    public void show(){
        Node node = head;
        while(node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void insertAtStart(int data){
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
    }
    public void insertAt(int index, int data){
        Node node  = new Node();
        node.data = data;
        node.next = null;

        if(index==0){
            insertAtStart(data);
            return;
        }
        Node n = head;
        for(int i = 0; i<index-1;i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }

    public void delete(int index){
        if(index==0){
            head = head.next;
            return;
        }
        Node n = head;

//        for(int i = 0; i<index;i++){
//            if(i==index-1) {
//                n.next = n.next.next;
//                break;
//            }
//            else{
//                n=n.next;
//            }
//        }
//        for(int i = 0; i<index-1;i++){
//            n = n.next;
//        }
//        n.next=n.next.next;
        Node n1 = null;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        n1 = n.next;
        n.next=n1.next;
//        System.out.println("n1 "+n1.data);
        n1=null;

    }
}
