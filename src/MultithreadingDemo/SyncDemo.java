package MultithreadingDemo;
class Counter{
    volatile int count;
    public synchronized void increment(){
        count++;
    }
}
public class SyncDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() ->
        {

            for (int i = 0; i < 1000; i++){
                c.increment();
//                try { Thread.sleep(1000);} catch (Exception ignored) {
//                }
                }
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 0; i < 1000; i++){
               c.increment();
//                try { Thread.sleep(1000);} catch (Exception ignored) {
//                }
            }
        });

        t1.start();
     //   try{Thread.sleep(10);} catch(Exception ignored){}
        t2.start();
        // System.out.println(t1.isAlive());

        t1.join();
        t2.join();
        System.out.println("Count " + c.count);
     //   System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
