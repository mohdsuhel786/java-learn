package RoughDemo.RoughDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort
{

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 8, 9, 4, 5, 10, 7};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr, int low, int mid, int high)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int right = mid + 1;
        int left = low;
        while (left <= mid && right <= high)
        {
            if (arr[left] <= arr[right])
            {
                list.add(arr[left]);
                left++;
            } else
            {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid)
        {
            list.add(arr[left]);
            left++;
        }
        while (right <= high)
        {
            list.add(arr[right]);
            right++;
        }

        for (int i = 0; i < list.size(); i++)
        {
            arr[low + i] = list.get(i);
        }
    }


    public static void mergeSort(int[] arr, int low, int high)
    {

        if (low >= high)
        {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }


}
