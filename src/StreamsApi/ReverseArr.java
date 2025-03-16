package StreamsApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArr
{
    public static void main(String[] args)
    {
        // Collections reverse
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 5);
        Collections.reverse(list);
        System.out.println(list);

        Integer[] arr = {1, 2, 3, 4, 5, 5, 4};
        Object[] revArr = IntStream.range(1, arr.length + 1).mapToObj(e -> arr[arr.length - e]).toArray();
        System.out.println(Arrays.toString(revArr));
    }
}
