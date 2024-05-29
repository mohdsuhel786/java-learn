package DesignPattern.SingletonDesign;



import java.lang.reflect.Constructor;

public class BreakSingletonTest {

    public static void main(String[] args) throws CloneNotSupportedException {
       Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = null;

        // break using reflection  get constructor
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();

                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Singleton) constructor.newInstance();


        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

        //

        // break using cloning
        Singleton s2 = (Singleton) instanceOne.clone();
        System.out.println(s2.hashCode());
    }




}