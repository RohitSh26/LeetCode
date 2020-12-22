package com.rohitsh.learnarray;
public class DuplicateZerosSolution {
/*
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place, do not return anything from your function.

Example 1:
Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

Example 2:
Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 */
    public static void duplicateZeros(int[] arr) {
        int count = 0, n = arr.length;
        for(int i: arr)
            if(i == 0)
                ++count;
        for(int i = n - 1, j = n - 1 + count; i >= 0; --i, --j){
            if(arr[i] == 0) {
                if(j < n)
                    arr[j] = 0;
                --j;
            }
            if(j < n)
                arr[j] = arr[i];
        }
    }

    public static void duplicateZeroesNew(int[] arr){

        int count = 0, n = arr.length;

        for (var i : arr) {
            if(i == 0) ++count;
        }

        int i = n - 1, j = n - 1 + count;

        while(i != j){

            if(arr[i] == 0){
                if(j < n){
                    arr[j] = arr[i];
                }
                j--;
            }
            if(j < n){
                arr[j] = arr[i];
            }
            i--;
            j--;
        }

    }
    public static void main(String[] args) {
        var nums = new int[] {1,0,2,3,0,4,5,0};
        duplicateZeroesNew(nums);
        for(int i : nums) System.out.println(i);;
    }
}