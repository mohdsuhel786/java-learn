package DataStructureCode.RecursionDemo;

import java.util.ArrayList;

public class PermutaionOfString
{
    public static void main(String[] args)
    {
        String str = "abc";
        //permutation("", str);

//        ArrayList<String> list = permutationList("",str);
//        System.out.println((list));
        System.out.println(permutationCount("", str));

    }

    static void permutation(String p, String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
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

    static int permutationCount(String p, String up)
    {
        if (up.isEmpty())
        {

            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count += permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }


}
