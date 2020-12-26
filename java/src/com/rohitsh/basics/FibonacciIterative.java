package com.rohitsh.basics;

public class FibonacciIterative {

    public static int fib(int n){

        if(n == 0 || n == 1){
            return n;
        }

        return fib(n - 2) +fib(n - 1);
    }


    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            System.out.println(fib(i));;
        }
    }
}
