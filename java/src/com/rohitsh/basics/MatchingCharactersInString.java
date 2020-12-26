package com.rohitsh.basics;

import java.util.HashMap;
import java.util.HashSet;

public class MatchingCharactersInString {

    public static void printMatchingCharacters(String s){

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(! hashMap.containsKey(c)){
                hashMap.put(c, 1);
            } else {
                int val = hashMap.get(c);
                hashMap.put(c, ++val);
            }
        }

        for(var i : hashMap.keySet()){
            if(hashMap.get(i) > 1){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        String s = "char with ch"; // => c and h are matching chars

        printMatchingCharacters(s);
    }
}
