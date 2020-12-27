using System;
using c_sharp.basics;
using c_sharp.binarysearch;

namespace c_sharp
{
    class Program
    {
        static void Main(string[] args)
        {
            // Fibonacci Recursive and Iterative
            System.Console.WriteLine(Fibonacci.FibRecursive(n: 5));
            System.Console.WriteLine(Fibonacci.FibIterative(n: 5));

            // Binary Search
            System.Console.WriteLine(BinarySearch.BinarySearchAlgorithm(nums: new int[] {-1,0,3,5,9,12}, target: 0));
        }
    }
}
