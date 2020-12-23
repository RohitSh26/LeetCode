package com.rohitsh.binarysearchproblems;

public class SquareRoot {


    public static int mySqrt(int x) {

        long left = 0;
        long right = x;

        while(left + 1 < right){

           long mid = left + (right - left) / 2;

           if(mid * mid == x) return (int)mid;

           else if(x > mid * mid) left = mid;

           else right = mid;

        }

        if( right * right == x) return (int)right;

        return (int)left;


    }

    public static void main(String[] args) {

        System.out.println(mySqrt(8));
    }
}
