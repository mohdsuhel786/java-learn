package DataStructureCode.StackDemo;

import java.util.Arrays;
import java.util.Stack;

public class GreaterNextElement
{

    public static void main(String[] args)
    {
        int[] arr = {6, 8, 1, 0, 0, 9, 1};
        int[] result = nextGreaterElement(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] nextGreaterElement(int[] arr)
    {
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--)
        {
            while (!st.isEmpty() && arr[i] >= st.peek())
            {
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }

        return result;
    }

}
