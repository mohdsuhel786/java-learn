package PracticeDemo;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args){
        int[] arr = {6,7,1,2,3,4,5,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort (int[] arr){
        for(int i = 0;  i<arr.length-1;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }
}
