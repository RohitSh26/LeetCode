namespace c_sharp.recusrsion
{
    public class ReverseString
    {
        public static void Reverse(string s)
        {
            helper(0, s);
        }

        private static void helper(int index, string s)
        {
            if(s == null || index >= s.Length)
            {
                return;
            }

            helper(index + 1, s);
            
            System.Console.WriteLine(s[index]);

        }
    }
}