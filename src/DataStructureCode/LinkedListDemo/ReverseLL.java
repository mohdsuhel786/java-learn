package DataStructureCode.LinkedListDemo;

import java.util.Stack;

public class ReverseLL {




    // Node class represents a
// node in a linked list
    static class Node {
        // Data stored in the node
        int data;
        // Pointer to the next
        // node in the list
        Node next;

        // Constructor with both data
        // and next node as parameters
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        // Constructor with only data as
        // a parameter, sets next to null
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseLinkedListStack(Node head) {
        // Create a temporary pointer to
        // traverse the linked list
        Node temp = head;

        // Create a stack to temporarily
        //store the data values
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push the values of the
        // linked list onto the stack
        while (temp != null) {
            // Push the current node's
            // data onto the stack
            stack.push(temp.data);
            // Move to the next node
            // in the linked list
            temp = temp.next;
        }
        // Reset the temporary pointer
        // to the head of the linked list
        temp = head;

        // Step 2: Pop values from the stack
        // and update the linked list
        while (temp != null) {
            // Set the current node's data
            // to the value at the top of the stack
            temp.data = stack.pop();
            // Move to the next node
            // in the linked list
            temp = temp.next;
        }
        // Return the new head of
        // the reversed linked list
        return head;
    }
    // Function to reverse a linked list
// using the 3-pointer approach
    public static Node reverseLinkedList(Node head) {

        // Initialize'temp' at
        // head of linked list
        Node temp = head;

        // Initialize pointer 'prev' to NULL,
        // representing the previous node
        Node prev = null;

        // Traverse the list, continue till
        // 'temp' reaches the end (NULL)
   while(temp != null){
            // Store the next node in
            // 'front' to preserve the reference
            Node front = temp.next;

            // Reverse the direction of the
            // current node's 'next' pointer
            // to point to 'prev'
            temp.next = prev;

            // Move 'prev' to the current
            // node for the next iteration
            prev = temp;

            // Move 'temp' to the 'front' node
            // advancing the traversal
            temp = front;
        }

        // Return the new head of
        // the reversed linked list
   return prev;

    }
    public static Node reverseLinkedListRec(Node head) {
        // Base case:
        // If the linked list is empty or has only one node,
        // return the head as it is already reversed.
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive step:
        // Reverse the linked list starting
        // from the second node (head.next).
        Node newHead = reverseLinkedListRec(head.next);

        // Save a reference to the node following
        // the current 'head' node.
        Node front = head.next;

        // Make the 'front' node point to the current
        // 'head' node in the reversed order.
        front.next = head;

        // Break the link from the current 'head' node
        // to the 'front' node to avoid cycles.
        head.next = null;

        // Return the 'newHead,' which is the new
        // head of the reversed linked list.
        return newHead;
    }

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with values 1, 3, 2, and 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = reverseLinkedList(head);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}




