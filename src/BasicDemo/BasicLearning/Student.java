package BasicDemo.BasicLearning;

import java.util.HashSet;
import java.util.Objects;

class Student {
    private final int id;
    private final String name;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student s = (Student) o;
            return s.id == this.id;
        }
        return false;
    }
}
 class UpdateHashSet {
    public static void main(String[] args) {
        HashSet<Student> studentList = new HashSet<>();
        Student st1 = new Student("Nimit", 1);
        Student st2 = new Student("Rahul", 3);
        Student st3 = new Student("Nimit", 2);
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        System.out.println(studentList.size());
       // st1.id = 3;
        System.out.println(studentList.size());
 studentList.forEach(System.out::println);
    }
}