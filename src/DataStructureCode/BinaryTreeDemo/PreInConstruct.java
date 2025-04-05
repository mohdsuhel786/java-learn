package DataStructureCode.BinaryTreeDemo;

import java.util.HashMap;

public class PreInConstruct
{

    public static void main(String[] args)
    {
        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preOrder, inOrder);
        printInorder(root); // To verify the tree is built correctly
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
        {
            map.put(inorder[i], i);
        }
        int[] index = {0}; // Used to track the preorder index
        return helper(preorder, 0, inorder.length - 1, map, index);
    }

    private static TreeNode helper(int[] preorder, int l, int r, HashMap<Integer, Integer> map, int[] index)
    {
        if (l > r)
        {
            return null;
        }
        int current = preorder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);
        int inOrderIndex = map.get(current);

        // Recursively build left and right subtrees
        node.left = helper(preorder, l, inOrderIndex - 1, map, index);
        node.right = helper(preorder, inOrderIndex + 1, r, map, index);

        return node;
    }

    public static void printInorder(TreeNode root)
    {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode()
        {
        }

        TreeNode(int val)
        {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
