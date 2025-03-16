package RoughDemo.RoughDemo;

import java.util.*;

public class UniqueKeyAndUniqueValue
{

    public static void main(String[] args)
    {
       /*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.

String : "abbccc"
Output: true

String: "aabbccc"
Output: false

 */


        String word = "abbcccxyz";

        char[] arr = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : arr)
        {
            map.put(ch, map.getOrDefault(ch, 1) + 1);

        }
        List<Integer> values = map.values().stream().toList();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < values.size(); i++)
        {
            if (set.contains(values.get(i)))
            {
                System.out.println(false);
                return;
            } else
            {
                set.add(values.get(i));
            }

        }

        System.out.println(true);

    }
}
