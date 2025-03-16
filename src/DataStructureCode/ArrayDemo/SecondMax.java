package DataStructureCode.ArrayDemo;

public class SecondMax
{
    public static void main(String[] args)
    {
        int[] arr = {-20, -4, -5, -1, -10}; //-1
        System.out.println(secondMax(arr));

    }

    public static int secondMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int sMax = 0;

        for (int i = 0; i < arr.length; i++)
        {
            ///20 ,-4,5
            if (max < arr[i])
            {
                sMax = max;
                max = arr[i];
            } else if (sMax < arr[i])
            {
                sMax = arr[i];
            }
        }
        return sMax;
    }
}
