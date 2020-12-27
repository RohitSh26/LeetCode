namespace c_sharp.basics
{
    public class Fibonacci
    {
        public static int FibRecursive(int n)
        {
            if(n == 0 || n == 1) return n;
            return FibRecursive(n - 2) + FibRecursive(n - 1);
        }

        public static int FibIterative(int n)
        {
            int a = 0;
            int b = 1;
            int c = 0;

            for(int i = 1; i < n; i++)
            {
                c = a + b;
                a = b;
                b = c;
  
            }
            return c;
        }
    }
    
}