package com.rohitsh.recursion;

public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {

        if(root == null) return 0;
        else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            if(left > right) return left + 1;
            else return right + 1;
        }
    }

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(7);
        tree.root.right = new TreeNode(1);
        tree.root.right = new TreeNode(3);

        System.out.println(maxDepth(tree.root));

    }
}
