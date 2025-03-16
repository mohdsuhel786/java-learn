package RoughDemo.RoughDemo;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar
{
    public static void main(String[] args)
    {
        String str = "aABB Ccd!";
        Character c = firstNonRepeatChar(str);
        System.out.println(c);
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        LinkedHashMap<Character, Long> map = str.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
        char s = map.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse('-');
        System.out.println(s);

    }

    public static Character firstNonRepeatChar(String str)
    {
        char result = '-';
        str = str.toLowerCase();
        int[] charCount = new int[256];
        for (char ch : str.toCharArray())
        {
            if (Character.isLetterOrDigit(ch))
            {
                charCount[ch]++;
            }
        }

        for (char ch : str.toCharArray())
        {
            if (Character.isLetterOrDigit(ch) && charCount[ch] == 1)
            {
                return ch;
            }
        }
        return result;
    }
}