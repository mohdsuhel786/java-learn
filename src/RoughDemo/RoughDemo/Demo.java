package RoughDemo.RoughDemo;


import java.util.*;

public class Demo
{

    public static void main(String[] args)
    {
        int[] nums = {0};

        int val = 1;
        System.out.println(longestSubSeq("   a "));
        // System.out.println( containsNearbyDuplicate( nums,val));
        // System.out.println(Arrays.toString(nums));
    }

    public static int longestSubSeq(String s)
    {
        int maxlen = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        for (int r = 0; r < s.length(); r++)
        {
            while (set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxlen = Math.max(maxlen, r - l + 1);
        }


        return maxlen;
    }
}