package DataStructureCode.BinarySearchDemo;
import java.util.*;

public class BinarySearch2DDemo {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m-1;
        while(row < n && col >= 0){
            if (matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) row++;
            else col--;
        }
        return false;
    }


        public static void main(String[] args) {
//            ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//            matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
//            matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
//            matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
            int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
            boolean result = searchMatrix(matrix, 8);
            System.out.println(result ? "true" : "false");
        }
    }


