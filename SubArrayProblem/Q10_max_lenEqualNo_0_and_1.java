package SubArrayProblem;

import java.util.HashMap;

/**
 * Q10_max_lenEqualNo_0_and_1
 */
class max_lenEqualNo_0_and_1 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int sum = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {   //here we treat 0 as -1
                sum += -1;
            } else if (nums[i] == 1) { //and 1 is 1
                sum += 1;
            }
            if (map.containsKey(sum)) {
                int idx = map.get(sum);
                int len = i - idx;

                maxlen = Math.max(maxlen, len);
            } else {
                map.put(sum, i);
            }
        }
        return maxlen;
    }
}

public class Q10_max_lenEqualNo_0_and_1 {

    public static void main(String[] args) {
        /*
         * Leetcode - 525
         * Given a binary array nums, return the maximum length of a contiguous subarray
         * with an equal number of 0 and 1.
         * 
         * 
         * 
         * Example 1:
         * Input: nums = [0,1]
         * Output: 2
         * Explanation: [0, 1] is the longest contiguous subarray with an equal number
         * of 0 and 1.
         * 
         * Example 2:
         * Input: nums = [0,1,0]
         * Output: 2
         * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal
         * number of 0 and 1.
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 105
         * nums[i] is either 0 or 1.
         * 
         */

        max_lenEqualNo_0_and_1 ans = new max_lenEqualNo_0_and_1();
        int arr[] = { 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1 };
        System.out.println(ans.findMaxLength(arr));
    }
}
