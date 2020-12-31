package com.rohitsh.recursion.memoization;

import java.util.HashMap;

public class ClimbingStairs {

    public static int climbStairs(int n) {
//        HashMap<Integer, Integer> memo = new HashMap<>();
//
//        // check if its in memory, if yes, return result from memo
//        if(memo.containsKey(n)) return memo.get(n);
//
//        int output;
//        if(n < 3) output = n;
//        else output = climbStairs(n - 2) + climbStairs(n - 1);
//
//        // store result in memo
//        memo.put(n, output);
//
//        // return the result
//        return output;

        int a = 0, b = 1;
        int temp = a + b;

        for (int i = 0; i < n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }

        return temp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(climbStairs(i));
        }

        System.out.println(climbStairs(44));

    }
}
