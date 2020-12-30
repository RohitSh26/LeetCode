namespace c_sharp.recursion
{
    public class SwapNodesInPair
    {
        public static ListNode Swap(ListNode head)
        {
            Helper(head.next.next);

            return head;
        }


        private static void Helper(ListNode head)
        {
            if (head == null || head.next == null) return;

            // swap two nodes
            var temp = head.val;
            head.val = head.next.val;
            head.next.val = temp;

            // call recursively
            Helper(head.next.next);

        }
    }
}