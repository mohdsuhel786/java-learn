package RoughDemo.BasicMathProblem;

import java.math.BigInteger;

public class BigIntegerFactorial
{
    public static void main(String[] args)
    {
        System.out.println(fact(4));
    }

    static BigInteger fact(int n)
    {
        BigInteger ans = new BigInteger("1");
        for (int i = 2; i <= n; i++)
        {
            ans = ans.multiply(BigInteger.valueOf(i));
        }

        return ans;
    }
}
