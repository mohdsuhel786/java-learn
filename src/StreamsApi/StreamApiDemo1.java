package StreamsApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiDemo1 {

    public static void main(String[] args){
    Integer[] nums = {0,1,2,3,4,4,6,7,6,10,20,30,15,10,2};
        List<Integer> list = Arrays.asList(nums);
        // sum of numbers
        Integer sum = Arrays.stream(nums).reduce((a, b) -> (a + b)).get();
        System.out.println(sum);

        // Average of numbers
        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);

        // Square of each number and filter number greater than 100

        List<Integer> sqrtNum = list.stream()
                .map(e -> e * e)
                .filter(e -> e > 100)
                .collect(Collectors.toList());
        System.out.println(sqrtNum);

        //odd even numbers
        List<Integer> evenNumber = list.stream().filter(e -> e % 2 == 0)
                .toList();
        System.out.println(evenNumber);
        List<Integer> oddNumber = list.stream().filter(e -> e % 2 == 1)
                .toList();
        System.out.println(oddNumber);
        
        // print number startWith

        List<Integer> startsWith2 = list.stream()
                .map(String::valueOf)
                .filter(e -> e.startsWith("2"))
                .map(Integer::valueOf)
                .toList();
        System.out.println(startsWith2);


        // find Duplicate numbers
        Set<Integer> duplicate = list.stream()
                .filter(e -> Collections.frequency(list, e) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicate);

        //or
        Set<Integer> dupNumber = new HashSet<>();
        List<Integer> dup = list.stream()
                .filter(e -> !dupNumber.add(e)).toList();
        System.out.println(dup);

        // find max and min
        Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
        Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);

        //sort numbers
        List<Integer> sorted = list.stream().sorted().toList();
        System.out.println(sorted);
        List<Integer> sortedDesc = list.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(sortedDesc);

        //limit
        List<Integer> limitGet = list.stream().limit(5).toList();
        System.out.println(limitGet);
        //Skip
        List<Integer> skip = list.stream().skip(5).toList();
        System.out.println(skip);
        
        //second lowest
        Integer numL = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(numL);
        //second highest
        Integer numH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(numH);
    }
}
