package DataStructureCode.StackDemo;

public class StackUsingLinkedList {

    static class Stack{
        Node head;

         class Node{

             int val;
             Node next;

             public Node(int val){
                 this.val = val;
                 this.next = null;
             }
         }


         public void push(int val){
             Node newNode = new Node(val);
             if(isEmpty()){
                 head = newNode;
                 return;
             }
             newNode.next = head;
             head = newNode;
         }
         public boolean isEmpty(){
             return head == null;
         }

         public int pop(){
             if(isEmpty()){
                 return -1;
             }
             else {
                 int val = head.val;
                 head = head.next;
                 return val;
             }
         }

         public int peek(){
             if(isEmpty()){
                 return -1;
             }
             else {
                 int val = head.val;
                 return val;
             }
         }

         public void printStack(){
             if(isEmpty()){
                 return ;
             }
             else {
                 Node curr = head;
                 while (curr.next!=null){
                     int val = curr.val;
                     curr = curr.next;
                     System.out.print(val+" -> ");
                 }

                 System.out.println(curr.val);
             }
         }
    }




    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

       s.printStack();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.printStack();
    }
}
