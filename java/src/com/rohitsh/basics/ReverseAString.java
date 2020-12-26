package com.rohitsh.basics;

import com.rohitsh.utilities.MyUtilities;

import java.util.Arrays;

public class ReverseAString {


    public static String reverseString(String s){
        var stringArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        var n = stringArray.length - 1;
        for (int i = n; i >=0; i--) {
            stringBuilder.append(stringArray[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello World"));
    }
}
