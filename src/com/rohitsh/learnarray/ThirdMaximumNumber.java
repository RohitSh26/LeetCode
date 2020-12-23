package com.rohitsh.learnarray;

import com.rohitsh.utilities.MyUtilities;

import java.util.ArrayList;
import java.util.HashSet;

public class ThirdMaximumNumber {

    /*
        Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

        Example 1:

        Input: [3, 2, 1]

        Output: 1

        Explanation: The third maximum is 1.
        Example 2:

        Input: [1, 2]

        Output: 2

        Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
        Example 3:

        Input: [2, 2, 3, 1]

        Output: 1

        Explanation: Note that the third maximum here means the third maximum distinct number.
        Both numbers with value 2 are both considered as second maximum.

     */


    public static int thirdMax(int[] nums) {

        if(nums.length == 0 || nums == null) return 0;

        if(nums.length == 1) return nums[0];

        if(nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }


        int first = nums[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > first){
                third = second; second = first; first = i;
            } else if(i == first) continue;
            else if(i > second){
                third = second;
                second = i;
            } else if(i == second) continue;
            else if(i > third) third = i;
            else if(i == third) continue;
        }

        System.out.println( first + " -> " + second + " -> " + third);

        if(third != Integer.MIN_VALUE) return third;

        if(third == Integer.MIN_VALUE && second == Integer.MIN_VALUE) return first;

        else return second;
    }


    public static void main(String[] args) {

        int[] nums = new int[] {1,2,-2147483648};

        System.out.println(thirdMax(nums));
    }
}
