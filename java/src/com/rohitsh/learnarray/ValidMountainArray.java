package com.rohitsh.learnarray;

public class ValidMountainArray {
    /*
    Given an array of integers arr, return true if and only if it is a valid mountain array.

    Recall that arr is a mountain array if and only if:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
    arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     */

    public static boolean validMountainArray(int[] arr) {
        var n = arr.length;
        if(n >= 3){
            var i = 0;

            while (i < n - 1 && (arr[i + 1] > arr[i])) {
                i++;
            }
            if(i == 0 || i == arr.length - 1) {
                return false;
            }

            while (i < n - 1 && (arr[i + 1] < arr[i])) {
                i++;
            }


            return i == n - 1;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        var arr = new int[] {0, 3, 2, 1};

        System.out.println(validMountainArray(arr));
    }
}
