package DataStructureCode.BinaryTreeDemo;

public class StringSearch {

    public static int binarySerach(char[]letter, int target, int low, int high){
        int c = target;

        if(low<= high){
            int  mid = low +(high-low)/2 ;
            if(letter[mid] == target){
                return mid;
            }



            if(target < letter[mid]){
                return binarySerach(letter, target,low,  mid-1);
            }

            return   binarySerach(letter, target,mid+1,high);

        }

        return -1;
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int low =0;

        int high = letters.length-1;
        int result =  binarySerach(letters, target,low,  high);

        if(result == -1){
            target ++;
            binarySerach(letters, target,low,  high);
        }

        return letters[result +1];


    }

    public static void main(String[] args) {
        int target = 'd';
        char[] arr = {'c','f','j'};
        int   result= binarySerach( arr, target, 0,  arr.length+1);

        if(result >0){
            System.out.println(arr[result]);
        }
        else {
            System.out.println(arr[0]);
        }
    }

}
