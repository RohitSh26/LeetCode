namespace c_sharp.recursion
{
    public class MergeTwoSortedLinkedList
    {
        public static ListNode MergeSortedLists(ListNode l1, ListNode l2)
        {
            // check for nulls
            if(l1 == null && l2 == null) return null;
            if(l1 == null) return l2;
            if(l2 == null) return l1;

            // create a output list
            ListNode head = new ListNode();
            ListNode output = head;

            // run a while loop, check both list have items to compare
            while (l1 != null && l2 != null)
            {
                if(l1.val <= l2.val)
                {
                    head.next = l1;
                    l1 = l1.next;
                } 
                else
                {
                    head.next = l2;
                    l2 = l2.next;
                }

                head = head.next;
            }
            
            // add remaining values
            if(l1 == null) head.next = l2;

            if(l2 == null) head.next = l1;


            return output.next;
        }
    }
}