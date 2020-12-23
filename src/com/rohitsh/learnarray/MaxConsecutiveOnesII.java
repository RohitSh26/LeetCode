package com.rohitsh.learnarray;

public class MaxConsecutiveOnesII {

    /*
        Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.

        Example 1:

        Input: [1,0,1,1,0]
        Output: 4
        Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
            After flipping, the maximum number of consecutive 1s is 4.
        Note:

        The input array will only contain 0 and 1.
        The length of input array is a positive integer and will not exceed 10,000
        Follow up: What if the input numbers come in one by one as an infinite stream? In other words, you can't store all numbers coming from the stream as it's too large to hold in memory. Could you solve it efficiently?

     */

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0, left = 0, q = - 1, count = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 0){

                left = q + 1;

                q = i;

            }

            System.out.println(left + " -> " + i);

            max = Math.max(max, i - left + 1);
        }

        return max;
    }


    public static int findMaxConsecutiveOnesSlidingWindow(int[] nums) {

        int max = 0;
        int left = 0;
        int zeroCount = 0;

        int numOfZeroesInBetween = 1;

        // we will create a window of left and right with max numOfZeroesInBetween

        for (int right = 0; right < nums.length; right++) {

            if(nums[right] == 0) zeroCount++;

            // number of zeroes encounter is greater that 1
            if(zeroCount > numOfZeroesInBetween){

                // decrease zero count
                zeroCount--;

                if(nums[left] == 0){

                }

                // move your left by one step
                left++;
            }

            // current max ones
            max = Math.max(max, right - left + 1);
        }

        return max;
    }


    public static void main(String[] args) {

        int[] nums = new int[] {0,1,1,1,0,1};

        System.out.println(findMaxConsecutiveOnes(nums));

        System.out.println(findMaxConsecutiveOnesSlidingWindow(nums));
    }
}
