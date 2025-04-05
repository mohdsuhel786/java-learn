package StreamsApi;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstRepeatingChar
{
    public static void main(String[] args)
    {
        String s = "swiwss";
        //   Find the first repeating character
        Set<Character> seen = new HashSet<>();
        Character firstRepeating = s.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> !seen.add(ch)) // If add() returns false, it's a duplicate
                .findFirst()
                .orElse(null);

        System.out.println(firstRepeating);


        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Iterate over characters and count occurrences
        Character firstRepeatingChar = s.chars()
                .mapToObj(c -> (char) c)
                .filter(ch ->
                {
                    charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1); // Increase the count
                    return charCountMap.get(ch) > 1;  // Check if this character repeats
                })
                .findFirst()
                .orElse(null);  // Return null if no repeating character is found

        System.out.println(firstRepeatingChar);  // Expected Output: 'w'


    }
}
