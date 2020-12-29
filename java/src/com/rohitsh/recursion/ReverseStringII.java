package com.rohitsh.recursion;

public class ReverseStringII {

    private static void helper(char[] s, int left, int right){
        // base case
        if(left >= right) return;

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        left++;
        right--;

        helper(s, left, right);


    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }

    public static void main(String[] args) {

        var s = new char[]{'h', 'e', 'e'};
        reverseString(s);

        System.out.println(s);

    }

}
