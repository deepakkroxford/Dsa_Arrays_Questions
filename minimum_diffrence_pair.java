import java.util.Arrays;

public class minimum_diffrence_pair {
    public static void main(String[] args) {
        /*
         * Given an unsorted array, find the minimum difference between any pair in
         * given array.
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [2, 4, 5, 9, 7]
         * Output: 1
         * Explanation: Difference between 5 and 4 is 1.
         * Example 2:
         * 
         * Input: nums = [3, 10, 8, 6]
         * Output: 2
         * Explanation: Difference between 8 and 6 is 2.
         * 
         */

        class Solution {
            public int minimum_difference(int[] nums) {
                // code here
                Arrays.sort(nums);
                int dif = Integer.MAX_VALUE;
                int sum = 0;
                for (int i = 1; i < nums.length; i++) {
                    sum = Math.abs(nums[i] - nums[i - 1]);
                    if (sum < dif) {
                        dif = sum;
                    }
                }
                return dif;
            }
        }
    }
}
