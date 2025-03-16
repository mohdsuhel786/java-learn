package DataStructureCode.ArrayDemo;

import org.w3c.dom.ls.LSOutput;

public class BuyStock
{
    public static void main(String[] args)
    {
        int[] prices = {2, 1, 2, 0, 1};
        int n = prices.length;
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

//    public static int maxProfit(int[] prices) {
//        int  maxProfit =0;
//        int min = Integer.MAX_VALUE;
//        for(int i =0;i<prices.length;i++){
//            min = Math.min(min,prices[i]);
//            maxProfit = Math.max(maxProfit,prices[i] - min);
//        }
//
//        return maxProfit;
//    }

    public static int maxProfit(int[] prices)
    {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < min)
            {
                min = prices[i];
            } else
            {
                max = prices[i];
                maxProfit += max - min;
                min = prices[i];
                // max = 0;
            }

            System.out.println(max + " " + min + " " + maxProfit);
        }

        return maxProfit;
    }
}
