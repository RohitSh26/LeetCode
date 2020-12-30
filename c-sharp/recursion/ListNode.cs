namespace c_sharp.recursion
{
    public class LinkedList
    {
        public ListNode head;

    }
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
}