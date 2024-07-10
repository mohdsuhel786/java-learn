package MultithreadingDemo;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class MyThread implements Runnable{
    @Override
   synchronized public void run() {

        for(int i = 0; i<=50; i++){
            System.out.println("value of i is " +i + currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                
            }

        }
        
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new MyAnotherThread();
        t1.start();
        try{
            Thread.sleep(100);
        }
        catch (Exception ignored) {}
        //  Thread.sleep(1000);
        t2.start();
      //  Thread.sleep(1000);

    }
}
