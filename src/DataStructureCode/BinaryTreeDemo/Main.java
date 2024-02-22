package DataStructureCode.BinaryTreeDemo;
import java.util.*;



    // Node class representing a node in the tree
    class Node {
        int weight;
        List<Node> children;

        // Constructor
        Node(int weight) {
            this.weight = weight;
            this.children = new ArrayList<>();
        }
    }

    public class Main {

        // Function to check if a number is prime
        static boolean isPrime(int n) {
            if (n <= 1)
                return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }

        // Function to count the number of nodes in the tree whose
        // weight is prime using BFS
        static int countPrimeNodes(Node root) {
            int count = 0;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node current = queue.poll();
                if (isPrime(current.weight))
                    count++;
                for (Node child : current.children)
                    queue.add(child);
            }
            return count;
        }
        //Driver code
        public static void main(String[] args) {
            // Create the tree
            Node root = new Node(5);
            Node node1 = new Node(4);
            Node node2 = new Node(3);
            Node node3 = new Node(7);
            Node node4 = new Node(2);
            root.children.add(node1);
            root.children.add(node2);
            node1.children.add(node3);
            node2.children.add(node4);

            // Count the number of nodes whose weight is prime
            int primeCount = countPrimeNodes(root);
            System.out.println("Number of nodes whose weight is prime: " + primeCount);


        }
    }


