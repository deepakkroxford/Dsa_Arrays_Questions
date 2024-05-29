package SubArrayProblem;

class longest_Subarray_after_deletion_1 {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int i = 0;
        int j = 0;
        int ans = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                i++;
            } else {
                i++;
                count++;
            }
            while (count > 1 && j < i) {
                if (nums[j] == 0) {
                    count--;
                }
                j++;
            }
            ans = Math.max(ans, i - j - 1); // we have to delete this one not make one and count
        }
        return ans;
    }
}

public class Q15_Longest_subarry_After_deleting_1_zero {
    public static void main(String[] args) {
        /*
         * Given a binary array nums, you should delete one element from it.
         * 
         * Return the size of the longest non-empty subarray containing only 1's in the
         * resulting array. Return 0 if there is no such subarray.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,1,0,1]
         * Output: 3
         * Explanation: After deleting the number in position 2, [1,1,1] contains 3
         * numbers with value of 1's.
         * Example 2:
         * 
         * Input: nums = [0,1,1,1,0,1,1,0,1]
         * Output: 5
         * Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1]
         * longest subarray with value of 1's is [1,1,1,1,1].
         * Example 3:
         * 
         * Input: nums = [1,1,1]
         * Output: 2
         * Explanation: You must delete one element.
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 105
         * nums[i] is either 0 or 1.
         * 
         */
        longest_Subarray_after_deletion_1 ans = new longest_Subarray_after_deletion_1();
        int arr[] = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        System.out.println("the length of subarray is ->>" + ans.longestSubarray(arr));
    }
}
