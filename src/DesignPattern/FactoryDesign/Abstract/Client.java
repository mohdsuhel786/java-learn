package DesignPattern.FactoryDesign.Abstract;

public class Client {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getemployee(new AndroidDevFactory());
        int salary = emp.salary();
        String name = emp.name();
        System.out.println(name + " " +salary);
    }
}
