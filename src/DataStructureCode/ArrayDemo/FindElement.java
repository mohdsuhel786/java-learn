package DataStructureCode.ArrayDemo;

public class FindElement {

    public static int findLargest(int[] arr,int n){

        // nlogn
        //        Arrays.sort(arr);
        //        int m = arr[n-1];
        int largest = arr[0];
        for(int i: arr){
            if(i>largest){
                largest = i;
            }
        }

        return largest;
    }

    public static void findSecondLargestNSmallest(int[] arr, int n){
        // Time Complexity: O(N), We do two linear traversals in our array
        //
        //Space Complexity: O(1)
        if(n<2){
            System.out.println(-1);
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int i;
        for(i = 0;i<n;i++){
            largest = Math.max(largest,arr[i]);
            smallest = Math.min(smallest,arr[i]);
        }
        for(i = 0;i<n;i++){
            if(arr[i]> secondLargest && arr[i] != largest ){
                secondLargest  = arr[i];
            }
            if(arr[i]< secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }

        }
        System.out.println("second largest " + secondLargest);
        System.out.println("second smallest " + secondSmallest);
    }

    public static int findSecondLargest(int[] arr, int n){
// optimal aaprochTime Complexity: O(N), Single-pass solution
//
//Space Complexity: O(1)
        if(n<2){
            return -1;
        }
        int largest =  Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0;i< n;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest= arr[i];
            }
            else if(arr[i]> secondLargest && arr[i] !=largest){
                secondLargest = arr[i];
            }
        }


        return secondLargest;
    }

    public static int findSecondSmallest(int[] arr, int n){
        //Time Complexity: O(N), Single-pass solution
        //
        //Space Complexity: O(1)

        if(n<2){
            return -1;
        }
        int secondSmallest = Integer.MAX_VALUE;
        int smallest =  Integer.MAX_VALUE;

        for(int i =0;i<n;i++){
            if(arr[i]< smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }


        return secondSmallest;
    }


    public static void main(String[] args) {
        int[] arr = {1,22,5,9,15};
        int n = arr.length;
        System.out.println(findLargest(arr,n));
        findSecondLargestNSmallest(arr,n);
        System.out.println(findSecondLargest(arr,n));
        System.out.println(findSecondSmallest(arr,n));

    }
}
