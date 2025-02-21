package StreamsApi;

import java.util.Arrays;

public class CountSuffixPrefix
{

    public static void main(String[] args)
    {


        String[] S = {"abcd, wxyz", "abcdmxyz"};
        String[] Q = {"ab", "xy"};

        System.out.println(countSuffixPrefix(S, Q));
    }

    private static int countSuffixPrefix(String[] s, String[] q)
    {
        int result = 0;
        for (String p : s)
        {
            result += (int) Arrays.stream(s).filter(w -> w.startsWith(p)).count();
            result += (int) Arrays.stream(s).filter(w -> w.endsWith(p)).count();
        }
        return result;
    }
}
