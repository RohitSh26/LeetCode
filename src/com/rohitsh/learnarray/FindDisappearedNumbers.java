package com.rohitsh.learnarray;
import com.rohitsh.utilities.MyUtilities;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new ArrayList<Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            integers.add(0);
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 1 && nums[i] <= nums.length){
                integers.set(nums[i] - 1, nums[i]);
            }
        }

        int count = 0;

        List<Integer> missedIntegers = new ArrayList<Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if(integers.get(i) != i+1){
                missedIntegers.add(i + 1);

            }
        }


        return missedIntegers;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}
