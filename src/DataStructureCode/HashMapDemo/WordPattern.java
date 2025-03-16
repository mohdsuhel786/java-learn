package DataStructureCode.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class WordPattern
{
    public static void main(String[] args)
    {
        String ransomNote = "abba", magazine = "dog dog dog dog";
        System.out.println(wordPattern(ransomNote, magazine));
    }

    public static boolean wordPattern(String pattern, String s)
    {

        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length)
        {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++)
        {
            char ch1 = pattern.charAt(i);
            String ch2 = sArr[i];
            if (map.containsKey(ch1))
            {
                if (!map.get(ch1).equals(ch2))
                {
                    return false;
                }
            } else if (map.containsValue(ch2))
            {
                return false;
            }
            map.put(ch1, ch2);
        }
        System.out.println(map);
        return true;
    }
}
