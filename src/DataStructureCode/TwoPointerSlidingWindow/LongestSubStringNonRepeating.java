package DataStructureCode.TwoPointerSlidingWindow;

import java.util.HashMap;

public class LongestSubStringNonRepeating
{
    public static void main(String[] args)
    {
        String str = "abcabcbb";
        findSubString(str);
    }


    public static void findSubString(String str)
    {
        int maxLength = 0;
        int l = 0;
        int r = 0;
        int n = str.length();
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (r < n)
        {

            if (map.containsKey(str.charAt(r)))
            {
                l = Math.max(map.get(str.charAt(r)) + 1, l);
            }

            map.put(str.charAt(r), r);

            //  maxLength = Math.max(r-l+1,maxLength);
            if (r - l + 1 > maxLength)
            {
                maxLength = r - l + 1;
                start = l;
            }
            r++;
        }
        System.out.println(str.substring(start, start + maxLength));
        System.out.println(maxLength);

    }
}

