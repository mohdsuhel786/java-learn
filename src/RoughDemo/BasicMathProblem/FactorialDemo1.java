
import java.util.ArrayList;

public class FactorialDemo1 {

    public static ArrayList<Long> fact(Long n){
        ArrayList<Long> list = new ArrayList<>();
        Long a = 1L;
        Long b = 2L;
        Long c= a * b;
        
        if(n>=2 ){
            list.add(a);
        }

        return list;
    }

    public static void main(String[] args) {
        Long n = 3L;
       ArrayList<Long> l =  fact(n);
       for(Long i: l){
        System.out.println(i);
       }

    }

}
