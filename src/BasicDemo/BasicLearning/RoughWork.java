package BasicDemo.BasicLearning;

import java.util.ArrayList;
import java.util.HashMap;

public class RoughWork {

    //input= {1,2,1,3,4,5,3,4}
    //output= {1,2,-1,3,4,5,-1,-1}

    public static void main(String[] args) {
            int[] nums = {1,2,1,3,4,5,3,4};

        HashMap<Integer,Integer> map = new HashMap<>();
             int  l = nums.length;
        ArrayList<Integer> result = new ArrayList<>();

            for(int i = 0;i< l;i++){
                int c = 1;
                if(map.containsKey(nums[i])){
                    map.put(nums[i],c);
                    result.add(-1);
                }
                else{
                    map.put(nums[i],c);
                    result.add(nums[i]);
                }

            }

            for(int i: result){

                System.out.println(i);
            }

        Integer num1 = 1000, num2 = 1000;
        System.out.println(num1 == num2);//1
        Integer num3 = 20, num4 = 20;
        System.out.println(num3 == num4);//2
        Math.log10(2);

    }
}


// average age of female employee

//sum of all age // no. employee
//sum  =  emp.strem ( e.age)

