package DataStructureCode.ArrayDemo;
import java.util.HashMap;

public class CheckAlphabet {

    public static void main(String[] args) {

        String str = "bkfgtbhdaielqrm45pnsowtuv";
        if (str.length() > 0) {
            // Create a HashMap to count occurrences of each letter
            HashMap<Character, Integer> letterCounts = new HashMap<>();

            // Convert the string to lowercase
             str = str.toLowerCase();

            // Iterate over each character in the string
            for (char ch : str.toCharArray()) {
                // Check if the character is a lowercase letter (ASCII values 97 to 122)
                if (ch >= 97 && ch <= 122) {
                    letterCounts.put(ch, letterCounts.getOrDefault(ch, 0) + 1);
                }
            }

            // Check if all letters from 'a' to 'z' are present in the HashMap
            for (char ch = 97; ch <= 122; ch++) {
                if (!letterCounts.containsKey(ch)) {
                    System.out.println("false");
                    return;
                }
            }

            System.out.println("true");
        } else {
            System.out.println("Please provide an input string as an argument.");
        }
    }
}
