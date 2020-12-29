package com.rohitsh.recursion;

public class SwapNodesInPair {

    private static void helper(ListNode head)
    {
        if(head == null || head.next == null) return;

        // swap
        var temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;

        // call recursively
        helper(head.next.next);
    }

    public static ListNode swapPairs(ListNode head) {

        helper(head);
        return head;
    }
}
