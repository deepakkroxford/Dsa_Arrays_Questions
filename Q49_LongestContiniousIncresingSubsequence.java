import java.util.Arrays;
public class Q49_LongestContiniousIncresingSubsequence {
    public int findLengthOfLCIS(int[] arr) {
        int count = 1;
        int maxLength = count;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                count++;
                maxLength = Math.max(maxLength, count);
            }
            else{
                count=1;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        /*
         * leetcode - 674
         * https://leetcode.com/submissions/detail/1579691294/
         * Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray).
         * The subsequence must be strictly increasing.
         * 
         * Example 1:
         * Input: nums = [1,3,5,4,7]
         * Output: 3
         * Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
         * Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element 4.
         * 
         * Example 2:
         * Input: nums = [2,2,2,2,2]
         * Output: 1
         * Explanation: The longest continuous increasing subsequence is [2] with length 1.
         * 
         * Constraints:
         * 1 <= nums.length <= 10^4
         * -10^9 <= nums[i] <= 10^9
         */
      
        
        int[] nums = {1,3,5,4,7};
        System.out.println("Input array: " + Arrays.toString(nums));
        
        Q49_LongestContiniousIncresingSubsequence obj = new Q49_LongestContiniousIncresingSubsequence();
        int result = obj.findLengthOfLCIS(nums);
        System.out.println("Length of longest continuous increasing subsequence: " + result);

        int[] nums2 = {2,2,2,2,2}; 
        System.out.println("\nInput array: " + Arrays.toString(nums2));
        result = obj.findLengthOfLCIS(nums2);
        System.out.println("Length of longest continuous increasing subsequence: " + result);


         
    }
}
