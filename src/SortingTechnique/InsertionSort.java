package SortingTechnique;

public class InsertionSort {
    public static int[] insertionSort(int []arr,int n){

        // take one element and place it its correct order
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }


        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,10,41 ,467, 334, 500, 169, 724, 478, 358, 962, 464 };
        int n = arr.length;
        int[] result = insertionSort(arr, n);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
