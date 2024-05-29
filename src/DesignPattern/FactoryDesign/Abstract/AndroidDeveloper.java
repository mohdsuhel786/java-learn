package DesignPattern.FactoryDesign.Abstract;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        return "ANDROID DEVELOPER";
    }
}
