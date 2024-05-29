package ArrayDemo;

public class ArrayIsSorted {
    static boolean isSorted(int arr[], int n) {
        //Complexity Analysis
        //Time Complexity: O(N^2)
        // bruete force approach
        //Space Complexity: O(1)

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }
    static boolean isSortedArray(int arr[], int n) {
        //Complexity Analysis
        //Time Complexity: O(N)
        // optimal approach
        //Space Complexity: O(1)
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }


    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}, n = 5;

        System.out.println(isSorted(arr, n));
        System.out.println(isSortedArray(arr, n));
    }
}
