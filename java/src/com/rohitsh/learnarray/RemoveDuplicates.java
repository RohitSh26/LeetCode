package com.rohitsh.learnarray;

public class RemoveDuplicates {

    /*
        Input: nums = [1,1,2]
        Output: 2, nums = [1,2]
     */

    public static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i+1]){
                //a valid number for array
                nums[index] = nums[i+1];
                index ++;
            }
        }
        for(int i : nums){
            System.out.println(i);
        }
        return index;
    }

    public static void main(String[] args) {

        var nums = new int[] {1, 1, 2};

        System.out.println(removeDuplicates(nums));
    }
}
