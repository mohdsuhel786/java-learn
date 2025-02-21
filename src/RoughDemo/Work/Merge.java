package RoughDemo.Work;

public class Merge {

//    -- merge and sort in descending order
//    Input : array1 {10, 5, 15}
//    array2 {8, 1, 0}
//    Output {15, 10, 8, 5, 1, 0 }



    public static int[] merge(int[] arr1 ,int[] arr2){
        int  n = arr1.length;
        int m = arr2.length;

        int[] arr = new int[n+m];
        int i =0;
        int j = 0;
        int k =0;

        while(i< n){
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while( j<m){
            arr[k] = arr2[j];
            k++;
            j++;
        }

        return arr;

    }
//  public static void mergeSort(int[] arr,int low,int high){
//        if(low<=high){
//    }

    public static void main(String[] args) {
        int[] arr1 = {10,5,15,16,17,18};
        int[] arr2 = {8,1,0};
        //int[] arr = new int[arr1.length+arr2.length];
        int[] mergeArr = merge(arr1,arr2);
       // mergeSort(arr,0,arr.length);
        //Arrays.sort(mergeArr);
        //System.out.println(Arrays.toString(mergeArr));
        for(int  i= mergeArr.length-1; i>=0;i--){
            System.out.println(mergeArr[i]);
        }
    }
}
