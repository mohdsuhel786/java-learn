package StreamsApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIDemo
{

    public static void main(String[] args)
    {
        int[] arr = {0, 1, 2, 2, 3, 4, 4, 5};
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        int[] arr2 = list1.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(getSecondHighest(arr));
        System.out.println(getDuplicate(arr));
    }

    public static int getSecondHighest(int[] arr)
    {
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        int result = Arrays.stream(arr).sorted().skip(1).findFirst().orElse(-1);
        int[] reverselist1 = list.stream().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(reverselist1));
        return result;
    }

    public static Set<Integer> getDuplicate(int[] arr)
    {
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        return list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
    }
}
