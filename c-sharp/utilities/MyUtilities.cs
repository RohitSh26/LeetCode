namespace c_sharp.utilities
{
    public class MyUtilities
    {
        public static void PrintArray(int[] a)
        {
            for(int i=0; i < a.Length; i++) System.Console.Write(a[i] + " ");
        }
    }
}