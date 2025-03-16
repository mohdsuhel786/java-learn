package DataStructureCode.HashMapDemo;

import java.util.*;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Anagram
{
    public static void main(String[] args)
    {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

//               words.stream().collect(Collectors.groupingBy(w -> w.chars()
//                       .sorted()
//                       .mapToObj(String::valueOf)
//                       .collect(Collectors.joining())
//               )).values().forEach(System.out::println);
        List<List<String>> values = words.stream().collect(Collectors.groupingBy(w -> w.chars()
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
        )).values().stream().toList();

        System.out.println(groupAnagrams(words));
    }

    public static boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length()) return false;
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }
        for (int num : alpha)
        {
            if (num != 0) return false;
        }
        return true;
    }

    public static List<List<String>> groupAnagrams(List<String> strs)
    {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : strs)
        {
            // Sort characters in the word to form a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortedWord = Arrays.toString(chars);
            // Add word to corresponding anagram set
            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);

        }

        // Convert values to a set of sets
        return new ArrayList<>(anagramMap.values());
    }

}
