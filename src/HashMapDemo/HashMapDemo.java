package HashMapDemo;

import java.util.ArrayList;
import java.util.HashMap;

class HashMapDemo{


    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
            arr.add(104);
            arr.add(105);

        map.put(100,1);
        map.put(101,6);
        map.put(100, 3);
        for(int i : arr){
            if(map.containsKey(i)){
                int v = map.get(i);
                map.put(i,v+1);
            }
            else{
                map.put(i,1);
            }

        }


        System.out.println(map.entrySet().stream().max((v1,v2) -> v1.getValue().compareTo(v2.getValue())).get().getKey());
    }

}