//package RoughDemo.PimeSumDP;
//
//import java.util.HashSet;
//
//public class SumOfScores {
//    // Function to check if a number is prime
//    static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        if (n <= 3) return true;
//        if (n % 2 == 0 || n % 3 == 0) return false;
//        int i = 5;
//        while (i * i <= n) {
//            if (n % i == 0 || n % (i + 2) == 0) return false;
//            i += 6;
//        }
//        return true;
//    }
//
//    // Function to calculate the sum of scores
//    static int sumOfScores(int N, HashSet<Integer> low_eye, HashSet<Integer> high_eye) {
//        int mod = (int) (1e9 + 7);
//        int totalScore = 0;
//        for (int low : low_eye) {
//            for (int high : high_eye) {
//                int[] dp = new int[high + 1];
//                dp[0] = 1;
//                dp[1] = 1;
//                for (int i = 2; i <= high; i++) {
//                    if (isPrime(i) && low <= i && i <= high) {
//                        for (int j = i; j <= high; j++) {
//                            dp[j] += dp[j - i];
//                            dp[j] %= mod;
//                        }
//                    }
//                }
//                for (int i = N; i <= high; i++) {
//                    if (isPrime(i)) {
//                        totalScore += dp[i];
//                        totalScore %= mod;
//                    }
//                }
//            }
//        }
//        return totalScore;
//    }
//
//    public static void main(String[] args) {
//        int N = 2;
//        HashSet<Integer> low_eye = new HashSet<>();
//        low_eye.add(1);
//        low_eye.add(3);
//        HashSet<Integer> high_eye = new HashSet<>();
//        high_eye.add(5);
//        high_eye.add(5);
//
//        int result = sumOfScores(N, low_eye, high_eye);
//        System.out.println("Sum of scores modulo 10^9 + 7: " + result);
//    }
//}