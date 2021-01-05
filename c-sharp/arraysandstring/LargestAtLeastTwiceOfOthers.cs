namespace c_sharp.arraysandstring
{
    public class LargestAtLeastTwiceOfOthers
    {
        public static int DominantIndex(int[] nums) 
        {
            int max = 0;
            int maxIndex = 0;
            // get max value
            for (int i = 0; i < nums.Length; i++)
            {
                if(nums[i] > max) 
                {
                    max = nums[i];
                    maxIndex = i;
                }
            }

            for (int i = 0; i < nums.Length; i++)
            {
                if(nums[i] != max)
                {
                    if(! (max >= 2 * nums[i]))
                    {
                        return -1;
                    }
                }
            }

            return maxIndex;
        }
    }
}