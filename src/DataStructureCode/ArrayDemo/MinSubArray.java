package DataStructureCode.ArrayDemo;

public class MinSubArray
{
    public static void main(String[] args)
    {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int target, int[] nums)
    {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        if (n == 0)
        {
            return 0;
        }
        boolean isFound = false;
        int l = 0;
        int sum = 0;
        for (int r = 0; r < n; r++)
        {
            sum += nums[r];
            while (sum >= target)
            {
                minLen = Math.min(minLen, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
//        min len = 0;
//
//        start from l= 0-n-1; r = 0;
//        if sum is < target == increase right
//
//        while(r!=n &&  sum<target){
//            if sum is >= target = > count len min(min,l-r)
//
//            l ++, r=l;
//            return minLen;

}
