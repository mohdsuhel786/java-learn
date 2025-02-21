package DataStructureCode.RecursionDemo;

import java.util.ArrayList;

public class MazeObstacleProblem
{
    public static void main(String[] args)
    {
        int row = 0;
        int col = 0;

        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        //System.out.println( pathCount( maze,row, col));
//         path("",maze,row,col);
        System.out.println(pathPrint("", maze, row, col));
    }

    public static int pathCount(boolean[][] maze, int row, int col)
    {
        if (row == maze.length - 1 && col == maze[0].length - 1)
        {

            return 1;
        }
        if (!maze[row][col])
        {
            return 0;
        }
        int left = 0;
        int right = 0;
        if (row < maze.length - 1)
        {
            left = pathCount(maze, row + 1, col);
        }
        if (col < maze[0].length - 1)
        {
            right = pathCount(maze, row, col + 1);
        }


        return left + right;
    }

    public static void path(String up, boolean[][] maze, int row, int col)
    {
        if (row == maze.length - 1 && col == maze[0].length - 1)
        {

            System.out.println(up);
            return;
        }

        if (!maze[row][col])
        {
            return;
        }
        if (row < maze.length - 1)
        {
            path(up + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1)
        {
            path(up + "R", maze, row, col + 1);
        }


        // return left+right;
    }

    public static ArrayList<String> pathPrint(String up, boolean[][] maze, int row, int col)
    {
        if (row == maze.length - 1 && col == maze[0].length - 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            // System.out.println(up);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (!maze[row][col])
        {
            return list;
        }
        if (row < maze.length - 1 && col < maze[0].length - 1)
        {
            list.addAll(pathPrint(up + "D", maze, row + 1, col + 1));
        }
        if (row < maze.length - 1)
        {
            list.addAll(pathPrint(up + "V", maze, row + 1, col));
        }

        if (col < maze[0].length - 1)
        {
            list.addAll(pathPrint(up + "H", maze, row, col + 1));
        }


        return list;
    }


}
