package DataStructureCode.ArrayDemo;

public class SplitWord {

    public static void main(String[] args) {
            String str = "abcgefd::a,ab,abc,abcg,b,c,dog,e,efd,zzzz";
            // Split the input into the sequence of characters and the dictionary
            String[] parts = str.split("::");
            String sequence = parts[0];
            String dictionaryStr = parts[1];

            // Convert the dictionary string to an array of words
            String[] words = dictionaryStr.split(",");

            // Iterate through all possible splits of the sequence
            for (int i = 1; i < sequence.length(); i++) {
                String firstWord = sequence.substring(0, i);
                String secondWord = sequence.substring(i);

                // Check if both words exist in the dictionary
                boolean firstWordExists = false;
                boolean secondWordExists = false;
                for (String word : words) {
                    if (word.equals(firstWord)) {
                        firstWordExists = true;
                    }
                    if (word.equals(secondWord)) {
                        secondWordExists = true;
                    }
                    // If both words are found, break out of the loop
                    if (firstWordExists && secondWordExists) {
                        break;
                    }
                }

                if (firstWordExists && secondWordExists) {
                    System.out.println(firstWord + "," + secondWord);
                    return;
                }
            }

            System.out.println("not possible");
        }
    }

