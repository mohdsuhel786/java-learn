package RoughDemo.RoughDemo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo
{


    public static void main(String[] args)
    {
        Integer[] arr3 = {10, 31, 6, 1, 2, 2, 3, 4, 4, 5};
        System.out.println(rearrangeEvenOdd(arr3));
    }

    public static List<Integer> rearrangeEvenOdd(Integer[] arr)
    {
        return Arrays.stream(arr)
                .sorted((a, b) -> Integer.compare(a % 2, b % 2)) // Sort: evens first, then odds
                .collect(Collectors.toList());
    }


}