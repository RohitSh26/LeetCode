package com.rohitsh.learnarray;

public class MergeSortedArray {
    /*
    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

    Note:

    The number of elements initialized in nums1 and nums2 are m and n respectively.
    You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
    Example:

    Input:
    nums1 = [1,2,3,0,0,0], m = 3
    nums2 = [2,5,6],       n = 3

    Output: [1,2,2,3,5,6]


    Constraints:

    -10^9 <= nums1[i], nums2[i] <= 10^9
    nums1.length == m + n
    nums2.length == n
     */

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m + n - 1;
        m--; n--;

        while(i >= 0) {

            // only single element case
            if(m < 0){
                nums1[i] = nums2[n];
                n--;
            }
            else if(n < 0){
                nums1[i] = nums1[m];
                m--;
            }
            else {
                if (nums1[m] > nums2[n]) {
                    nums1[i] = nums1[m];
                    m--;
                } else {
                    nums1[i] = nums2[n];
                    n--;
                }
            }

            i--;
        }

        return nums1;
    }

    public static void main(String[] args) {
        var nums1 = new int[] {0};
        var nums2 = new int[] {1};

        int m = 0, n = 1;

        var arr  = merge(nums1, m, nums2, n);


        for (int i:
             arr) {
            System.out.println(i);
        }

    }

}
