package DataStructureCode.ArrayDemo;

import java.util.Arrays;

public class RemoveDuplicate2
{

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is " + k);
        System.out.println(Arrays.toString(arr));
    }

    public static int removeDuplicates(int[] nums)
    {
        if (nums.length <= 2)
        {
            return nums.length;
        }
        int i = 1;
        int count = 1;

        for (int j = 1; j < nums.length; j++)
        {
            if (nums[j] == nums[j - 1])
            {
                count++;
            } else
            {
                count = 1; // Reset count for new element    int[] arr = {1,2,3};
            }

            if (count <= 2)
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; // Return the new length

    }
}
