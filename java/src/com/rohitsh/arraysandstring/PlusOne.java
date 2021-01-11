package com.rohitsh.arraysandstring;

import com.rohitsh.utilities.MyUtilities;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int[] arr = null;

        for (int i = digits.length - 1; i >= 0 ; i--) {
            // if digit is less than 9, just add one and return at that point
            // 1, 3, [8] -> 1, 3, 9 -> return
            // 1, 8, 9 -> 1, 8, 0 -> 1, 9, 0 -> return
            // 9, 8, 7 -> 9, 8, 8 -> 9, 9, 8 -> 0, 9, 8 -> we should take care of this case
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // 9, 8, 7 -> 9, 8, 8 -> 9, 9, 8 -> 0, 9, 8 -> we should take care of this case
        // we know that the first digit must be 9 and we have reached this case
        arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }

    public static void main(String[] args) {
        MyUtilities.printArray(plusOne(new int[]{9,8, 9}));
    }

}
