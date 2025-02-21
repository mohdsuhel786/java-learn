package StreamsApi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeating
{

    public static char firstNonRepeatingChar(String s)
    {
        Map<Character, Long> charCount = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        return charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('_');
    }


    public static void main(String[] args)
    {
        System.out.println(firstNonRepeatingChar("swiss")); // Output: w
    }
}
