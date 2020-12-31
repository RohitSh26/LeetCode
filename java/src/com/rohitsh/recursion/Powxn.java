package com.rohitsh.recursion;

public class Powxn {

    public static double myPow(double x, int n) {

        return helper(x, n);

    }

    private static double helper(double x, int n){
        double result;

        if(n == 0) return 1;
        if(n % 2 == 0) {

            result = Math.pow(x, n/2);
            return result * result;
        }
        else return x * Math.pow(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2147483648));
    }
}

