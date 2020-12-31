namespace c_sharp.recursion.memoization
{
    using System.Collections.Generic;
    public class FibonacciMemo
    {
        public static int Fib(int n)
        {
            int output;

            Dictionary<int, int> map = new Dictionary<int, int>();

            if(map.ContainsKey(n)) return map[n];

            if(n < 2)
            {
                output = n;
            }
            else
            {
                output = Fib(n - 2) + Fib(n - 1);
            }

            map[n] = output;

            return output;
        }
    }
}