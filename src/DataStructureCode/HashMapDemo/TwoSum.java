package DataStructureCode.HashMapDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main(String[] args)
    {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target)
    {
        int[] result = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int comp = target - nums[i];
            if (map.containsKey(comp))
            {
                result[0] = map.get(comp);
                result[1] = i;
                return result;
            }

            map.put(nums[i], i);
        }

        return result;
    }
}
