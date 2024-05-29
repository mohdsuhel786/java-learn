package DataStructureCode.LinkedListDemo;

public class LinkedListDemo {

    Node head;

    class Node{
        int val;
        Node next = null;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }


    public void addFirt(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
           return;

        }
        newNode.next =head;
        head = newNode;
        }

    public void deleteFirst(){

        if(head == null){
            return;
        }
        head =head.next;

    }


    public void addLast(int val){
    Node newNode = new Node(val);
    if(head == null){
        head = newNode;
        return;
    }
    else {
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
}

    public void deleteLast(){

        if(head == null){
            return;
        }
        else {
            Node currNode = head;
            Node prev = null;
            while(currNode.next != null){
                prev = currNode;
                currNode = currNode.next;
            }
            prev.next = null;
        }
    }

    public void printLinkedList( ){
        if(head == null){
            System.out.println(" ");;
            return;
        }
        Node curr = head;
        while (curr.next != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;

        }
        System.out.print(curr.val);
        System.out.println(" -> Null");
    }

    public int getMid(){
        int midVal = 0;
        if(head == null){
            return 0;
        }
        Node slow  = head;
        Node fast = head;
        while(fast.next != null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;

        }
            midVal = slow.val;
        return midVal;
    }

    public int get(int index){
        int s = 0;
        if(head == null){

            return 0;
        }

        else {
            Node currNode = head;
            int c = 0;
            while(currNode.next != null ){

                currNode = currNode.next;

                c++;
                if(c== index){
                    s = currNode.val;
                }
            }

        }
        return s;
    }

    public void deleteAtIndex(int index){
        if(head == null){
            return;
        }
        else {
            Node currNode = head;
            int c = 0;
            Node prev = null;
            if(c== index){
                head = currNode.next;
                return;
            }
            while(currNode.next != null ){
                prev = currNode;
                currNode = currNode.next;
                c++;
                if(c== index){
                    prev.next = currNode.next;
                }

            }

        }

    }





    public void addAtIndex(int index,int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        else {
            Node currNode = head;
            int c = 0;
            Node prev= null;
            if(c== index){
                prev = newNode;
                newNode.next = currNode;
                head = newNode;
            }
            while(currNode.next != null ){
                 prev= currNode;
                currNode = currNode.next;

                c++;
                if(c== index){

                    prev.next = newNode;
                    newNode.next=currNode;
                    return;
                }
            }

        }
    }



    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo();
        ll.addFirt(2);
        ll.addFirt(1);
        ll.addLast(4);
        ll.addFirt(0);
        ll.addLast(5);

        ll.printLinkedList();
        System.out.println(ll.getMid());
        ll.addAtIndex(3,3);
        ll.printLinkedList();
        System.out.println(ll.get(3));
       // ll.deleteAtIndex(0);
        ll.printLinkedList();


        }

}