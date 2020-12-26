package com.rohitsh.learnarray;

import java.util.Arrays;

public class HeightChecker {

    /*
        Students are asked to stand in non-decreasing order of heights for an annual photo.

        Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

        Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.



        Example 1:

        Input: heights = [1,1,4,2,1,3]
        Output: 3
        Explanation:
        Current array : [1,1,4,2,1,3]
        Target array  : [1,1,1,2,3,4]
        On index 2 (0-based) we have 4 vs 1 so we have to move this student.
        On index 4 (0-based) we have 1 vs 3 so we have to move this student.
        On index 5 (0-based) we have 3 vs 4 so we have to move this student.
        Example 2:

        Input: heights = [5,1,2,3,4]
        Output: 5
        Example 3:

        Input: heights = [1,2,3,4,5]
        Output: 0

     */


    public static int heightChecker(int[] heights) {

        // create a duplicate of original array
        var temp = Arrays.copyOf(heights, heights.length);

        // sort duplicate array
        Arrays.sort(temp);

        // counter
        int count = 0;

        // compare positions where sorted and unsorted heights do not match, count all and return
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != temp[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] heights = new int[] {1,2,3,4,5};

        System.out.println(heightChecker(heights));
    }
}
