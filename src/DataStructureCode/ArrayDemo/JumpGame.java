package DataStructureCode.ArrayDemo;

public class JumpGame
{
    public static void main(String[] args)
    {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
        System.out.println(jump(nums));
    }

    public static boolean canJump(int[] nums)
    {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i > maxReach)
            {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1)
            {
                return true;
            }
        }
        return false;
    }

    public static int jump(int[] nums)
    {
        int minReach = 0;
        int jump = 0;
        int currReach = 0;
        for (int i = 0; i < nums.length - 1; i++)
        {
            minReach = Math.max(minReach, i + nums[i]);
            if (i == currReach)
            {
                jump++;
                currReach = minReach;
            }
        }
        return jump;
    }
}
