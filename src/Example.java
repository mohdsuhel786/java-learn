import java.util.ArrayList;
import java.util.List;

public class Example {

   static List<Student> students = new ArrayList<>(); // 10

   static {
           int a = 10;
       List<Student> students = new ArrayList<>(); // 10

       students.add(
               new Student("Yogesh", "Lucknow", List.of("Project1", "Project2"))
       );

       students.add(
               new Student("Suhel", "Mumbai", List.of("Project2", "Project4"))
       );

       students.add(
               new Student("Rohan", "Delhi", List.of("Project4", "Project4"))
       );
   }

    public static void main(String[] args) {

        System.out.println("Students");

    }



}

class Student{
   private String name;
   private String address;
   private List<String> projects;

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getAddress() {
       return address;
   }

   public void setAddress(String address) {
       this.address = address;
   }

   public List<String> getProjects() {
       return projects;
   }

   public void setProjects(List<String> projects) {
       this.projects = projects;
   }

   public Student(String name, String address, List<String> projects) {
       this.name = name;
       this.address = address;
       this.projects = projects;
   }
   // I will add Student in the ArrayList of type Student with the help of this cons.

   @Override
   public String toString() {
       return "Student{" +
               "name='" + name + '\'' +
               ", address='" + address + '\'' +
               ", projects=" + projects +
               '}';
   }
}