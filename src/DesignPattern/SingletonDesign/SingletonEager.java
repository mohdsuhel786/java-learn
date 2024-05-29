package DesignPattern.SingletonDesign;

public class SingletonEager {
    // Eager way of creating singleton
    private static SingletonEager singleton = new SingletonEager();

    public static SingletonEager getInstance(){
        return singleton;
    }

    public static void main(String[] args) {

    SingletonEager singletonEager1 = getInstance();
    System.out.println(singletonEager1.hashCode());

    SingletonEager singletonEager2 = getInstance();
    System.out.println(singletonEager2.hashCode());

    }
}
