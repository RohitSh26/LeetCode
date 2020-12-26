package com.rohitsh.learnarray;

import java.util.Arrays;

public class FindNumbersWithEvenNumberOfDigits {

    public static int findNumbers(int[] nums) {

        return (int) Arrays.stream(nums).parallel().filter(i -> String.valueOf(i).length() % 2 == 0).count();
    }

    public static void main(String[] args) {
        var nums = new int[]{12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
