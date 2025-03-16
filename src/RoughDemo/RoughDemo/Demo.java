package RoughDemo.RoughDemo;


import java.util.*;

public class Demo
{

    public static void main(String[] args)
    {
        int[] nums = {0};

        int val = 1;
        System.out.println(reverse("Am aem"));
        // System.out.println( containsNearbyDuplicate( nums,val));
        // System.out.println(Arrays.toString(nums));
    }

    public static char reverse(String str)
    {
        str = str.toLowerCase();
        char[] chrArr = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();
        char result = '-';
        for (int i = str.length() - 1; i >= 0; i--)
        {

            if (Character.isLetterOrDigit(chrArr[i]))
            {
                if (set.contains(chrArr[i]))
                {
                    result = chrArr[i];

                } else
                {
                    set.add(chrArr[i]);
                }
            }


        }
        return result;
    }


//    public static boolean containsNearbyDuplicate(int[] nums, int k) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0;i<nums.length;i++){
//
//            if(map.containsKey(nums[i])){
//                System.out.println(i +" "+ map.get(nums[i]) +" "+k);
//                if(i- map.get(nums[i]) <= k){
//
//                    return true;
//                }
//                else{
//                    map.put(nums[i],i);
//                }
//            }
//            else{
//                map.put(nums[i],i);
//            }
//        }
//
//        return false;
//    }

}
