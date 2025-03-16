package DataStructureCode.StackDemo;

public class TrappingRainWater
{

    public static void main(String args[])
    {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("The duplicate element is " + trap(arr));
    }

    private static int trap(int[] arr)
    {
        int trap = 0;
        int l = 0;
        int r = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        while (l <= r)
        {

            if (arr[l] <= arr[r])
            {
                if (leftMax <= arr[l])
                {
                    leftMax = arr[l];
                } else
                {
                    trap += leftMax - arr[l];
                }
                l++;
            } else
            {
                if (rightMax <= arr[r])
                {
                    rightMax = arr[r];
                } else
                {
                    trap += rightMax - arr[r];
                }
                r--;
            }

        }


        return trap;
    }
}
