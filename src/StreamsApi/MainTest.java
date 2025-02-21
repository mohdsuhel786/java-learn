package StreamsApi;

import java.util.*;
import java.util.stream.Collectors;

public class MainTest
{
    public static void main(String[] args)
    {
//        SingletonDemo singletonDemo = SingletonDemo.getSingleton();
//        System.out.println(singletonDemo.hashCode());
//        SingletonDemo singletonDemo2 = SingletonDemo.getSingleton();
//        System.out.println(singletonDemo2.hashCode());

        List<Employee> empList = Arrays.asList(new Employee("emp1", Arrays.asList(91523456L, 12455854L), 30, 20000.00),
                new Employee("emp2", Arrays.asList(91523457L, 12455855L), 30, 30000.00),
                new Employee("emp3", Arrays.asList(91523457L, 12455855L), 30, 30000.00));

//        empList.stream().flatMap(emp -> emp.getPhoneNumber().stream())
//                .filter(phone -> phone.toString().startsWith("9"))
//                .distinct()
//                .sorted()
//                .toList()
//                .forEach(System.out::println);

        empList.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue)))
                .forEach(System.out::println);
    }
}
