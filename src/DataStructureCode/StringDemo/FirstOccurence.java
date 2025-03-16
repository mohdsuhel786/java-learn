package DataStructureCode.StringDemo;

public class FirstOccurence
{
    public static void main(String[] args)
    {
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(haystack, needle));
    }

    //    public static int strStr(String haystack, String needle){
//        return haystack.indexOf(needle);
//    }
//
    public static int strStr(String haystack, String needle)
    {

        int result = -1;
        int n = haystack.length();
        int m = needle.length();

        if (n < m)
        {
            return result;
        }

        for (int i = 0; i <= n - m; i++)
        {
            int j = 0;
            if (haystack.charAt(i + j) == needle.charAt(j))
            {
                for (j = 0; j < m; j++)
                {
                    if (haystack.charAt(i + j) != needle.charAt(j))
                    {
                        break;
                    }
                }
                if (j == m) return i; // Found the first occurrence
            }

        }
        return result;
    }
}
