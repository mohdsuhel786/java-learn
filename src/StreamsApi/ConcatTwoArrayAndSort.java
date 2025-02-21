package StreamsApi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatTwoArrayAndSort
{

    public static void main(String[] args)
    {
        Integer[] arr = new Integer[]{5, 2, 4, 1, 3, 6};
        Integer[] arr2 = new Integer[]{7, 10, 8, 6, 9, 11};

        IntStream.concat(Arrays.stream(arr).mapToInt(Integer::intValue),
                        Arrays.stream(arr2).mapToInt(Integer::intValue))
                .sorted().toArray();
//        Integer [] arr  = new Integer[]{5,2,4,1,3,6};
//        Integer [] arr2  = new Integer[]{7,10,8,6,9,11};
//
//        IntStream.concat(Arrays.stream(arr).mapToInt(Integer::intValue), Arrays.stream(arr2).mapToInt(Integer::intValue)).sorted().toArray();
//        // Arrays.stream(arr).mapToInt(Integer::intValue).collect(Collectors.collectingAndThen(Arrays.stream(arr2).mapToInt(Integer::intValue),))


    }
}
