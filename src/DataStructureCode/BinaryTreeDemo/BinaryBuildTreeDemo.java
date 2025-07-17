package DataStructureCode.BinaryTreeDemo;

import java.util.HashMap;

public class BinaryBuildTreeDemo {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {


    }
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < inorder.length; i++) {
//            map.put(inorder[i], i);
//        }
//        int[] index = {0}; // Used to track the preorder index
//        return helper(preorder, 0, inorder.length - 1, map, index);
//    }
//
//    private TreeNode helper(int[] preorder, int l, int r, HashMap<Integer, Integer> map, int[] index) {
//        if (l > r) {
//            return null;
//        }
//        int current = preorder[index[0]];
//        index[0]++;
//
//        TreeNode node = new TreeNode(current);
//        int inOrderIndex = map.get(current);
//
//        // Recursively build left and right subtrees
//        node.left = helper(preorder, l, inOrderIndex - 1, map, index);
//        node.right = helper(preorder, inOrderIndex + 1, r, map, index);
//
//        return node;
//    }



    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        int[] index = {0}; // Used to track the preorder index
        return helper(postorder, 0, inorder.length - 1, map, index);
    }

    private TreeNode helper(int[] postorder, int l, int r, HashMap<Integer, Integer> map, int[] index) {
        if (l > r) {
            return null;
        }
        int current = postorder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);
        int inOrderIndex = map.get(current);

        // Recursively build left and right subtrees
        node.left = helper(postorder, l, inOrderIndex - 1, map, index);
        node.right = helper(postorder, inOrderIndex + 1, r, map, index);

        return node;
    }


}
