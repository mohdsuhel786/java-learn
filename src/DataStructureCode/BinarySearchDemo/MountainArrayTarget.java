package DataStructureCode.BinarySearchDemo;

public class MountainArrayTarget {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println("Peek element "+search( arr,target));

    }
    public static int search(int [] arr, int target){
        int peek = peekMountain(arr);
    
           
           int firstTry = agnosBinarySearch(arr,0,peek,target);;
           if (firstTry != -1) {
               return firstTry;
           }
        return agnosBinarySearch(arr,peek+1, arr.length -1,target);
    }

    public static int peekMountain(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low<high){
            int mid = low+ (high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    

    public static int  agnosBinarySearch(int[] arr,int low,int high,int target){
        boolean isAsc = arr[low]<arr[high];

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }

        return -1;
    }
}
