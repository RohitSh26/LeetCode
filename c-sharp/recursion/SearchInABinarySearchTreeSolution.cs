namespace c_sharp.recursion
{
    public class SearchInABinarySearchTreeSolution
    {
        public static TreeNode SearchBST(TreeNode root, int val)
        {
            if(root == null) return null;

            return helper(root, val);
        }

        public static TreeNode helper(TreeNode root, int val)
        {
            if(root == null) return null;

            if(root.val == val) return root;
            else if(root.val > val) return helper(root.left, val);
            return helper(root.right, val);
        }

    }    
}