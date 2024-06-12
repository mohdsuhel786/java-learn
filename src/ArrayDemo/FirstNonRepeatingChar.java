package ArrayDemo;


import java.util.*;


public class FirstNonRepeatingChar {

    public static Character firstNonRepeating(String s){
        int[] charCount = new int[256];
        int n = s.length();

        for(int i = 0;i< n; i++){
            char c = s.charAt(i);
            if( c != ' '){
                charCount[c]++;
            }
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c != ' ' && charCount[c] == 1){
                return c;
            }
        }
        return null;
    }

    public static void main (String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine(); // do not change this

        // you code will be inside this main method
        // to view the output, just print the string
        String result = firstNonRepeating(inputLine).toString();

        // below is a sample program output
        System.out.println(inputLine);
        System.out.println(result);
    }
}

