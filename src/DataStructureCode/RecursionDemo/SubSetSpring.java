package DataStructureCode.RecursionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubSetSpring
{
    public static void main(String[] args)
    {
        String s = "AAABBC";
        //  int count = 1;
        //subString("",s);


//        System.out.println(subStringList("", s));
        HashSet<String> set = new HashSet<>();
        System.out.println(subStringCount("", s, set));
//        Integer[] input = {1, 2, 3};
//        List<Integer> partial = new ArrayList<>();
//        List<List<Integer>> result = subSetnum(partial, input);
//
//        System.out.println("Subsets:");
//        for (List<Integer> subset : result) {
//            System.out.println(subset);
//        }
    }


    public static void subString(String p, String up)
    {
        if (up.isEmpty())
        {

            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subString(p + c, up.substring(1));
        subString(p, up.substring(1));

    }

    public static ArrayList<String> subStringList(String p, String up)
    {
        if (up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> left = subStringList(p + c, up.substring(1));
        ArrayList<String> right = subStringList(p, up.substring(1));
        left.addAll(right);

        return left;
    }

    public static int subStringCount(String p, String up, HashSet<String> set)
    {
        if (up.isEmpty())
        {
            if (!p.isEmpty())
            {
                set.add(p); // Add the substring to the set
            }
            return set.size();
        }
        char c = up.charAt(0);


        subStringCount(p + c, up.substring(1), set);
        subStringCount(p, up.substring(1), set);
        //  left.addAll(right);

        return set.size();
    }

    public static List<List<Integer>> subSetnum(List<Integer> p, Integer[] up)
    {
        if (up.length == 0)
        {
            // Base case: return a list containing the current subset
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(p)); // Add the current subset to the list
            return list;
        }

        // Take the first element of the array
        Integer i = up[0];

        // Create a new array with the remaining elements
        Integer[] remaining = new Integer[up.length - 1];
        System.arraycopy(up, 1, remaining, 0, up.length - 1);

        // Recursive call: include the current element in the subset
        p.add(i);
        List<List<Integer>> left = subSetnum(p, remaining);

        // Recursive call: exclude the current element from the subset
        p.remove(p.size() - 1);
        List<List<Integer>> right = subSetnum(p, remaining);

        // Combine the subsets
        left.addAll(right);

        return left;
    }


}
