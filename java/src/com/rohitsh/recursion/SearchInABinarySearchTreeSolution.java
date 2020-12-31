package com.rohitsh.recursion;

public class SearchInABinarySearchTreeSolution {

    /*

    Given the root node of a binary search tree (BST) and a value.
    You need to find the node in the BST that the node's value equals the given value.
    Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
    For example,

    Given the tree:
            4
           / \
          2   7
         / \
        1   3

    And the value to search: 2
    You should return this subtree:

          2
         / \
        1   3

    In the example above, if we want to search the value 5, since there is no node with value 5, we should return NULL.
    Note that an empty tree is represented by NULL, therefore you would see the expected output (serialized tree format) as [], not null.
     */

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        return helper(root, val);
    }

    private static TreeNode helper(TreeNode root, int val){
        if(root == null) return null;
        if(root.val == val) return root;
        if(root.val < val) return helper(root.right, val);
        return helper(root.left, val);
    }


    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root = new TreeNode(4);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(7);
        tree.root.right = new TreeNode(1);
        tree.root.right = new TreeNode(3);

        var treeNode  = searchBST(tree.root, 2);

        TreeNode.print2DUtil(treeNode, TreeNode.COUNT);
    }
}
