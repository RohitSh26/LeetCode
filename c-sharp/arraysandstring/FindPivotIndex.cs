namespace c_sharp.arraysandstring
{
    public class FindPivotIndex
    {
        public static int PivotIndex(int[] nums)
        {
            // get sum of array
            int sum = 0;
            foreach (var item in nums)
            {
                sum += item;
            }

            int leftSum = 0;

            for(int i = 0; i < nums.Length; i++)
            {
                if( i != 0) 
                    leftSum += nums[i - 1];  
                if(leftSum * 2 == sum - nums[i]) return i;
                
            }
            return -1;
        }

    }
}