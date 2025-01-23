package DataStructureCode.SortingTechnique;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort
{
    //N -  numbers from range(1,N) find index and value at index is not correct position

    public static void main(String [] args){
        int[] arr = {2,1,2,3,4};
        List<Integer> result= cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);
    }

    public static List<Integer>  cyclicSort(int[] arr){

        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while( i < n){
            int correct = arr[i]-1;
            if(  arr[i] != arr[correct]){
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
                list.add(j+1);
                list.add(arr[j]);
            }
        }

        return list;
    }
}
