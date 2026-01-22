package FuncInterface;

public class Test {

    public static void main(String[] args) {
        System.out.println(operate(5,6,(a,b) -> a + b));
    }

    public static int operate(int a, int b, Operation op){
       return  op.calculate( a,  b);
    }
}

//Use functional interface when:
//
//        ✔ You need only one abstract method
//✔ You want to use lambda expressions
//✔ You want to pass logic as argument
//✔ You want short, clean, readable code
//✔ You are working with Streams, Collections, Threads