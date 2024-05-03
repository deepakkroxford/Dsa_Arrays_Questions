package SubArrayProblem;

class Maximum_averageSubarray{
    public double findMaxAverage(int[] nums, int k) {
         double ans = 0.0;
         double avg = 0.0;

         int sum =0;
         for(int i=0;i<k;i++)
         {
            sum +=nums[i];
         }
         avg = sum *1.0/k;
         ans= avg;

         for(int i=k;i<nums.length;i++)
         {
            sum = sum +nums[i]-nums[i-k];
            avg = sum*1.0/k;
            ans = Math.max(ans, avg);
         }
         return ans;
    }

    public double secondMethodfindMaxAverage(int[] nums, int k) {
            /*
            in this method we have to find the maximum sum and at the last we have to 
            to divide by k 
            */

            int sum =0;
            for(int i =0;i<k;i++)
            {
                sum = sum +nums[i];
            }
            int maxsum = 0;
            
            for(int i=k;i<nums.length;i++)
            {
                sum = sum + nums[i]-nums[i-k];
                maxsum = Math.max(maxsum, sum);
            }
            return (double)maxsum/k;
    }
}
public class Q9_Maximum_average_Subarray {
    public static void main(String[] args) {
        /*
         * You are given an integer array nums consisting of n elements, and an integer
         * k.
         * 
         * Find a contiguous subarray whose length is equal to k that has the maximum
         * average value and return this value. Any answer with a calculation error less
         * than 10-5 will be accepted.
         * 
         * 
         * Example 1:
         * Input: nums = [1,12,-5,-6,50,3], k = 4
         * Output: 12.75000
         * Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
         * 
         * Example 2:
         * Input: nums = [5], k = 1
         * Output: 5.00000
         * 
         * 
         * Constraints:
         * n == nums.length
         * 1 <= k <= n <= 105
         * -104 <= nums[i] <= 10
         * 
         */
        Maximum_averageSubarray ans = new Maximum_averageSubarray();
        int arr[]={1,12,-5,-6,50,3};
        int k=4;
        System.out.println("The maximum average Subarray is "+ans.findMaxAverage(arr,k));
        System.out.println(ans.secondMethodfindMaxAverage(arr,k));
    }
}
