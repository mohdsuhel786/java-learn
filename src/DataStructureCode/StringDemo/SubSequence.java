package DataStructureCode.StringDemo;

public class SubSequence
{
    public static void main(String[] args)
    {
        String s = "acb";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t)
    {
        int i = 0;
        int j = 0;
        if (s.isEmpty())
        {
            return true;
        }
        while (i < t.length() && j < s.length())
        {
            if (t.charAt(i) == s.charAt(j))
            {
                j++;
            }
            i++;
        }
        return j == s.length();
    }
}
