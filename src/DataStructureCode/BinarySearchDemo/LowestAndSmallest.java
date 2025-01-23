package DataStructureCode.BinarySearchDemo;

public class LowestAndSmallest {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7, 8, 9};
        int target = 6;

        System.out.println("Target element: " + target);

        // Find the next smallest letter
        int lb = nextSmallestLetter(arr, target);
        System.out.println("Next smallest element is: " + arr[lb] + " at index " + lb);
        // Find the next greatest letter
        int ub = nextGreatestLetter(arr, target);
        System.out.println("Next greatest element is: " + arr[ub] + " at index " + ub);

    }

    public static int nextSmallestLetter(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if current mid is smaller than or equal to the target
            if (arr[mid] >= target) {
                high = mid - 1; // Narrow the search to the left
            } else {
                result = mid; // Store the last valid index
                low = mid + 1;
            }
        }

        return result == -1 ? arr.length - 1 : result; // Wrap around if no smaller element exists
    }

    public static int nextGreatestLetter(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if current mid is greater than the target
            if (arr[mid] > target) {
                result = mid; // Store the last valid index
                high = mid - 1;
            } else {
                low = mid + 1; // Narrow the search to the right
            }
        }

        return result == -1 ? 0 : result; // Wrap around if no greater element exists
    }
}
