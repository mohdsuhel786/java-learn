package DataStructureCode.GreedyAlgo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class JobSequence
{
    public static void main(String[] args) throws IOException
    {
        int[] deadline = {4, 1, 1, 1};
        int[] profit = {20, 10, 40, 30};

        ArrayList<Integer> res = jobSequencing(deadline, profit);
        System.out.println(res);

    }

    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit)
    {
        // code here
        int n = deadline.length;
        int maxDeadline = 0;
        int maxProfit = 0;
        int count = 0;

        for (int num : deadline)
        {
            maxDeadline = Math.max(maxDeadline, num);
        }
        Job[] arr = new Job[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = new Job(i, deadline[i], profit[i]);
        }


        int[] jobDay = new int[maxDeadline + 1];
        Arrays.fill(jobDay, -1);

        for (int i = 0; i < n; i++)
        {

            for (int j = arr[i].deadline; j > 0; j--)
            {

                // Free slot found
                if (jobDay[j] == -1)
                {
                    jobDay[j] = i;
                    count++;
                    maxProfit += arr[i].profit;
                    break;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(count);
        result.add(maxProfit);
        return result;
    }

    private Job[] jobs(int[] deadline, int[] profit, int n)
    {
        Job[] arr = new Job[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = new Job(i, deadline[i], profit[i]);
        }
        return arr;
    }

    public static class Job
    {
        int id, profit, deadline;

        Job(int x, int y, int z)
        {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
}
