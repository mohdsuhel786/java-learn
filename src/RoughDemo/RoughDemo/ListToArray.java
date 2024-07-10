package JavaCodePrep.RoughDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListToArray {

    public static void main(String[] args) {
          List<Integer> list = Arrays.asList(1, 4, 3, 4, 5);
       // list.sort(Comparator.reverseOrder());  //reverse list
        //list.sort(Comparator.naturalOrder()); //sort the list
        //   Collections.sort(list);

        // List<Integer> slist=  list.stream().sorted().collect(Collectors.toList());

        
        // Convert list to int array using streams
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        int[] array2 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array2[i] = list.get(i);
        }
        for (int i : array2) {
            System.out.println(i);
        }
       
    }

}
