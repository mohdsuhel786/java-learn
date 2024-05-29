package DesignPattern.SingletonDesign;

public class SingletonLazy {

    // create private static variable for global point of access
    private static SingletonLazy singleton;
    // private constructor
    private SingletonLazy(){
        System.out.println(" constructor");
    }

    // Lazy way of creating single object
    public static SingletonLazy getSingleton(){
        if( singleton == null){
             singleton = new SingletonLazy();
        }
        return singleton;
    }

    public static void main(String[] args) {


        //Singleton singleton2 = new Singleton();
        SingletonLazy singleton1 = getSingleton();
        System.out.println(singleton1.hashCode());
        SingletonLazy singleton2 = getSingleton();
        System.out.println(singleton2.hashCode());

    }
}
