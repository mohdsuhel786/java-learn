package DataStructureCode.SortingTechnique;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {


    public static int[] bubbleSort(int []arr,int n){

        for(int i=n-1; i>=0;i--){
            int didSwap = 0;
            for(int j = 0; j<=i-1;j++ ){
                //select minimum value in pair and then swap
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp ;

                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,41 ,467, 334, 500, 169, 724, 478, 358, 962, 464 };
        int n = arr.length;
        int[] result = bubbleSort(arr, n);
        System.out.println(Arrays.toString(result));

    }
}
