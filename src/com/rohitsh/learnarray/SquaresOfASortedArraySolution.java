package com.rohitsh.learnarray;

import java.util.Arrays;

public class SquaresOfASortedArraySolution {

//    public static int[] sortedSquares(int[] nums) {
//        return Arrays.stream(nums).map(i -> i * 2).sorted().toArray();
//    }

    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int index = arr.length-1;
        int i = 0;
        int j = nums.length-1;

        //square them!
        for(int k=0; k<nums.length; k++){
            nums[k] = (int)Math.pow(nums[k], 2);
        }

        System.out.println();
        //insert bigger value from the end
        while(i <= j){
            if(nums[i] > nums[j]){
                arr[index--] = nums[i++];
            }
            else{
                arr[index--] = nums[j--];
            }
        }

        //copy to original
        for(int k=0; k<nums.length; k++){
            nums[k] = arr[k];
        }

        return nums;
    }

    public static int[] sortedSquareList(int[] nums){

        // an array to hold squares
        var arr = new int[nums.length];

        // square numbers
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int j = 0;
        int k = nums.length - 1;

        int index = nums.length - 1;

        // place largest to end of new array
        while( j < k ){
            if(nums[j] > nums[k]){
                // add to the end
                arr[index--] = nums[j++];
            }
            else {
                arr[index--] = nums[k--];
            }
        }

        // copy to the original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }


    public static void main(String[] args) {

        var nums = new int[] {-4,-1,0,3,10};

        for(int i : sortedSquareList(nums)){
            System.out.println(i);
        }
    }
}
