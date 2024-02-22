package DataStructureCode.StackDemo;

import java.util.ArrayList;

public class StackDemo {

     static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        // static int  top;
        static int maxSize = list.size();

        public static void push(int val) {
         list.add(val);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            } else {
              int top =  list.get(list.size()-1);
              list.remove(list.size()-1);
                return top;
            }
        }


        public static boolean isEmpty()
        {
                return list.isEmpty();
        }

        public static int peek()
        {
            if (list.isEmpty()) {
                return -1;
            }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    while (!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }

    }
}}
