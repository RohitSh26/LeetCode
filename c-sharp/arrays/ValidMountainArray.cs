/*
    Given an array of integers arr, return true if and only if it is a valid mountain array.

    Recall that arr is a mountain array if and only if:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
    arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

*/

namespace c_sharp.arrays
{
    public class ValidMountainArrayProblem
    {
        public static bool ValidMountainArray(int[] arr)
        {
            if(arr.Length < 3) return false;

            int index = 0;

            int n = arr.Length;

            while (index < n - 1 &&  (arr[index] < arr[index + 1])  )
            {
                index++;
            }

            if (index == n - 1) return false;

            while(index < n - 1 &&  (arr[index] > arr[index + 1])  )
            {
                index++;
                
            }

            return index == n - 1;
        }
    }
}
