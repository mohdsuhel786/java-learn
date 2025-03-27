package DataStructureCode.ArrayDemo;

import java.util.Arrays;

public class HIndex
{
    public static void main(String[] args)
    {
        int[] citations = {1, 3, 1};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations)
    {

        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++)
        {
            int h = n - i;
            if (citations[i] >= h)
            {
                return h;
            }
        }

        return 0;
    }
}
