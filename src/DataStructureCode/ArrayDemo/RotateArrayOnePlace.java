package DataStructureCode.ArrayDemo;

public class RotateArrayOnePlace {

    static void solve(int arr[], int n) {
        //Time Complexity: O(n), as we iterate through the array only once.
        // brute force
        //Space Complexity: O(n) as we are using another array of size, same as the given array.
        int temp[]=new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }
    static void rotate(int arr[], int n) {
        //Complexity Analysis
        //Time Complexity: O(n), as we iterate through the array only once.
        // optimal approach
        //Space Complexity: O(1) as no extra space is used
        int temp = arr[0]; // storing the first element of array in a variable
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; // assigned the value of variable at the last index
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    public static void main(String args[]) {
        int n=5;

        int arr[]= {1,2,3,4,5};
        rotate(arr, n);
    }
}
