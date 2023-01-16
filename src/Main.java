import java.util.*;
class Main{



    public static void main(String[] args){
       //Here we have to Make an array list to store Employee Object

    ArrayList eList = new ArrayList();
        Employee e1 = new Employee();
        ArrayList<String> projects = new ArrayList<>(2);
        projects.add("P1");
        projects.add("P2");
        //projects = {"p1","p2"};
        e1.setName("yogesh");

        e1.setPList(projects);
        Employee e2 = new Employee();
        ArrayList<String> project2 = new ArrayList<>(2);
        project2.add("P3");
        project2.add("P2");
        //projects = {"p1","p2"};
        e2.setName("yogesh J");

        e2.setPList(project2);

        eList.add(e1);
        eList.add(e2);
        System.out.println(eList);
    }

}


class Employee{

    public String name;
    public int id;
    public String address;
    //Hello How are you!

    public List<String> pList = new ArrayList<>();


    public String getName(){
        return name;
    }
    public void setName(String naam){

        this.name =  naam;

    }
    public ArrayList<String> getPList() {
        return new ArrayList<>(pList);
    }
    public void setPList(ArrayList<String> stringList){

        this.pList=  stringList;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", pList=" + pList +
                '}';
    }
}