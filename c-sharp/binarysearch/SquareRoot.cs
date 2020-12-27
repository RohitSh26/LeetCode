/*
Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
*/

using System;

namespace c_sharp.binarysearch
{

    public class SquareRootProblem
    {
        public static int SquareRoot(int x)
        {
            int left = 0, right = x;

            while(left + 1 < right)
            {
                // pivot
                int mid = left + (right - left) / 2;

                // check if value at pivot
                if(x == Math.Pow(mid, 2)) return mid;

                else if(x > Math.Pow(mid, 2)) left = mid;

                else right = mid; 
            }

            if(Math.Pow(right, 2) == x) return right;
            else return left;
            
        }
    }
}