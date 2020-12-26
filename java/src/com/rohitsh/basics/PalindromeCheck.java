package com.rohitsh.basics;

public class PalindromeCheck {

    public static boolean isPalindrome(String s){
        var arr = s.toCharArray();
        var n = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[n - i]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("AABBCDECBBAA"));
    }
}
