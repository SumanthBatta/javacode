package mt;

public class RunnableExample {
    public static void main(String[] args) {

        //using lambda
        Runnable task1 = () -> {
            System.out.println("The Lambda exusted : "+Thread.currentThread().getName());
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("The Anonymous class : "+Thread.currentThread().getName());
            }
        };

        class Threads implements Runnable{

            @Override
            public void run(){
System.out.println("Runnnable executed : "+Thread.currentThread().getName());
            }
        }

//order is diff everytime all thread work simultaneously

        Runnable task3 = new Threads();
        new Thread(task3,"TASK3").start();

        new Thread(task1,"TASK1").start();
        new Thread(task2,"TASK2").start();





    }

}
