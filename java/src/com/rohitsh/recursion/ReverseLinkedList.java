package com.rohitsh.recursion;

import java.util.IllegalFormatCodePointException;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while(head != null){

            // store next node
            var temp = head.next;

            // set current head to previous
            head.next = prev;

            // set head to temp
            prev = head;

            // set head to next node
            head = temp;
        }

        return prev;
    }

    public ListNode reverseListRecursive(ListNode head){

        ListNode prev = null;
        return helper(head, prev);
    }

    private ListNode helper(ListNode head, ListNode prev){

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
