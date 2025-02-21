package DataStructureCode.SortingTechnique;

import java.util.Arrays;

public class QuickSortAlgo
{
    public static void main(String[] args)
    {
        int[] arr = {5, 4, 3, 2, 1, 7, 8, 1};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high)
    {
        if (low >= high)
        {
            return;
        }
        int left = low;
        int right = high;

        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        while (left <= right)
        {
            while (arr[left] < pivot)
            {
                left++;
            }
            while (arr[right] > pivot)
            {
                right--;
            }
            if (left <= right)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        quickSort(arr, low, right);
        quickSort(arr, left, high);
    }

}
