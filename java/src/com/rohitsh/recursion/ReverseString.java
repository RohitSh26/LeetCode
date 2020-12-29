package com.rohitsh.recursion;

public class ReverseString {

    private static void helper(int index, String s){
        if(s == null || index >= s.length()) return;

        helper(index + 1, s);

        System.out.println(s.charAt(index));
    }

    public static void reverseString(String s) {
        helper(0, s);
    }

    public static void main(String[] args) {
        reverseString("hello world");
    }
}
