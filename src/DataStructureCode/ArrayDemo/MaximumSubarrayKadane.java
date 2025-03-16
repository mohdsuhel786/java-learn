package DataStructureCode.ArrayDemo;

public class MaximumSubarrayKadane
{

    public static void main(String[] args)
    {
        int[] arr = {-20, -4, -5, -1, -10}; //-1
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums)
    {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            maxi = Math.max(sum, maxi);
//            if(sum > maxi){
//                maxi = sum;
//            }
            if (sum < 0)
            {
                sum = 0;
            }
        }
        return maxi;
    }
}
