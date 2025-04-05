package DataStructureCode.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval
{
    public static void main(String[] args)
    {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] result = insert(intervals, newInterval);
        Arrays.stream(result).map(Arrays::toString).forEach(System.out::print);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval)
    {
        List<int[]> list = new ArrayList<>();
        int i = 0, n = intervals.length;

        // Add all intervals that come before the newInterval
        while (i < n && intervals[i][1] < newInterval[0])
        {
            list.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        int start = newInterval[0], end = newInterval[1];
        while (i < n && intervals[i][0] <= end)
        {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        list.add(new int[]{start, end});

        // Add remaining intervals
        while (i < n)
        {
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[list.size()][]);
    }
}
