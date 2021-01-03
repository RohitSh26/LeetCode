package com.rohitsh.recursion;

public class MergeTwoSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // check null cases here
        if(l1 == null && l2 == null) return null;

        // if l1 is null
        if((l1 == null && l2 != null)) return l2;

        // if l2 is null
        if((l2 == null && l1 != null)) return l1;

        // otherwise, add compare two list and add smaller values in output
        ListNode head = new ListNode();
        ListNode output = head;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }

            head = head.next;
        }

        if(l1 == null) head.next = l2;
        if(l2 == null) head.next = l1;


        return output.next;
    }

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();

        linkedList1.head = new ListNode(1);
        linkedList1.head.next = new ListNode(2);
        linkedList1.head.next.next = new ListNode(4);
        linkedList1.head.next.next = new ListNode(5);
        linkedList1.head.next.next.next = null;

        LinkedList linkedList2 = new LinkedList();

        linkedList2.head = new ListNode(1);
        linkedList2.head.next = new ListNode(3);
        linkedList2.head.next.next = new ListNode(4);
        linkedList2.head.next.next.next = null;

        var newLinkedList = mergeTwoLists(linkedList1.head, linkedList2.head);
    }
}
