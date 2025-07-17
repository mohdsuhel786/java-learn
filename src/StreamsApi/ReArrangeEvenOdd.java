package StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReArrangeEvenOdd {

    public static void main(String[] args)
    {
        Integer[] arr3 = {7,10, 31, 6, 1, 2, 2, 3, 4, 4, 5};
        System.out.println(rearrangeEvenOdd(arr3));
    }

    public static List<Integer> rearrangeEvenOdd(Integer[] arr)
    {
        return Arrays.stream(arr)
                .sorted((a, b) -> Integer.compare(a % 2, b % 2)) // Sort: evens first, then odds
                .collect(Collectors.toList());
    }
}
