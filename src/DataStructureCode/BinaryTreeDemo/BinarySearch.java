package DataStructureCode.BinaryTreeDemo;


public class BinarySearch {

    public static int binarySearch(int[] arr , int num,int low,int high){
        if(low<= high){
          int  mid = low +(high-low)/2 ;
          if(arr[mid] == num){
              return mid;
          }

          if(arr[mid]>num){
             return binarySearch(arr,num,low,mid-1);
          }
           return binarySearch(arr,num,mid+1,high);
        }
        return -1;
    }
    public static void main(String[] args) {
    int num = 4;
    int[] arr = {10,2,3,7,9,4,10};
        int   result= binarySearch(arr,num,0,arr.length-1);

      if(result >0){
          System.out.println(result);
      }
      else {
          System.out.println("Not present");
      }char c ='a' ;
      c++;
        System.out.println(c);

    }
}
