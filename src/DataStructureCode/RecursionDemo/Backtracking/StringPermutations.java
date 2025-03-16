package DataStructureCode.RecursionDemo.Backtracking;

import java.util.*;

public class StringPermutations
{
    public static void main(String[] args)
    {
        String str = "ddd4d";
        List<String> result = new ArrayList<>();
        ArrayList<String> list = permutationList("", str);
        // Generate all permutations
        permute(str.toCharArray(), 0, result);

        // Filter and print permutations that start with a digit
        for (String perm : result)
        {
            if (Character.isDigit(perm.charAt(0)))
            {
                System.out.println(perm);
            }
        }

        for (String perm : list)
        {
            if (Character.isDigit(perm.charAt(0)))
            {
                System.out.println(perm);
            }
        }
    }

    private static void permute(char[] chars, int index, List<String> result)
    {
        if (index == chars.length - 1)
        {
            result.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++)
        {
            swap(chars, i, index);
            permute(chars, index + 1, result);
            swap(chars, i, index); // backtrack
        }
    }

    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    static ArrayList<String> permutationList(String p, String up)
    {
        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return list;
    }
}
