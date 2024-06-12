package StreamsApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateValue {
  
   // Arrays.strea


    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,2,3,4,2,1,6,7,8,10,4,5,6);
        Map<Integer, Long> map = arr.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        List<Integer> list = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(list);

    }

}
