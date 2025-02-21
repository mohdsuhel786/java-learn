package RoughDemo.Work;

public class Test {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5,6,7,8,9,10};
        int n = prices.length;
        int maxProfit = maxProfit(prices,n);
        System.out.println(maxProfit);
    }

    private static int maxProfit(int[] prices, int n) {

        int buy = prices[0], max = 0;
        for(int i = 1;i<n;i++){
            if(buy > prices[i])
                buy = prices[i];
            else if(prices[i] -buy>max){
                max = prices[i] -buy;
            }
        }
        return max;
    }
}
