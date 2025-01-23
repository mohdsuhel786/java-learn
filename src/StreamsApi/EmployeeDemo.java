package StreamsApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeDemo {
    private int id;
    private String name;
    private int salary;
    private String gender;

    // third highest Salary using stream api


    public EmployeeDemo(int id, String name, int salary, String gender)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        List<EmployeeDemo> list = new ArrayList<>();
        EmployeeDemo emp1 = new EmployeeDemo(1,"name1",10000,"Male");
        EmployeeDemo emp2 = new EmployeeDemo(2,"name2",20000,"Female");
        EmployeeDemo emp3 = new EmployeeDemo(3,"name3",30000,"Female");
        EmployeeDemo emp4 = new EmployeeDemo(4,"name4",40000,"Female");
       list.add(emp1);
       list.add(emp2);
       list.add(emp3);
       list.add(emp4);
//
//        System.out.println(list);
//        Optional<EmployeeDemo> optional = list.stream().sorted(Comparator.comparingInt(EmployeeDemo::getSalary).reversed()).skip(2).findFirst();
//        System.out.println(optional.get().name);
 long empCount =  list.stream().filter(emp -> emp.gender.equals("Female")).count();
        System.out.println(empCount);
    }
}
