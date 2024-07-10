package MultithreadingDemo;

public class ThreadLamdaDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->
        {

                for (int i = 0; i < 10; i++){
                    System.out.println("Hi");
                    try { Thread.sleep(1000);} catch (Exception ignored) {
                    }}
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 0; i < 10; i++){
                System.out.println("Hello");
                try { Thread.sleep(1000);} catch (Exception ignored) {
                }}
        });

        t1.start();
        try{Thread.sleep(10);} catch(Exception ignored){}
        t2.start();
       // System.out.println(t1.isAlive());

        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
