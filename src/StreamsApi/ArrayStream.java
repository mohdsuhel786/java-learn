package StreamsApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayStream
{

    public static void main(String[] args)
    {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {3, 4, 5, 6};

        int[] arr = {1, 2, 3, 4, 5};
        Integer[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(arr, 2)));
        Integer[] arr3 = {1, 2, 2, 3, 4, 4, 5};
        int target = 9;
        System.out.println(findSecondLargest(arr4));
        System.out.println(findMissingNumber(arr, 6));
        System.out.println(removeDuplicates(arr3));
        System.out.println(Arrays.toString(mergeAndSort(arr1, arr2)));
        System.out.println(findIntersection(arr1, arr2));
        System.out.println(findUnion(arr1, arr2));
        System.out.println(rearrangeEvenOdd(arr3));
        System.out.println(findPairs(arr4, target));
        System.out.println(findDuplicates(arr4));
    }

    public static Integer findSecondLargest(Integer[] arr)
    {
        return Arrays.stream(arr)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    public static List<Integer> findUnion(Integer[] arr1, Integer[] arr2)
    {
        return Arrays.stream(arr1)
                .distinct()
                .collect(Collectors.toSet()) // Use Set to remove duplicates
                .stream()
                .collect(Collectors.toList());
    }


    public static List<Integer> findDuplicates(Integer[] arr)
    {
        Set<Integer> seen = new HashSet<>();
        return Arrays.stream(arr)
                .filter(n -> !seen.add(n)) // If add() returns false, it's a duplicate
                .distinct()
                .collect(Collectors.toList());
    }

    public static int findMissingNumber(int[] arr, int n)
    {
        int actualSum = IntStream.of(arr).sum();
        int expectedSum = IntStream.rangeClosed(1, n).sum();
        return expectedSum - actualSum;
    }

    public static List<Integer> rearrangeEvenOdd(Integer[] arr)
    {
        return Arrays.stream(arr)
                .sorted((a, b) -> Integer.compare(a % 2, b % 2)) // Sort: evens first, then odds
                .collect(Collectors.toList());
    }


    public static int[] mergeAndSort(Integer[] arr1, Integer[] arr2)
    {
        return IntStream.concat(Arrays.stream(arr1).mapToInt(Integer::intValue), Arrays.stream(arr2).mapToInt(Integer::intValue))
                .sorted()
                .toArray();
    }

    public static List<Integer> removeDuplicates(Integer[] arr)
    {
        return Arrays.stream(arr).distinct().collect(Collectors.toList());
    }

    public static int[] rotateArray(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        return IntStream.concat(Arrays.stream(arr, n - k, n), Arrays.stream(arr, 0, n - k))
                .toArray();
    }

    public static List<Integer> findIntersection(Integer[] arr1, Integer[] arr2)
    {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr1));
        return Arrays.stream(arr2)
                .filter(set::contains)
                .distinct()
                .collect(Collectors.toList());
    }


    public static List<List<Integer>> findPairs(Integer[] arr, int target)
    {
        Set<Integer> seen = new HashSet<>();
        return Arrays.stream(arr)
                .filter(n -> seen.add(target - n)) // Add the complement of n
                .map(n -> Arrays.asList(target - n, n))
                .collect(Collectors.toList());
    }


}