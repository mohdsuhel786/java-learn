package DataStructureCode.HashMapDemo;
import java.util.*;

class countInteger {

    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        Map<Integer, Integer> occurrences = (Map<Integer, Integer>) new HashMap<>();
        for (int i=0;i<N;i++) {
            occurrences.put(arr[i], occurrences.getOrDefault(arr[i], 0) + 1);
        }

        for(int i=0;i<N;i++){

            arr[i] = occurrences.getOrDefault(i+1,0);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
}