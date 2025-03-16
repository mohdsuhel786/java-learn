package RoughDemo.RoughDemo;

import java.util.*;
import java.util.stream.Collectors;

public class Anagram
{
    public static void main(String[] args)
    {

//        Example 1:
//
//        Input: strs = ["eat","tea","tan","ate","nat","bat"] /// aet  ant
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");


//       words.stream().collect(Collectors.groupingBy(w -> w.chars()
//                       .sorted()
//                       .mapToObj(String::valueOf)
//                       .collect(Collectors.joining())
//               )).values().forEach(System.out::println);

//        Set<Set<String>> groupedAnagrams = groupAnagrams(words);
//        System.out.println(groupedAnagrams);
        System.out.println(groupAnagrams(words));
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

//    public static void groupAnagrams(List<String> words)
//    {
//        HashMap<String, Set<String>> anagramMap = new HashMap<>();
//
//        for (String word : words)
//        {
//            // Sort characters in the word to form a key
//            char[] chars = word.toCharArray();
//            Arrays.sort(chars);
//
//            String sortedWord = new String(chars);
//            // Add word to corresponding anagram set
//            anagramMap.computeIfAbsent(sortedWord, k -> new HashSet<>()).add(word);
//
//        }
////        Set<String> strings = anagramMap.keySet();
////        System.out.println(strings);
//        System.out.println(anagramMap.values());
//
////        for(Map.Entry<String, Set<String>> entry : anagramMap.entrySet()){
////            System.out.println(entry.getKey());
////            System.out.println(entry.getValue());
////        }
//    }


//    public static Set<Set<String>> groupAnagrams(List<String> words) {
//        Map<String, Set<String>> anagramMap = new HashMap<>();
//
//        for (String word : words) {
//            // Sort characters in the word to form a key
//            char[] chars = word.toCharArray();
//            Arrays.sort(chars);
//
//            String sortedWord = Arrays.toString(chars);
//            // Add word to corresponding anagram set
//            anagramMap.computeIfAbsent(sortedWord, k -> new HashSet<>()).add(word);
//
//        }
//
//        // Convert values to a set of sets
//        return new HashSet<>(anagramMap.values());
//    }


}
