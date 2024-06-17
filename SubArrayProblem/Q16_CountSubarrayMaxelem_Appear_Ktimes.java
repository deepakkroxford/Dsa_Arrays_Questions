package SubArrayProblem;

class appearsK_time {
    public long countSubarrays(int[] nums, int k) {
        long maxe = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxe) {
                maxe = nums[i];
            }
        }
        long i = 0;
        long j = 0;
        long count = 0;
        long ans = 0;
        while (i < nums.length) {
            if (nums[(int) i] == maxe) {
                count++;
            }
            while (count >= k) {
                ans = ans + nums.length - i;
                if (nums[(int) j] == maxe) {
                    count--;
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}

/**
 * Q16_CountSubarrayMaxelem_Appear_Ktimes
 */
public class Q16_CountSubarrayMaxelem_Appear_Ktimes {
    public static void main(String[] args) {
        /*
         * leetcode -->2962
         * you are given an integer array nums and a positive integer k.
         * 
         * Return the number of subarrays where the maximum element of nums appears at
         * least k times in that subarray.
         * 
         * A subarray is a contiguous sequence of elements within an array.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,3,2,3,3], k = 2
         * Output: 6
         * Explanation: The subarrays that contain the element 3 at least 2 times are:
         * [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
         * Example 2:
         * 
         * Input: nums = [1,4,2,1], k = 3
         * Output: 0
         * Explanation: No subarray contains the element 4 at least 3 times.
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 105
         * 1 <= nums[i] <= 106
         * 1 <= k <= 105
         * 
         * Sliding Window Concept
         */

        appearsK_time solution = new appearsK_time();

        // Example 1
        int[] nums1 = { 1, 3, 2, 3, 3 };
        int k1 = 2;
        System.out.println("Example 1 Output: " + solution.countSubarrays(nums1, k1));

        // Example 2
        int[] nums2 = { 1, 4, 2, 1 };
        int k2 = 3;
        System.out.println("Example 2 Output: " + solution.countSubarrays(nums2, k2));
    }
}