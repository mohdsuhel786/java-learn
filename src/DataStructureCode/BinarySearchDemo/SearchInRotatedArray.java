package DataStructureCode.BinarySearchDemo;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {5,6,7,1,2,3,4};
        int target = 3;
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Peek element " + search(arr, target, low, high));
    }


    public static int search(int[] arr, int target, int low, int high)
    {
        if (low > high)
        {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
        {
            return mid;
        }

        if (arr[low] <= arr[mid])
        {
            if (arr[low] <= target && target <= arr[mid])
            {
                return search(arr, target, low, mid - 1);
            } else
            {
                return search(arr, target, mid + 1, high);
            }

        }

        if (target >= arr[mid] && arr[high] >= target)
        {
            return search(arr, target, mid + 1, high);
        }
        return search(arr, target, low, mid - 1);
    }
}
