package PracticeDemo;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,8,6,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i <n;i++){
            int  mini = i;
            for(int j = i;j<n;j++){
                if(arr[j] <arr[mini]){
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }
    }
}
