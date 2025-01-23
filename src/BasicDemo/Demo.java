package BasicDemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo {

//    element in an array of integers
//
//    Given an array of integers arr[], The task is to find the index of first repeating element in it i.e.
//    the element that occurs more than once and whose index of the first occurrence is the smallest.
//
//            Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
//    Output: 5
//    Explanation: 5 is the first element that repeats
//

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

      //  int result = searchHash(arr);
        int result = searchRepeat(arr);
        System.out.println(arr[result]);

    }
//    public static int search(int[] arr){
//        int len = arr.length;
//        for(int i = 0;i<len;i++){
//            for(int j = i+1;j<len;j++){
//                if(arr[i] ==arr[j]){
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }

    public static int searchHash(int[] arr){

        int result = arr.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i = arr.length-1;i>=0;i--){
            if(set.contains(arr[i]) ){

                result = Math.min(result,i);
            }
            else{
                set.add(arr[i]);

            }
        }

        return result;
    }
    public static int searchRepeat(int[] arr)
    {

        // Create a map to store the first occurrence of each element
        Map<Integer, Integer> elementIndexMap = new HashMap<>();

        // Use streams to find the first repeating element
        return IntStream.range(0, arr.length)
                .filter(i -> {
                    // Check if the element is already in the map
                    if (elementIndexMap.containsKey(arr[i])) {
                        return true; // It's a repeating element
                    } else {
                        // Store the index of first occurrence
                        elementIndexMap.put(arr[i], i);
                        return false; // Not a repeating element
                    }
                })
                .map(i -> elementIndexMap.get(arr[i])) // Get the first occurrence index of the repeating element
                .findFirst() // Find the smallest index of the repeating element
                .orElse(-1); // If no repeating element is found, return -1
    }
//
//        Map<Integer, Integer> elementIndexMap = new LinkedHashMap<>();
//
//        // Traverse the array and store the element's first occurrence index
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (!elementIndexMap.containsKey(arr[i]))
//            {
//                elementIndexMap.put(arr[i], i); // Store the index of the first occurrence
//            } else
//            {
//                // Repeating element found, return its stored index
//                return elementIndexMap.get(arr[i]);
//            }
//        }
//
//        // If no repeating element is found, return -1
//        return -1;
//        }
}
