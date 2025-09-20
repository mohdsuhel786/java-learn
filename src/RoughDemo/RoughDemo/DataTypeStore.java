package RoughDemo.RoughDemo;

import java.util.*;
import java.util.logging.Logger;


public class DataTypeStore
{
    public static void main(String[] args)
    {

        //Store value in List and ArrayList
        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        List<String> nWord = List.of("a");
        List<String> nWords = Arrays.asList("a");

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(1);
        List<Integer> numLists = new ArrayList<>(numList);
        System.out.println(numLists);
        List<Integer> numList2 = List.of(1);
        List<Integer> numList3 = Arrays.asList(1, 2);


        //Store value in Array
        String[] sWords = {"ab", "bc", "bc", "ccd"};
        int[] num = {1, 2, 4};
        Integer[] nums = {1, 2, 3};
        String[] arrW = new String[5];
        System.out.println(Arrays.toString(arrW));


        Set<String> set = new HashSet<>();
        set.add("ab");
        System.out.println(set);

        Map<String, List<String>> map = new HashMap<>();

        for (String s : sWords)
        {
            map.put(s, map.getOrDefault(s, new ArrayList<>()));
            map.get(s).add(s);

        }



        System.out.println(map);
    }
}
