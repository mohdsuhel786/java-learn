package DataStructureCode.ArrayDemo;

import java.util.Arrays;

public class ProductExceptSelf
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for (int i = 1; i < n; i++)
        {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--)
        {
            answer[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return answer;
    }


    public static int[] productExceptSelf1(int[] nums)
    {
        int n = nums.length;
        int[] result = new int[n];
        int prod = 1;
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (nums[i] == 0)
            {
                count += 1;

            } else
            {
                prod *= nums[i];
            }

        }
        System.out.println(count + " " + prod);
        for (int i = 0; i < n; i++)
        {
            if (count == 0)
            {
                result[i] = prod / nums[i];
            } else
            {
                if (nums[i] == 0 && count == 1)
                {
                    result[i] = prod;
                }
            }
        }
        return result;
    }
}
