package DataStructureCode.Intervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappiingIntervals
{
    public static void main(String[] args)
    {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        System.out.println(eraseOverlapIntervals(intervals));
    }

    public static int eraseOverlapIntervals(int[][] intervals)
    {
        int count = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int lastEndTime = intervals[0][1];
        for (int i = 1; i < intervals.length; i++)
        {
            if (intervals[i][0] < lastEndTime)
            {
                // Overlapping case: Remove this interval
                count++;
            } else
            {
                lastEndTime = intervals[i][1];
            }
        }
        return count;
//        int[][] sortedIntervals = Arrays.stream(intervals)
//                .sorted((a, b) -> Integer.compare(a[1], b[1]))
//                .toArray(int[][]::new);

    }
}
