package com.rohitsh.learnarray;

/*
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
 */

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        var count_current = 0;
        var max = count_current;
        for (int i : nums) {
            if( i == 1 ){
                count_current++;
            } else {
                count_current = 0;
            }

            if(count_current > max)
                max = count_current;
        }
        return max;
    }

    public static void main(String[] args) {
        var nums = new int[]{1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
