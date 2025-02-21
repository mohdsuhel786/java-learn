package RoughDemo.Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {


    public static void main(String[] args) {
        String[] names = {"ravi", "suhel","rohan","avi", "bali","john","ram","shyam","anand"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        Arrays.sort(names);
        Collections.sort(list);
        Collections.reverse(list);
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int max = Arrays.stream(nums).max().getAsInt();
        int sum = Arrays.stream(nums).sum();
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> num = Arrays.stream(nums)
                .filter(n -> n % 2 ==0)
                .map(n -> n*2).boxed()
                .toList();
//        for(int i = names.length-1; i>=0 ;i--)
//        {
//            System.out.println(names[i]);
//        }
     //   list.stream().sorted()
        for(int s :num){
            System.out.println(s);
        }

    }
}
