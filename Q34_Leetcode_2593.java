import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q34_Leetcode_2593 {
    public long findScore(int[] nums) {

        List<List<Integer>> keyvalue = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> ans = new ArrayList<>();
            ans.add(nums[i]);
            ans.add(i);
            keyvalue.add(ans);
        }

        Collections.sort(keyvalue, Comparator.comparingInt(a -> a.get(0)));
        // making the boolean array to check the index is visited or not
        boolean[] visited = new boolean[nums.length];
        long score = 0;
        for (List<Integer> pairs : keyvalue) {
            int value = pairs.get(0);
            int index = pairs.get(1);

            if (!visited[index]) {
                score = score + value;
                visited[index] = true;

                if (index - 1 >= 0) {
                    visited[index - 1] = true;
                }
                if (index + 1 < nums.length) {
                    visited[index + 1] = true;
                }
            }

        }
        return score;
    }

    public static void main(String[] args) {
        /*leetcode :-Find Score of an Array After Marking All Elements https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/description/?envType=daily-question&envId=2024-12-14
         * 
         * Solved
         * Medium
         * 
         * Topics
         * Companies
         * 
         * Hint
         * You are given an array nums consisting of positive integers.
         * 
         * Starting with score = 0, apply the following algorithm:
         * 
         * Choose the smallest integer of the array that is not marked. If there is a
         * tie, choose the one with the smallest index.
         * Add the value of the chosen integer to score.
         * Mark the chosen element and its two adjacent elements if they exist.
         * Repeat until all the array elements are marked.
         * Return the score you get after applying the above algorithm.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [2,1,3,4,5,2]
         * Output: 7
         * Explanation: We mark the elements as follows:
         * - 1 is the smallest unmarked element, so we mark it and its two adjacent
         * elements: [2,1,3,4,5,2].
         * - 2 is the smallest unmarked element, so we mark it and its left adjacent
         * element: [2,1,3,4,5,2].
         * - 4 is the only remaining unmarked element, so we mark it: [2,1,3,4,5,2].
         * Our score is 1 + 2 + 4 = 7.
         * Example 2:
         * 
         * Input: nums = [2,3,5,1,3,2]
         * Output: 5
         * Explanation: We mark the elements as follows:
         * - 1 is the smallest unmarked element, so we mark it and its two adjacent
         * elements: [2,3,5,1,3,2].
         * - 2 is the smallest unmarked element, since there are two of them, we choose
         * the left-most one, so we mark the one at index 0 and its right adjacent
         * element: [2,3,5,1,3,2].
         * - 2 is the only remaining unmarked element, so we mark it: [2,3,5,1,3,2].
         * Our score is 1 + 2 + 2 = 5.
         */
    }
}