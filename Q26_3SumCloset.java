import java.util.Arrays;

class closest3sum {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length < 3) {
            return 0;
        }

        int closetsum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int sum = 0;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - closetsum)) {
                    closetsum = sum;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return closetsum;
    }
}

public class Q26_3SumCloset {
    public static void main(String[] args) {
        /*
         * Leetcode->16
         * Given an integer array nums of length n and an integer target, find three
         * integers in nums such that the sum is closest to target.
         * 
         * Return the sum of the three integers.
         * 
         * You may assume that each input would have exactly one solution.
         * 
         * Example 1:
         * Input: nums = [-1,2,1,-4], target = 1
         * Output: 2
         * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
         * 
         * 
         * Example 2:
         * Input: nums = [0,0,0], target = 1
         * Output: 0
         * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
         * 
         * 
         * Constraints:
         * 
         * 3 <= nums.length <= 500
         * -1000 <= nums[i] <= 1000
         * -104 <= target <= 104
         */
        int[] nums1 = { -1, 2, 1, -4 };
        int target1 = 1;
        closest3sum solution = new closest3sum();
        int result1 = solution.threeSumClosest(nums1, target1);
        System.out.println("Closest sum for [-1, 2, 1, -4] and target 1: " + result1); // Output: 2

        int[] nums2 = { 0, 0, 0 };
        int target2 = 1;
        int result2 = solution.threeSumClosest(nums2, target2);
        System.out.println("Closest sum for [0, 0, 0] and target 1: " + result2); // Output: 0

    }
}
