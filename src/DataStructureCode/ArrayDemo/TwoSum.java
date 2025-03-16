package DataStructureCode.ArrayDemo;

import java.util.*;

public class TwoSum {
    public static String twoSum(int n, int []arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                //sum = arr[left] + arr[right]
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }

    public static int[] twoSumMap(int n, int []arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = Integer.MIN_VALUE;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        //    String ans = twoSum(n, arr, target);

        int[] ans = twoSumMap(n, arr, target);
        System.out.println("This is the answer for variant 1: " + Arrays.toString(ans));


    }

}