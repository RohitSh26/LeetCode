package com.rohitsh.binarysearchproblems;

public class GuessNumberHigherOrLower {

    public static int guessNumber(int n) {

        int left  = 0, right = n;

        while(left < right) {

            int mid = left + (right - left) / 2;

            int myGuess = guess(mid);

            if(myGuess == 0){
                return mid;
            }
            else if(myGuess < 0){
                left = mid;
            }
            else
                right = mid;
        }

        return -1;
    }


    public static int guess(int n) {

        if(n == n){
            return 0;
        } else if( n < n ) {
            return -1;
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println(guessNumber(9));
    }
}
