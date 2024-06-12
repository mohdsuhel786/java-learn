package DataStructureCode.ArrayDemo;



import java.util.*;

public class MissingNumber{
    public static int missingNumber(int []a, int L) {
       // Arrays.sort(a);
        int N = a.length;

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i ); //XOR up to [1...N-1]

        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2);// the missing number
    }

    public static void main(String args[]) {
        int N = 10;
        int a[] = {9,6,4,2,3,5,7,0,1};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}

