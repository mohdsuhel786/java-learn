package DataStructureCode.LinkedListDemo;



public class LinkedListLL {
    //Node head;
    static class Node{
        int val;
        Node next;

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }

        public Node(int val){
            this.val = val;
            this.next = null;
        }

    }
    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1; i< arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
           // System.out.print( " -> ");
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count ++;
        }
        return count;
    }

    public static boolean search(Node head,int target){

        Node temp = head;
        while(temp != null){
            if(temp.val == target) return true;
            temp = temp.next;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12,5,7,8};
        Node head = convertArr2LL(arr);
       // System.out.println(head.val);
       // printLL(head);
      //  System.out.println("Length "+ lengthOfLL(head));
       // System.out.println(search(head,4));

    }
}
