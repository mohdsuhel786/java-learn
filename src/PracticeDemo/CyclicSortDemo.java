package PracticeDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortDemo
{
    public static void main(String [] args){
        int[] arr = {7,8,9,11,12};
        System.out.println(  firstMissingPositive(arr));
      //  System.out.println(Arrays.toString(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        int result = 0;
        int n = arr.length;
        int i = 0;
        while( i < n){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] < n && arr[i] != arr[correct]){
                int  temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0;j<n;j++){
            if(j+1 != arr[j]){
            return j+1;

            }
        }
        return n+1;
    }
}
