package DesignPattern.SingletonDesign;

public class Singleton {

    private volatile static Singleton instance;

    private Singleton(){
        if(instance !=null){
            throw new RuntimeException("trying to break singleton");
        }
    }

    public static Singleton getInstance(){
        if(instance == null){

            synchronized (Singleton.class){
                if(instance == null){
                     instance = new Singleton();
                }
            }
        }

        return instance;
    }
    // prevent deserialization break
    public Object readResolve(){
        return instance;
    }
    // prevent cloning

    @Override
    public Object clone() throws CloneNotSupportedException{
        return instance;
    }





    public static void main(String[] args){

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.hashCode());


    }
}
