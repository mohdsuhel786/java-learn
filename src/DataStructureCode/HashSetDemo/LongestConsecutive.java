package DataStructureCode.HashSetDemo;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive
{
    public static void main(String[] args)
    {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int val = 2;
        System.out.println(longestConsecutive(nums));
        // System.out.println(Arrays.toString(nums));
    }

    public static int longestConsecutive(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
        {
            set.add(num);
        }
        int maxLen = 0;
        for (int num : set)
        {
            if (!set.contains(num - 1))
            {
                int count = 1;
                while (set.contains(num + count))
                {
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

}