package RoughDemo.PimeSumDP;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumValueOfQueries {
    //7, 5, 8, 9, 3
    public static void main(String[] args) {
        // Given array A and query parameters
        int[] A = {};
        int I = 1; // Index to change
        int V = 1; // New value
        int K = 2; // Number of elements to consider

        // Step 1: Change the value at index I to V
        A[I - 1] = V;

        // Step 2: Sort the array A
        Arrays.sort(A);
        //System.out.println(A);

        // Step 3: Calculate the sum of absolute differences for every pair of K elements
        long sumOfDifferences = 0;
        ArrayList<Long> nArr = new ArrayList<>();
        int N = A.length;
        for (int j = 0; j < K; j++) {
           // sumOfDifferences +=Math.abs( j*A[j] - (long) (N - 1 - j) *A[j]);
            nArr.add((long) Math.abs(A[N - j - 1] - A[j]));
           //sumOfDifferences += (long) Math.abs(A[N - j - 1] - A[j]);
            System.out.println(A[N - j - 1] +" " +A[j]);
        }

        // Step 4: Output the result
        System.out.println(sumOfDifferences);
        System.out.println(nArr.stream().max((a1,a2) -> {
            return a1.compareTo(a2);
        }).get());
    }
}