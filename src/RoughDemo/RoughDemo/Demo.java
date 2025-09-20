package RoughDemo.RoughDemo;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo
{


    public static void main(String[] args)
    {
        String str = "hello world java developer";
        String[] words = str.split("\\s+"); // split by spaces
        if (words.length == 0)
            System.out.println();;

        // first word -> lowercase
        String firstWord = words[0].toLowerCase();

        // remaining words -> capitalize first letter + lowercase rest

        String others = Arrays.stream(words, 1, words.length)
                .map(w -> w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase())
                .collect(Collectors.joining());

        System.out.println(firstWord + others);
    }




}