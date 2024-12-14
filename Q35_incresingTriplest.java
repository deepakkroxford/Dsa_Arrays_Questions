public class Q35_incresingTriplest {

    public boolean increasingTriplet(int[] arr) {

        // Time complexity for this code is O(n^3)
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] < arr[j] && arr[j] < arr[k]) {
                        return true;
                    }
                }

            }

        }
        return false;
    }

    public boolean increasingTripletOn(int[] arr) {

        // Time complexity for this code is O(n^3)
        int firstmax = Integer.MAX_VALUE;
        int SecondMax = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstmax) {
                firstmax = arr[i];
            } else if (arr[i] < SecondMax) {
                SecondMax = arr[i];
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
         * LeetCode :-334. Increasing Triplet Subsequence
         * https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
         * Solved
         * Medium
         * 
         * Topics
         * Companies
         * Given an integer array nums, return true if there exists a triple of indices
         * (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such
         * indices exists, return false.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3,4,5]
         * Output: true
         * Explanation: Any triplet where i < j < k is valid.
         * Example 2:
         * 
         * Input: nums = [5,4,3,2,1]
         * Output: false
         * Explanation: No triplet exists.
         * Example 3:
         * 
         * Input: nums = [2,1,5,0,4,6]
         * Output: true
         * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] ==
         * 4 < nums[5] == 6.
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 5 * 105
         * -231 <= nums[i] <= 231 - 1
         * 
         */
        Q35_incresingTriplest obj  = new Q35_incresingTriplest();

         int arr[] = {2,1,5,0,4,6};

         System.out.println(obj.increasingTripletOn(arr));
         System.out.println(obj.increasingTriplet(arr));


    }
}
