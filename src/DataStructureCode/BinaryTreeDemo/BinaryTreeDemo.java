package DataStructureCode.BinaryTreeDemo;
import java.util.*;
import java.util.Queue;

/**
 * BinaryTreeDemo
 */
public class BinaryTreeDemo {
    static class Node{
        Node left;
        Node right;
        int data;

        public  Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;

        }

        
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node builtTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode =  new Node(nodes[idx]);
           
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }

       


    }
    public static void preOrderTraversal(Node root){
        if(root == null){
            return ;
        }
      System.out.print(root.data +" ");
         preOrderTraversal(root.left);
         preOrderTraversal(root.right);
        
    }

    public static void inOrderTraversal(Node root){
        if(root == null){
            return ;
        }
      
        inOrderTraversal(root.left);
         System.out.print(root.data +" ");
         inOrderTraversal(root.right);
        
    }

  
    public static void postOrderTraversal(Node root){
        if(root == null){
            return ;
        }
      
         postOrderTraversal(root.left);
         postOrderTraversal(root.right);
         System.out.print(root.data +" ");
        
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
     
    }

    public static int countOfNode(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = countOfNode(root.left);
        int rightNode = countOfNode(root.right);

        return leftNode+rightNode +1;
    }


    public static int sumOfNode(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);

        return leftSum+rightSum +root.data;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight= height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight)+1;
        return myHeight ;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1= diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) +1;
        return Math.max(diam3, Math.max(diam1,diam2));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam =diam;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root ==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;

        int diam3 = left.ht + right.ht+1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);

        return myInfo;


    }


    public static void main(String[] args) {
        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       // BinaryTree tree = new BinaryTree();
       Node root =  BinaryTree.builtTree(nodes);
      //  System.out.println(root.data);
            preOrderTraversal(root);
            System.out.println();

            System.out.println("in Order");
            inOrderTraversal(root);
            System.out.println();
            System.out.println("in Order");
            
            postOrderTraversal(root);
            System.out.println();
            levelOrder(root);
            int count = countOfNode(root);
        System.out.println("Total Node: " + count);
        System.out.println("sum off node: " + sumOfNode(root));
        System.out.println("height: " + height(root));
        System.out.println("diameter "+ diameter(root));
        System.out.println(diameter2(root).diam);
    
    }   
    
}