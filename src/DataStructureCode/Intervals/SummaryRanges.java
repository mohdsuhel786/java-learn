package DataStructureCode.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 9, 10, 13};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums)
    {
        List<String> list = new ArrayList<>();
        if (nums.length == 0)
        {
            return list;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++)
        {
            int start = i;
            sb.append(nums[i]);
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1])
            {
                i++;
            }
            if (start != i)
            {
                System.out.println(sb);
                sb.append("->");
                sb.append(nums[i]);
            }

            list.add(sb.toString());
            sb.setLength(0);

        }
        return list;
    }

    public static List<String> summaryRange(int[] nums)
    {
        List<String> list = new ArrayList<>();
        if (nums.length < 1)
        {
            return list;
        }
        if (nums.length == 1)
        {
            list.add("" + nums[0]);
            return list;
        }
        int start = nums[0];
        int last = nums[0];
        String s = "";
        for (int i = 1; i < nums.length; i++)
        {    // input:   {0,2,3,4,6,8,9};   out:["0","2->4","6","8->9"]
            System.out.println(start + " " + last + " " + nums[i]);
            if (last + 1 != nums[i] && last != start)
            {
                s = start + "->" + last;
                list.add(s);
                start = nums[i];
            } else if (last + 1 != nums[i] && last == start)
            {
                s = "" + start;
                list.add(s);
                start = nums[i];
            } else if (last != nums[i] && i == nums.length - 1)
            {
                last = nums[i];
                s = start + "->" + last;
                list.add(s);
                start = nums[i];
            }
            if (last != nums[i] && i == nums.length - 1)
            {
                s = "" + start;
                list.add(s);
                start = nums[i];
            }

            last = nums[i];
        }
        return list;
    }
}
