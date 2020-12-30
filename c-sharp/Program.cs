using System;
using c_sharp.basics;
using c_sharp.binarysearch;
using c_sharp.arrays;
using c_sharp.utilities;
using c_sharp.recursion;

namespace c_sharp
{
    class Program
    {
        static void Main(string[] args)
        {
            bool current = true;

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
                System.Console.WriteLine();

                System.Console.WriteLine("MaxConsecutiveOnesII");
                System.Console.WriteLine(MaxConsecutiveOnesII.MaxConsecutiveOnes(new int[]{1,0,1,1,0}));

                System.Console.WriteLine();
                System.Console.WriteLine("MergeSortedArray");
                MyUtilities.PrintArray(MergeSortedArray.Merge(new int[]{1,2,3,0,0,0}, 3, new int[]{4, 5, 6}, 3));
                System.Console.WriteLine();

                System.Console.WriteLine();
                System.Console.WriteLine("FindMaxConsecutiveOnes");
                System.Console.WriteLine(MaxConsecutiveOnes.FindMaxConsecutiveOnes(new int[]{1,1,1,1,1}));
                System.Console.WriteLine();

                System.Console.WriteLine();
                System.Console.WriteLine("FindNumbersWithEvenNumberOfDigits");
                System.Console.WriteLine(FindNumbersWithEvenNumberOfDigits.FindNumber(new int[] {555,901,482,1771}));
                System.Console.WriteLine();

                System.Console.WriteLine();
                System.Console.WriteLine("RemoveElement");
                MyUtilities.PrintArray(RemoveElement.Remove(nums: new int[]{3, 2, 3, 2}, val: 3));
                System.Console.WriteLine();

                // Binary Search
                System.Console.WriteLine();
                System.Console.WriteLine("BinarySearchAlgorithm");
                System.Console.WriteLine(BinarySearch.BinarySearchAlgorithm(nums: new int[] {-1,0,3,5,9,12}, target: 0));

                // Leet code Binary Search - SquareRoot
                System.Console.WriteLine();
                System.Console.WriteLine("SquareRoot");
                System.Console.WriteLine(SquareRootProblem.SquareRoot(x: 19));
                System.Console.WriteLine();


                // Leetcode Recursion 
                System.Console.WriteLine("Leetcode Recursion ");

                System.Console.WriteLine();
                System.Console.WriteLine("Reverse String");
                ReverseString.Reverse("hello world");
                System.Console.WriteLine();

                System.Console.WriteLine();
                System.Console.WriteLine("Reverse String");
                var charArray = new char[] { 'a', 'b', 'c' };
                ReverseStringII.Reverse(charArray);
                MyUtilities.PrintCharArray(charArray);
                System.Console.WriteLine();

                System.Console.WriteLine();
                System.Console.WriteLine("ReverseLinkedList");
                LinkedList list = new LinkedList();
                list.head = new ListNode(1);
                list.head.next = new ListNode(2);
                list.head.next.next = new ListNode(3);

                // print list before change
                System.Console.WriteLine("print list before change");
                MyUtilities.PrintLinkedList(list.head);
                System.Console.WriteLine();
                System.Console.WriteLine("print list after change");
                MyUtilities.PrintLinkedList(ReverseLinkedList.Reverse(list.head));

            }
            
            // currently testing

            
            
            

        }
    }
}
