namespace c_sharp
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

            for(int i = 0; i < n; i++)
            {
                if (i == 0 || i == 1) System.Console.WriteLine(i);
                else
                {
                    c = a + b;
                    System.Console.WriteLine(c);
                    a = b;
                    b = c;
                }
  
            }
            return c;
        }
    }
    
}