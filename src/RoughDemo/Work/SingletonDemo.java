package RoughDemo.Work;


public class SingletonDemo
{
    private volatile static SingletonDemo instance;

    private SingletonDemo()
    {
        if (instance != null)
        {
            throw new RuntimeException("trying to break");
        }
    }

    public static SingletonDemo getSingleton()
    {

        if (instance == null)
        {

            synchronized (SingletonDemo.class)
            {
                if (instance == null)
                {
                    instance = new SingletonDemo();
                }
            }


        }

        return instance;
    }

}
