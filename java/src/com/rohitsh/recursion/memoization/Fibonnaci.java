package com.rohitsh.recursion.memoization;

import java.util.HashMap;

public class Fibonnaci {

    public static int fib(int n){
        int output = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        if(hashMap.containsKey(n)) return hashMap.get(n);

        if(n < 2){
            output = n;
        } else {
            output = fib(n - 2) + fib(n - 1);
        }

        hashMap.put(n, output);

        return output;

    }

    public static void main(String[] args) {

        System.out.println(fib(50));
    }
}
