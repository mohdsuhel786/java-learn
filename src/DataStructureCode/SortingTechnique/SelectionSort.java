package DataStructureCode.SortingTechnique;

public class SelectionSort {

    public static int[] selectionSort(int []arr,int n){

        for(int i=0; i<n-1;i++){
            int mini = i;
            for(int j = i+1; j<n;j++ ){
                if(arr[j] < arr[mini]) {
                    mini = j; //select minimum value and then swap
                }
            }
            int temp = arr[mini];
            arr[mini] =arr[i];
            arr[i] = temp ;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,7,9,101,1,78,99,550};
        int n = arr.length;
        int[] result = selectionSort(arr, n);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
