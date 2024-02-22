package DataStructureCode.BinaryTreeDemo;

import java.util.*;

import static DataStructureCode.BinaryTreeDemo.MaximizeFuel.FuelManager.getMaxFuelLevel;

public class MaximizeFuel {

    public class FuelManager {

        public static int getMaxFuelLevel(int maxCapacity, int petrol, int diesel) {
            int[] dp = new int[maxCapacity + 1];

            // Base cases
            dp[0] = 0;
            dp[1] = Math.min(petrol, diesel);

            // Iterate through possible fuel levels
            for (int i = 2; i <= maxCapacity; i++) {
                int maxFuel = 0;

                // Consider adding petrol only
                if (i - 1 >= 0) {
                    maxFuel = Math.max(maxFuel, dp[i - 1] + Math.min(i, petrol));
                }

                // Consider adding diesel only
                if (i - 1 >= 0) {
                    maxFuel = Math.max(maxFuel, dp[i - 1] + Math.min(i, diesel));
                }

                // Consider adding both fuels (if enough space)
                if (i >= 3 && i - 1 >= petrol && i - 1 >= diesel) {
                    maxFuel = Math.max(maxFuel, dp[i - 2] + Math.min(petrol, diesel));
                }

                // Consider decreasing current fuel level by half
                if (i >= 2) {
                    int decreasedFuel = Math.max(0, i - Math.min(i / 2, petrol + diesel));
                    maxFuel = Math.max(maxFuel, dp[decreasedFuel] + Math.min(i - decreasedFuel, Math.max(petrol, diesel)));
                }

                dp[i] = maxFuel;
            }

            return dp[maxCapacity];
        }
    }

    public static void main(String[] args) {
        int N = 8; // Change this to your desired fuel capacity
        int maxFuel = getMaxFuelLevel(8, 6, 6);
        System.out.println("Maximum achievable fuel amount: " + maxFuel);
    }
}