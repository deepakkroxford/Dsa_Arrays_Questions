import java.util.HashMap;
import java.util.*;

public class Q47_DivideArray_EqualPairs {
    public static boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }

        for(var e:map.entrySet())
        {
            int val = e.getValue();
            if(val%2!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /*leetcode:- 2206  https://leetcode.com/problems/divide-array-into-equal-pairs/
         * You are given an integer array nums consisting of 2 * n integers.
         * 
         * You need to divide nums into n pairs such that:
         * 
         * Each element belongs to exactly one pair.
         * The elements present in a pair are equal.
         * Return true if nums can be divided into n pairs, otherwise return false.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [3,2,3,2,2,2]
         * Output: true
         * Explanation:
         * There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
         * If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy
         * all the conditions.
         * Example 2:
         * 
         * Input: nums = [1,2,3,4]
         * Output: false
         * Explanation:
         * There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs
         * satisfy every condition.
         * 
         * 
         * Constraints:
         * 
         * nums.length == 2 * n
         * 1 <= n <= 500
         * 1 <= nums[i] <= 500
         */


        int[] nums = {3,2,3,2,2,2};
        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Can be divided into equal pairs: " + divideArray(nums));

        int[] nums2 = {1,2,3,4}; 
        System.out.println("\nInput array: " + Arrays.toString(nums2));
        System.out.println("Can be divided into equal pairs: " + divideArray(nums2));
    }
}