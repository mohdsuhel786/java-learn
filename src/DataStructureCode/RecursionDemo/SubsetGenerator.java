package DataStructureCode.RecursionDemo;

import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator
{

    public static List<List<Integer>> generateSubsets(Integer[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> current, Integer[] nums, int index)
    {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Iterate through all possible next elements
        for (int i = index; i < nums.length; i++)
        {
            // Include the current number in the subset
            current.add(nums[i]);

            // Recursively build further subsets
            backtrack(result, current, nums, i + 1);

            // Backtrack to exclude the last number and explore other possibilities
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args)
    {
        Integer[] input = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(input);

        System.out.println("Subsets:");
        for (List<Integer> subset : subsets)
        {
            System.out.println(subset);
        }
    }
}
