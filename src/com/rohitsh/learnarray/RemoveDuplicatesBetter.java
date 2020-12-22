package com.rohitsh.learnarray;

public class RemoveDuplicatesBetter {

    /*
        Input: nums = [0,0,1,1,1,2,2,3,3,4]
        Output: 5, nums = [0,1,2,3,4]
     */

    static void printArray(int arr[])
    {
        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length - 1;
        int index = 1;

        for(int i = 0; i < n; i++){

            if(nums[i] != nums[i+1]){
                nums[index] = nums[i + 1];
                index++;
            }
        }
        printArray(nums);
        return index;
    }

    public static void main(String[] args) {

        var nums = new int[] {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));

    }
}
