package PracticeDemo;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};  //{5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = n-1; i>=0;i--){
            boolean swapped  = false;
            for(int j = 0;j<= i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
