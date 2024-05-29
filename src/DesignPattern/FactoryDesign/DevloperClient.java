package DesignPattern.FactoryDesign;

public class DevloperClient {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary = emp.salary();
        System.out.println(salary);
    }
}
