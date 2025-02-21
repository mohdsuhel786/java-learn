package StreamsApi;

import java.util.stream.IntStream;

public class PalindromeJava8
{

    public static void main(String[] args)
    {

        String str = "madam";

        boolean isPalindrome = IntStream.range(0, str.length() / 2)

                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        System.out.println("Is Palindrome: " + isPalindrome);

    }

}