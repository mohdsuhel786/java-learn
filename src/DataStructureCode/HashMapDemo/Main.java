package DataStructureCode.HashMapDemo;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 10, 10, 3, 3, 2,3};

        // Count occurrences of each number
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : numbers) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        // Find the maximum and minimum occurrences
        int maxOccurrence = Integer.MIN_VALUE;
        int minOccurrence = Integer.MAX_VALUE;
        int maxValueMaxOccurrence = Integer.MAX_VALUE; // Initialize with a high value
        int minValueMinOccurrence = Integer.MAX_VALUE; // Initialize with a high value

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();

            if (count > maxOccurrence || (count == maxOccurrence && value < maxValueMaxOccurrence)) {
                maxOccurrence = count;
                maxValueMaxOccurrence = value;
            }
            if (count < minOccurrence || (count == minOccurrence && value < minValueMinOccurrence)) {
                minOccurrence = count;
                minValueMinOccurrence = value;
            }
        }

        // Print the results
        System.out.println("Value with maximum occurrence: " + maxValueMaxOccurrence + " (Occurrence: " + maxOccurrence + ")");
        System.out.println("Value with minimum occurrence: " + minValueMinOccurrence + " (Occurrence: " + minOccurrence + ")");
    }
}