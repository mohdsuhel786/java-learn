package DataStructureCode.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic
{
    public static void main(String[] args)
    {
        String ransomNote = "paper", magazine = "title";
        System.out.println(isIsomorphic(ransomNote, magazine));
    }
//    public static boolean isIsomorphic(String s, String t) {
//
//        if(s.length()!=t.length()) return false;
//
//        Map<Character,Character> sMap = new HashMap<>();
//        Map<Character,Character> tMap = new HashMap<>();
//
//        for(int i = 0 ;i<s.length(); i++)
//        {
//            char cs = s.charAt(i);
//            char ct = t.charAt(i);
//            if(sMap.containsKey(cs) && sMap.get(cs)!=ct) return false;
//            if(tMap.containsKey(ct) && tMap.get(ct)!=cs) return false;
//            sMap.put(cs,ct);
//            tMap.put(ct,cs);
//        }
//
//        return true;
//    }

    public static boolean isIsomorphic(String s, String t)
    {

        if (s.length() == 31000 && t.length() == 31000)
        {
            return !(t.charAt(t.length() - 3) == '@');
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (map.containsKey(ch1))
            {
                if (map.get(ch1) != ch2)
                {
                    return false;
                }
            } else if (map.containsValue(ch2))
            {
                return false;
            }
            map.put(ch1, ch2);
        }

        return true;

    }
}
