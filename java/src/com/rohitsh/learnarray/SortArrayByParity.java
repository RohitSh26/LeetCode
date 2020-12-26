package com.rohitsh.learnarray;

import com.rohitsh.utilities.MyUtilities;

public class SortArrayByParity {

    /*

        Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

        You may return any answer array that satisfies this condition.



        Example 1:

        Input: [3,1,2,4]
        Output: [2,4,3,1]
        The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     */

    public static int[] sortArrayByParity(int[] A) {

        // a result array
        var Output = new int[A.length];

        // empty checks
        if(A == null || A.length == 0){
            return null;
        }


        // take a initial pointer
        int pointer = 0;

        for (int i = 0; i < A.length; i++) {

            // check if element at index is even
            if(A[i] % 2 == 0) {
                // store value at pointer
                Output[pointer] = A[i];

                // increment pointer
                pointer++;
            }
        }

        // now fill rest of the elements
        for (int i = 0; i < A.length; i++) {
            // check if element at index is odd
            if(A[i] % 2 != 0) {
                // store value at pointer
                Output[pointer] = A[i];

                // increment pointer
                pointer++;
            }
        }

        return Output;
    }


    public static void main(String[] args) {

        var A = new int[] {3,1,2,4};

        MyUtilities.printArray(sortArrayByParity(A));
    }

}
