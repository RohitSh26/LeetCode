package com.rohitsh.dynamicprogramming;

/*
Say that you are a traveler in a 2D grid.
You begin in the top-left corner and tour foal is to travel to the bottom-right corner.
You may only move down or right.

In how many ways can your travel to the goal on a grid with dimensions m * n ?
 */

import java.util.HashMap;

public class TravelerOn2DGrid {

    public static long travelerOnGrid(int left, int right, HashMap<String, Long> map) {

        String key = left + "," + right;
        if(map.containsKey(key)) {
            return map.get(key);
        }

        // base cases
        if(left == 0 || right == 0) return  0;
        if(left == 1 && right == 1) return 1;

        long val = travelerOnGrid(left - 1, right, map) + travelerOnGrid(left, right - 1, map);

        map.put(key, val);

        return val;
    }
    

    public static void main(String[] args) {
        int left = 2, right = 3;
        HashMap<String, Long> map = new HashMap<>();

        System.out.println(travelerOnGrid(left = 2, right = 3, map));

        // starting time 
        long start = System.currentTimeMillis();

        //takes 19281ms
        HashMap<String, Long> map1 = new HashMap<>();
        System.out.println(travelerOnGrid(left = 18, right = 18, map1));

        // ending time 
        long end = System.currentTimeMillis();
        System.out.println("Time taken " + (end - start) + "ms");
    }

}
