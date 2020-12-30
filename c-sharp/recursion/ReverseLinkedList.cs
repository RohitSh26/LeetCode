namespace c_sharp.recursion
{
    public class ReverseLinkedList
    {
        public static ListNode Reverse(ListNode head)
        {
            // create a new node to store null
            ListNode prev = null;

            while (head != null)
            {
                // store next of head in a temp var
                var temp = head.next;

                // set next of head tp previous
                head.next = prev;

                // move your prev to current head
                prev = head;

                // set head to temp for next iteration
                head = temp;
            }

            return prev;
        }
    }
}