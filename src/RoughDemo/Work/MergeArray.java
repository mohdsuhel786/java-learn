package RoughDemo.Work;
import java.util.Arrays;
class MergeArray{

    public static int[] mergeArray(int[] arr1,int []arr2){

        int[] arr = new int[arr1.length+arr2.length];
        int i =0;
        int j = 0;
        int k =0;

        while(i< arr1.length){
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while( j< arr2.length){
            arr[k] = arr2[j];
            k++;
            j++;
        }
        
        return arr;

    }

    

    public static void main(String args[]){

        int[] arr1 = {1,2,8,3,4};
        int[] arr2 = {1,3,4,5,6};
        
      int[] arr =  mergeArray(arr1,arr2);
      Arrays.sort(arr);
      //mergeSort(arr,0,n-1)
        System.out.println(Arrays.toString(arr));
       
      


    }
}