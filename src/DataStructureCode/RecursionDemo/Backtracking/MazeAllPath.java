package DataStructureCode.RecursionDemo.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeAllPath
{
    public static void main(String[] args)
    {
        int row = 0;
        int col = 0;

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        int step = 1;
        // System.out.println( pathCount( maze,row, col));
//         path("",maze,row,col);
        //  System.out.println(  pathPrint("",maze,row,col));
        allPathPrint("", maze, row, col, path, step);
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
        maze[row][col] = false;
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        if (row > 0)
        {
            up += pathCount(maze, row - 1, col);
        }

        if (row < maze.length - 1)
        {
            left = pathCount(maze, row + 1, col);
        }
        if (col < maze[0].length - 1)
        {
            right = pathCount(maze, row, col + 1);
        }
        if (col > 0)
        {
            down += pathCount(maze, row, col - 1);
        }

        maze[row][col] = true;
        return left + right + up + down;
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
        maze[row][col] = false;
        if (row > 0)
        {
            path(up + "U", maze, row - 1, col);
        }
        if (row < maze.length - 1)
        {
            path(up + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1)
        {
            path(up + "R", maze, row, col + 1);
        }

        if (col > 0)
        {
            path(up + "L", maze, row, col - 1);
        }
        maze[row][col] = true;

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
        maze[row][col] = false;
        if (row > 0)
        {
            list.addAll(pathPrint(up + "U", maze, row - 1, col));
        }
        if (row < maze.length - 1)
        {
            list.addAll(pathPrint(up + "D", maze, row + 1, col));
        }
        if (col < maze[0].length - 1)
        {
            list.addAll(pathPrint(up + "R", maze, row, col + 1));
        }

        if (col > 0)
        {
            list.addAll(pathPrint(up + "L", maze, row, col - 1));
        }
        maze[row][col] = true;

        return list;
    }

    public static void allPathPrint(String up, boolean[][] maze, int row, int col, int[][] path, int step)
    {
        if (row == maze.length - 1 && col == maze[0].length - 1)
        {
            path[row][col] = step;
            for (int[] arr : path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(up);
            System.out.println();
            return;
        }

        if (!maze[row][col])
        {
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;
        if (row > 0)
        {
            allPathPrint(up + "U", maze, row - 1, col, path, step + 1);
        }
        if (row < maze.length - 1)
        {
            allPathPrint(up + "D", maze, row + 1, col, path, step + 1);
        }
        if (col < maze[0].length - 1)
        {
            allPathPrint(up + "R", maze, row, col + 1, path, step + 1);
        }

        if (col > 0)
        {
            allPathPrint(up + "L", maze, row, col - 1, path, step + 1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
        // return left+right;
    }
}
