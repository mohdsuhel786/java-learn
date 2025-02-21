package RoughDemo.RoughDemo;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeating
{
    //find the second largest number
// find the sum of all the even no. using java 8
    public static void main(String[] args)
    {


//        int[] arr = new int[]{ 1, 2, 3, 4, 5,6,7,8,9,10};
//        Integer[] arr2 = new Integer[]{ 1, 2, 3, 4, 5,6,7,8,9,10};
//        int sum = Arrays.stream(arr).sum();
//        System.out.println(sum);
//
//       List<Integer> list = Arrays.asList( 1, 2, 3, 4, 5,6,7,8,9,10);
//
//        int sum2 = list.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

        List<String> list2 = Arrays.asList("C", "AA", "BB", "CC", "AA", "BB", "CC", "D", "E");
//        Map<String, Long> collect = list2.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//        Set<String> collect1 = list2.stream().filter(e -> Collections.frequency(list2, e) > 1).collect(Collectors.toSet());

        LinkedHashMap<String, Long> map = list2.stream().collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        String s = map.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse("_");
        System.out.println(s);
//        new LinkedHashMap<String, Integer>() {{
//            Set<String> seen = new HashSet<>();
//            list2.stream().filter(e -> !seen.add(e)).forEach(e -> putIfAbsent(e, list2.indexOf(e)));
//            entrySet().stream().findFirst().ifPresent(entry ->
//                    System.out.println("First repeating element: " + entry.getKey() + " at index " + entry.getValue()));
//        }};
        //  System.out.println(collect1);
//        Integer secondLargest = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(secondLargest);
//
//        long sum = list.stream().filter(e -> e % 2 == 0).mapToInt(e -> e).getSum();
//        System.out.println(sum);

    }


}
