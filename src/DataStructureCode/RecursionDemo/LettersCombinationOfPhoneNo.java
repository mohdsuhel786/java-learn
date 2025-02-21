package DataStructureCode.RecursionDemo;

import java.util.ArrayList;

public class LettersCombinationOfPhoneNo
{
    public static void main(String[] args)
    {
        String str = "9";

        // pad("",str);
        System.out.println(padRet("", str));
    }

    static void pad(String p, String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';    //String - char ( ascii to int);
        for (int i = (digit - 1) * 3; i < digit * 3; i++)
        {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }

    }

    static ArrayList<String> padRet(String p, String up)
    {
        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';    //String - char ( ascii to int);
        for (int i = (digit - 1) * 3; i < digit * 3; i++)
        {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }

}
