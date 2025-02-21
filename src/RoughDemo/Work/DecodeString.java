package RoughDemo.Work;

public class DecodeString {


    public static void main(String[] args) {

        String s = "226";
        int n = s.length();
        int[] dp = new int[n + 1];
        if(n == 0 || s.charAt(0) == '0') return ;
        dp[0] = 1; dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            // check for single-digit
            if (s.charAt(i - 1) >= '1' && s.charAt(i - 1) <= '9') dp[i] = dp[i - 1];

            // check for two-digits
            if (s.charAt(i - 2) == '1') dp[i] += dp[i - 2];
            else if (s.charAt(i - 2) == '2') ;
            System.out.println(dp[n]);
        }}
}
