package DataStructureCode.RecursionDemo.Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NQueenProblem
{

    public static void main(String[] args)
    {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        System.out.println(nQueen(result, board, 0));
        System.out.println(result);
    }

    static int nQueen(List<List<String>> result, boolean[][] board, int row)
    {
        if (board.length == row)
        {

//            display(board);
//            System.out.println();
            // System.out.println(displayBoard(board));
            result.add(displayBoard(board));
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++)
        {
            if (isSafe(board, row, col))
            {
                board[row][col] = true;
                count += nQueen(result, board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col)
    {
        //check vertical
        for (int i = 0; i < row; i++)
        {
            if (board[i][col])
            {
                return false;
            }
        }
        //check diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++)
        {
            if (board[row - i][col - i])
            {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++)
        {
            if (board[row - i][col + i])
            {
                return false;
            }
        }
        return true;
    }

    private static List<String> displayBoard(boolean[][] board)
    {
        List<String> list = new ArrayList<>();

        for (boolean[] r : board)
        {

            StringBuilder rowStr = new StringBuilder();
            for (boolean c : r)
            {
                if (c)
                {
                    //list.add("Q");
                    rowStr.append("Q");

                } else
                {
                    // list.add(".");
                    rowStr.append(".");
                }

            }
            // System.out.println();
            list.add(rowStr.toString());

        }
        return list;
    }

    private static void display(boolean[][] board)
    {

        for (boolean[] r : board)
        {
            for (boolean c : r)
            {
                if (c)
                {
                    System.out.print("Q ");
                } else
                {
                    System.out.print(". ");
                }

            }
            System.out.println();
        }
    }


}
