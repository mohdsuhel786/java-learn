package DataStructureCode.TwoPointerSlidingWindow;

import java.util.*;

public class findSubstring
{
    public static void main(String[] args)
    {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring(s, words));
    }


    public static List<Integer> findSubstring(String s, String[] words)
    {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return result;

        int wordLength = words[0].length();
        int numWords = words.length;
        int totalLength = wordLength * numWords;
        int sLength = s.length();

        // Create frequency map of words
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words)
        {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Check each possible window starting position
        for (int i = 0; i < wordLength; i++)
        {
            int left = i, right = i;
            int count = 0;
            Map<String, Integer> currentCount = new HashMap<>();

            while (right + wordLength <= sLength)
            {
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordCount.containsKey(word))
                {
                    currentCount.put(word, currentCount.getOrDefault(word, 0) + 1);
                    count++;

                    while (currentCount.get(word) > wordCount.get(word))
                    {
                        String leftWord = s.substring(left, left + wordLength);
                        currentCount.put(leftWord, currentCount.get(leftWord) - 1);
                        count--;
                        left += wordLength;
                    }

                    if (count == numWords)
                    {
                        result.add(left);
                    }
                } else
                {
                    // Reset window
                    currentCount.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return result;

    }
}
