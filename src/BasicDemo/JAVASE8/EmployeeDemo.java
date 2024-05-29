package BasicDemo.JAVASE8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

    static class Employee{
        String name;
        int age;
        double salary;

        public Employee(String name, int age, double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }


    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee("AEmp1",26,13099.10);
        Employee e2 = new Employee("ZEmp1",29,20099.10);
        Employee e3 = new Employee("CEmp1",30,19099.10);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);


      //  List<Employee> list = employees.stream().filter(e -> e.salary > 15000.00).sorted((o1, o2) -> o1.name.compareToIgnoreCase(o2.name)).toList();

//        for(Employee e : list){
//            System.out.println(e.name +" " +e.salary);
//        }

        //

//      List<Employee> list2  =  employees.stream().filter(e  -> e.age ).collect(Collectors.toList());
//      int sum = 0;
//      int  l = list2.size();
//      for(Employee ec : list2){
//          sum += ec.age;
//      }
//        System.out.println(sum/l);
   }
}
