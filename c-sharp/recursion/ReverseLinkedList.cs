using c_sharp.utilities;

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


        public static ListNode ReverseListRecursive(ListNode head)
        {

            ListNode prev = null;
            return helper(head, prev);
        }

        private static ListNode helper(ListNode head, ListNode prev)
        {

            if (head == null) return prev;

            // store next node
            var temp = head.next;

            // set current head to previous
            head.next = prev;

            // set head to temp
            prev = head;

            // set head to next node
            head = temp;

            return helper(head, prev);

        }
    }
}