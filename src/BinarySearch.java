import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinarySearch {
    public static void main(String[] args) {
       String[] arr = {"car", "water", "whiskey","wire","switch"};
      //  ArrayList<String> narr = new ArrayList<>();
    //    for(int i = 0; i< arr.length;i++){
      
    //     for( int j = i; j< arr.length; j++){
    //         if( arr[i].length() > arr[j].length()){
    //             String temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }

    //    }

     

    //    }

     

       Arrays.sort(arr,Comparator.comparingInt(String :: length).reversed());
      // Arrays.sort(arr,Comparator.reverseOrder());
      //List<String> st=  Arrays.stream(arr).sorted((e1,e2) -> e1.length() - e2.length()).collect(Collectors.toList());
       System.out.println(Arrays.toString(arr));
      //System.out.println(st);
       
    }
}
