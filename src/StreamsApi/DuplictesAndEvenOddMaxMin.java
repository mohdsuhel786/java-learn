package StreamsApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplictesAndEvenOddMaxMin
{

//
//    Find the Duplicates using java 8 stream api from below list. Output: AA,BB,CC
//    List<String> list = Arrays.asList("AA","BB","CC","AA","BB","CC","D","E");


//
//    Find the Maximum Even number and minimum Odd number from below array. output: max even is 16 and odd is 1
//    Integer[] arr = new Integer[]{ 2,4,8,6,12,16,25,14,1,7,9}


    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("AA", "BB", "CC", "AA", "BB", "CC", "D", "E");
        findDuplicate(list);
//        System.out.println(result);
//
        Integer[] arr = new Integer[]{2, 4, 8, 6, 12, 16, 25, 14, 1, 7, 9};
//
//        Integer i = Arrays.stream(arr)
//                .filter(e -> e % 2 == 0)
//                .max(Integer::compareTo).orElse(0);
//        System.out.println(i);
//        Integer j = Arrays.stream(arr)
//                .filter(e -> e % 2 != 0)
//                .min(Integer::compareTo).orElse(0);
//        System.out.println(j);

        //   System.out.println( Arrays.stream(arr).filter(e ->e%2==0).mapToInt(e -> e).summaryStatistics().getMax()  );


//        int max = Arrays.stream(arr)
//                .distinct()
//                .filter(e ->e%2==0)
//                .mapToInt(Integer::intValue)
//                .max().orElse(-1);
//        System.out.println(max);
    }

    public static void findDuplicate(List<String> list)
    {
//        list.stream()
//                .filter(e -> Collections.frequency(list,e)>1)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        HashSet<String> unique = new HashSet<>();
        // Set<String> duplicates =
        list.stream()
                .filter(e -> !unique.add(e))
                .collect(Collectors.toSet()).forEach(System.out::println); //set of duplicates


        // unique.forEach(System.out::println);    //get a set no duplicate
    }
}
