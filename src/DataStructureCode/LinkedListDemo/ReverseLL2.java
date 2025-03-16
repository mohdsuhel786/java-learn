package DataStructureCode.LinkedListDemo;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLL2
{
    public static void main(String[] args)
    {
        ReverseLL2.ListNode head = new ReverseLL2.ListNode(1);
        head.next = new ReverseLL2.ListNode(3);
        head.next.next = new ReverseLL2.ListNode(2);
        head.next.next.next = new ReverseLL2.ListNode(4);
        head.next.next.next.next = new ReverseLL2.ListNode(4);
        head.next.next.next.next.next = new ReverseLL2.ListNode(4);


        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseBetween(head, 2, 4);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right)
    {

        if (left == right)
        {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;

        for (int i = 0; curr != null && i < left - 1; i++)
        {
            prev = curr;
            curr = curr.next;
        }
        ListNode last = prev;
        ListNode newEnd = curr;
        ListNode nextNode = curr.next;
        for (int i = 0; curr != null && i < right - left + 1; i++)
        {

            curr.next = prev;
            prev = curr;
            curr = nextNode;

            if (nextNode != null)
            {
                nextNode = nextNode.next;
            }
        }
        if (last != null)
        {
            last.next = prev;
        } else
        {
            head = prev;
        }
        newEnd.next = curr;
        return head;
    }

    // Function to print the linked list
    public static void printLinkedList(ReverseLL2.ListNode head)
    {
        ReverseLL2.ListNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    static class ListNode
    {
        // Data stored in the node
        int data;
        // Pointer to the next
        // node in the list
        ListNode next;

        // Constructor with both data
        // and next node as parameters
        ListNode(int data, ReverseLL2.ListNode next)
        {
            this.data = data;
            this.next = next;
        }

        // Constructor with only data as
        // a parameter, sets next to null
        ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

}
