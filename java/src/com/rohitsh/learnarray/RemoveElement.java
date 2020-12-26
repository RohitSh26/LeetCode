package com.rohitsh.learnarray;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int ele = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[ele] = nums[i];
                ele++;
            }
        }

        return ele;
    }

    public static void main(String[] args) {
        var nums = new int[] {1};

        System.out.println(removeElement(nums, 1));

    }
}
