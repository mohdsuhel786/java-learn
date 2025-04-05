package DataStructureCode.StringDemo;

public class BalancedBinaryString
{
    public static boolean isValidBinaryString(String s)
    {
        int ones = 0, zeros = 0;

        for (char c : s.toCharArray())
        {
            if (c == '1') ones++;
            else zeros++;

            if (zeros >= ones)
            {
                return false;
            }
        }

        return ones == zeros;
    }

    public static void main(String[] args)
    {
        System.out.println(isValidBinaryString("01")); // false

    }
}
