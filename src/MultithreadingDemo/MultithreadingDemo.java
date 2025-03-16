package MultithreadingDemo;

public class MultithreadingDemo implements Runnable
{


    public static void main(String[] args) throws InterruptedException
    {
        Thread t = new Thread(new MultithreadingDemo());
        t.start();

        Thread t2 = new Thread(new MultithreadingDemo());
        t2.start();
        ;

        t.join();
        t2.join();
    }

    @Override
    synchronized public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Hi calling from " + Thread.currentThread().getName());
            try
            {
                Thread.sleep(100);
            } catch (Exception ignored)
            {

            }
        }

    }
}
