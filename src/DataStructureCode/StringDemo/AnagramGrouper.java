package DataStructureCode.StringDemo;

import java.util.*;

public class AnagramGrouper
{
    public static Set<Set<String>> groupAnagrams(List<String> words)
    {
        Map<String, Set<String>> anagramMap = new HashMap<>();

        for (String word : words)
        {
            // Sort characters in the word to form a key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Add word to corresponding anagram set
            anagramMap.computeIfAbsent(sortedWord, k -> new HashSet<>()).add(word);
        }

        // Convert values to a set of sets
        return new HashSet<>(anagramMap.values());
    }

    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("cat", "dog", "god");
        Set<Set<String>> groupedAnagrams = groupAnagrams(words);
        System.out.println(groupedAnagrams);
    }
}
