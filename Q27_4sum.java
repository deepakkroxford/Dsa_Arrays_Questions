import java.util.*;

class finding4sum {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Set<List<Integer>> result = new HashSet<>();

        if (arr.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {

            for (int j = i + 1; j < arr.length - 2; j++) {
                int sum = 0;
                int left = i + 1;
                int right = arr.length - 1;

                while (left < right) {
                    sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }

            }

        }
        return new ArrayList<>(result);
    }
}

public class Q27_4sum {
    public static void main(String[] args) {
        /*Leetcode ->18
          https://leetcode.com/problems/4sum/description/
         * Given an array nums of n integers, return an array of all the unique
         * quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
         * 
         * 0 <= a, b, c, d < n
         * a, b, c, and d are distinct.
         * nums[a] + nums[b] + nums[c] + nums[d] == target
         * You may return the answer in any order.
         * 
         * 
         * 
         * Example 1:
         * Input: nums = [1,0,-1,0,-2,2], target = 0
         * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
         * 
         * 
         * Example 2:
         * Input: nums = [2,2,2,2,2], target = 8
         * Output: [[2,2,2,2]]
         * 
         * 
         * Constraints:
         * 1 <= nums.length <= 200
         * -109 <= nums[i] <= 109
         * -109 <= target <= 109
         */


         int[] nums1 = {1, 0, -1, 0, -2, 2};
         int target1 = 0;
         finding4sum solution = new finding4sum();
         List<List<Integer>> result1 = solution.fourSum(nums1, target1);
         System.out.println("Test case 1: result is : " + result1);
     
         // Test case 2 (all elements are the same)
         int[] nums2 = {2, 2, 2, 2, 2};
         int target2 = 8;
         List<List<Integer>> result2 = solution.fourSum(nums2, target2);
         System.out.println("Test case 2: result is : " + result2);
     

    }
}
