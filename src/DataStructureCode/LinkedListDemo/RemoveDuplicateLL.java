package DataStructureCode.LinkedListDemo;

public class RemoveDuplicateLL
{
    public static Node convertArr2LL(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printLL(Node head)
    {
        Node temp = head;

        while (temp != null)
        {
            // System.out.print( " -> ");
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node deleteDuplicates(Node head)
    {  //[1,2,3,3,4,4,5]
        if (head == null || head.next == null)
        {
            return head;
        }
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (head != null)
        {

            boolean isDuplicate = false;
            while (head.next != null && head.val == head.next.val)
            {
                head = head.next;
                isDuplicate = true;

            }
            if (isDuplicate)
            {
                prev.next = head.next;
            } else
            {
                prev = prev.next;
            }
            head = head.next;

        }
        return dummy.next;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 1, 1, 1, 2};
        Node head = convertArr2LL(arr);
        Node node = deleteDuplicates(head);
        printLL(node);
    }

    //Node head;
    static class Node
    {
        int val;
        Node next;

        public Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }

        public Node(int val)
        {
            this.val = val;
            this.next = null;
        }

    }
}
