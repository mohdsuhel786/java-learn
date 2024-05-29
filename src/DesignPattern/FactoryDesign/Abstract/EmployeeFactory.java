package DesignPattern.FactoryDesign.Abstract;

public class EmployeeFactory {
    public static Employee getemployee(EmployeeAbstractFactory factory)
    {
        return factory.createEmployee();
    }
}
