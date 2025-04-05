package DataStructureCode.GreedyAlgo;

import java.util.Arrays;

public class AssignCoockie
{
    public static void main(String[] args)
    {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s)
    {
        int l = 0;
        int r = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (l < s.length && r < g.length)
        {

            if (g[l] >= s[r])
            {
                r++;
            }
            l++;
        }
        return r;
    }
}
