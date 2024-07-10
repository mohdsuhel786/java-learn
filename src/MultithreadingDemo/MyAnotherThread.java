package MultithreadingDemo;

public class MyAnotherThread extends Thread{
    synchronized public void run(){
        for(int i = 0; i<=50; i++){
            System.out.println("value of another i is " +i + currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }

        }
    }

}
