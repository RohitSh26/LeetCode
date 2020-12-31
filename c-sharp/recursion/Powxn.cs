using System;

namespace c_sharp.recursion
{
    public class Powxn
    {
        public static double Pow(double x, int n)
        {
            return Helper(x, n);
        }

        private static double Helper(double x, int n)
        {
            if(n == 0) return 1;
            
            if(n % 2 == 0) return Math.Pow(x, n/2) * Math.Pow(x, n/2);
            else return x * Math.Pow(x, n - 1);

        }
    }
}