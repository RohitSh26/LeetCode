namespace c_sharp.recusrsion
{
    public class ReverseStringII
    {
        public static void Reverse(char[] s)
        {
            int left = 0, right = s.Length - 1;

            Helper(s, left, right);
        }

        private static void Helper(char[] s, int left, int right)
        {
            if(left >= right) return;

            // swap two indexes
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // call helper with next indexes
            left++; right--;

            Helper(s, left, right);
        }
    }
}