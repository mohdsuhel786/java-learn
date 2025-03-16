package DataStructureCode.StackDemo;

import java.util.Stack;

public class ValidateParenthesis
{

    public static void main(String[] args)
    {
        String s = ")()((())";
        System.out.println(longestValidParentheses(s));


    }

    public static int longestValidParentheses(String s)
    {
        int maxLength = 0;
        if (s.isEmpty() || s.length() == 1)
        {
            return maxLength;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(')
            {
                stack.push(i);
            } else
            {
                stack.pop();
                if (stack.isEmpty())
                {
                    stack.push(i);
                } else
                {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
}
