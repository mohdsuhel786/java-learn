package StreamsApi;

import java.util.List;
import java.util.Objects;

public class Employee
{
    private String name;
    private List<Long> phoneNumber;
    private int age;
    private double salary;

    public Employee(String name, List<Long> phoneNumber, int age, double salary)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    public List<Long> getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(List<Long> phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return phoneNumber == employee.phoneNumber && age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, phoneNumber, age, salary);
    }
}
