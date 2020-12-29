namespace c_sharp.recusrsion
{
    public class ListNode
    {
        public int val;
        public ListNode next;
        public ListNode(int val = 0, ListNode next = null)
        {
            this.val = val;
            this.next = next;
        }
    }
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