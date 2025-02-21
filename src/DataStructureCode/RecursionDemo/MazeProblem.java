package DataStructureCode.RecursionDemo;

import java.util.ArrayList;

public class MazeProblem
{
    public static void main(String[] args)
    {
        int row = 3;
        int col = 3;
        // System.out.println( count( row, col));
        //  pathCount("",row,col);
        System.out.println(pathPrint("", row, col));
    }

    public static int count(int row, int col)
    {
        if (row == 1 || col == 1)
        {

            return 1;
        }

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    public static void pathCount(String up, int row, int col)
    {
        if (row == 0 && col == 0)
        {

            System.out.println(up);
            return;
        }

        if (row > 1)
        {
            pathCount(up + "D", row - 1, col);
        }
        if (col > 1)
        {
            pathCount(up + "R", row, col - 1);
        }


        // return left+right;
    }

    public static ArrayList<String> pathPrint(String up, int row, int col)
    {
        if (row == 1 && col == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            // System.out.println(up);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && col > 1)
        {
            list.addAll(pathPrint(up + "D", row - 1, col - 1));
        }
        if (row > 1)
        {
            list.addAll(pathPrint(up + "V", row - 1, col));
        }

        if (col > 1)
        {
            list.addAll(pathPrint(up + "H", row, col - 1));
        }


        return list;
    }


}
