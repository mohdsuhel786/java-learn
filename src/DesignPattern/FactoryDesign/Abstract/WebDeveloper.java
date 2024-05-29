package DesignPattern.FactoryDesign.Abstract;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 45000;
    }

    @Override
    public String name() {
        return "WEB DEVELOPER";
    }
}
