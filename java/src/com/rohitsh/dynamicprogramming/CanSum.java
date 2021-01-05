package com.rohitsh.dynamicprogramming;

import java.util.HashMap;

public class CanSum {

    public static boolean canSum(int sum, int[] nums, HashMap<Integer, Boolean> map) {
        if(map.containsKey(sum)) return map.get(sum);
        // base case
        if(sum == 0) return true;
        if(sum < 0) return false;

        // recursive case
        for (int num : nums) {
            int remaining = sum - num;
            if(canSum(remaining, nums, map) == true){
                map.put(sum, true);
                return true;
            }

        }

        map.put(sum, false);
        return false;

    }

    public static void main(String[] args) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        System.out.println(canSum(7, new int[] {2, 3}, map));
        System.out.println(canSum(7, new int[] {5, 3, 4, 7}, map));
        System.out.println(canSum(7, new int[] {2, 4}, map));
        System.out.println(canSum(8, new int[] {2, 3, 5}, map));

        System.out.println(canSum(300, new int[] {7, 14}, map));

    }
    
}
