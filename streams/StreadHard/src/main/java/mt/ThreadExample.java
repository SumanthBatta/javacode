package mt;

import javax.swing.text.Style;

public class ThreadExample {
    public static void main(String[] args) {
        class MyThread extends Thread{

           public void run(){
               int count   = 0;
               while(true) {
                   count++;
                   try {
                       Thread.sleep(3000);


                   }
                   catch (InterruptedException e){
                       break;
                   }
                   if(count <4) {
                       System.out.println("hii");

                   }
                   else{
                       System.out.println("done");
                       break;
                   }

               }
            }


        }
        Thread t = new MyThread();
        t.start();
        System.out.println("Main thread: " + Thread.currentThread().getName());

    }

}
