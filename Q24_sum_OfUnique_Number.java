import java.util.HashSet;

class sum_OfUnique_Number {
    public int sumOfUnique(int[] nums) {
        // Approach 1
        int sum = 0;
        int freq[] = new int[101];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }

    public int sumOfUnique2(int nums[]) {
        int sum = 0;
        HashSet<Integer> uniq = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!uniq.contains(nums[i]) && !dup.contains(nums[i])) {
                uniq.add(nums[i]);
                sum += nums[i];
            } else if (uniq.contains(nums[i])) {
                uniq.remove(nums[i]);
                dup.add(nums[i]);
                sum -= nums[i];
            }
        }
        return sum;
    }
}

public class Q24_sum_OfUnique_Number {
    public static void main(String[] args) {
        /*
         * Leetcode-1748
         * You are given an integer array nums. The unique elements of an array are the
         * elements that appear exactly once in the array.
         * 
         * Return the sum of all the unique elements of nums.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3,2]
         * Output: 4
         * Explanation: The unique elements are [1,3], and the sum is 4.
         * Example 2:
         * 
         * Input: nums = [1,1,1,1,1]
         * Output: 0
         * Explanation: There are no unique elements, and the sum is 0.
         * Example 3:
         * 
         * Input: nums = [1,2,3,4,5]
         * Output: 15
         * Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 100
         * 1 <= nums[i] <= 100
         */
        sum_OfUnique_Number ans = new sum_OfUnique_Number();
        int arr1[] = { 1, 2, 3, 2 };
        System.out.println("the sum of unique number is --> " + ans.sumOfUnique(arr1));

        int arr2[] = { 1, 1, 1, 1, 1 };
        System.out.println("the sum of unique number is --> " + ans.sumOfUnique2(arr2));

    }
}
