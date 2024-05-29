package DataStructureCode.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListNodeSift {


    public static void reverseLL(LinkedList<Integer> ll ){
        LinkedList<Integer> rl = new LinkedList<>();
        for(int i = ll.size()-1 ; i>=0;i--){
            rl.add(ll.get((Integer) i));
        }
        System.out.println(rl);
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll.add(5);
        int i = 0;
   //     //[4,1,2,5]
        System.out.println(ll);
        ll.remove((Integer) 4);

       ll.addFirst((Integer) 4);

        System.out.println(ll);
        reverseLL(ll);
    }
    }


