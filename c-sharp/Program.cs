using System;
using c_sharp.basics;
using c_sharp.binarysearch;
using c_sharp.arrays;

namespace c_sharp
{
    class Program
    {
        static void Main(string[] args)
        {
            bool current = false;

            if (!current)
            {
                // Basics
                System.Console.WriteLine("Basic Programming");

                // Fibonacci Recursive and Iterative
                System.Console.WriteLine();
                System.Console.WriteLine("Fibonacci Recursive and Iterative");
                System.Console.WriteLine(Fibonacci.FibRecursive(n: 5));
                System.Console.WriteLine(Fibonacci.FibIterative(n: 5));

                System.Console.WriteLine();

                // Leetcode Arrays
                System.Console.WriteLine();
                System.Console.WriteLine("CheckIfNumberAndItsDoubleExists");
                System.Console.WriteLine(CheckIfNumberAndItsDoubleExists.CheckIfExist(arr: new int[] {10,2,5,3}));
                System.Console.WriteLine(CheckIfNumberAndItsDoubleExists.CheckIfExist(arr: new int[] {3,1,7,11}));     
                System.Console.WriteLine();

                System.Console.WriteLine("ValidMountainArrayProblem");
                System.Console.WriteLine(ValidMountainArrayProblem.ValidMountainArray(arr: new int[]{1,3, 2, 1, 0}));
                System.Console.WriteLine(ValidMountainArrayProblem.ValidMountainArray(arr: new int[]{1,3, 2, 5, 1}));


                // Binary Search
                System.Console.WriteLine();
                System.Console.WriteLine("BinarySearchAlgorithm");
                System.Console.WriteLine(BinarySearch.BinarySearchAlgorithm(nums: new int[] {-1,0,3,5,9,12}, target: 0));

                // Leet code Binary Search - SquareRoot
                System.Console.WriteLine();
                System.Console.WriteLine("SquareRoot");
                System.Console.WriteLine(SquareRootProblem.SquareRoot(x: 19));

                System.Console.WriteLine();
            }
            
            // currently testing 

            
            


        }
    }
}
