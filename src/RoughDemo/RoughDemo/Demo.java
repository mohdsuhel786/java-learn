package RoughDemo.RoughDemo;

import java.util.ArrayList;

public class Demo
{

    public static void main(String[] args)
    {
        int m = 3;
        int n = 3;
// [[1,2,3],
//[4,5,6],
//[7,8,9]]

        // [1,2,3,6,9,8,7,4,5]
        // int[][] matrix = new int[m][n];
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> list = matrixTraver(matrix, m, n);
        System.out.println(list);
    }


    static ArrayList<Integer> matrixTraver(int[][] matrix, int r, int c)
    {
        ArrayList<Integer> result = new ArrayList<>();

        int top = 0;
        int left = 0;
        int bottom = r - 1;
        int right = c - 1;
        while (top <= bottom && left <= right)
        {
            for (int i = left; i <= right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom)
            {
                for (int i = right; i >= 0; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right)
            {

                for (int i = bottom; i >= top; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        //   System.out.println(a+" "+b);

        return result;
    }
}
