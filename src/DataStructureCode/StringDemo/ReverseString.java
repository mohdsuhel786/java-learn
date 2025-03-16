package DataStructureCode.StringDemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString
{
    public static void main(String[] args)
    {
        String s = "a good        example";
        //   s.chars().

        System.out.println(reverseWords(s));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

    }

    public static int lengthOfLastWord(String s)
    {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
//        String[] words = s.trim().split("\\s+");
//        return words[words.length-1].length();
    }

    public static String reverseWords(String s)
    {
        String[] words = s.trim().split("\\s+");

        int i = 0;
        int j = words.length - 1;

        while (i < j)
        {

            String temp = words[j];
            words[j] = words[i];
            words[i] = temp;
            i++;
            j--;
        }
        return String.join(" ", words);
    }
//    public static String reverseWords(String s) {
//        int len = s.length();
//        if(len <1){
//            return s;
//        }
//        String[] arr = s.split(" ");
//        int i = 0;
//        int j = arr.length-1;
//        StringBuilder result = new StringBuilder();
//        while(i<j){
//
//          String temp = arr[j];
//           arr[j] = arr[i];
//           arr[i] = temp;
//           i++;
//           j--;
//       }
//
//        for(String w:arr){
//            if(!w.isEmpty()){
//                result.append(" ").append(w);
//            }
//
//        }
//        return result.toString().strip();
//    }
}
