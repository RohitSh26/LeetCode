namespace c_sharp.utilities
{
    public class MyUtilities
    {
        public static void PrintArray(int[] a)
        {
            for(int i=0; i < a.Length; i++) System.Console.Write(a[i] + " ");
        }

        public static void PrintCharArray(char[] a)
        {
            for(int i=0; i < a.Length; i++) System.Console.Write(a[i] + " ");
        }

        public static int CountNumberOfDigits(int num)
        {
            int count = 0;
            while(num > 0)
            {
                num = num / 10;
                count++;
            }
            return count;
        }

    }
}