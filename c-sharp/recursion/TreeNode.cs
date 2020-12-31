namespace c_sharp.recursion
{
    public class TreeNode
    {
        public static readonly int COUNT = 10;
        public int val;
        public TreeNode left;
        public TreeNode right;
        
        TreeNode()
        {
        }

        public TreeNode(int val)
        {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public static void print2DUtil(TreeNode root, int space)
        {

            // Base case
            if (root == null)
                return;

            // Increase distance between levels
            space += COUNT;

            // Process right child first
            print2DUtil(root.right, space);

            // Print current node after space
            // count
            System.Console.WriteLine("\n");
            for (int i = COUNT; i < space; i++)
                System.Console.WriteLine(" ");
            System.Console.WriteLine(root.val + "\n");

            // Process left child
            print2DUtil(root.left, space);
        }
    }

}