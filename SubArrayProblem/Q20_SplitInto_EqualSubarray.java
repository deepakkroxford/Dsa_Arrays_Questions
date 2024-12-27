package SubArrayProblem;

import java.util.ArrayList;
import java.util.List;

public class Q20_SplitInto_EqualSubarray {
    public List<Integer> findSplit(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        if (totalSum % 3 != 0) {
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        int requiredSum = totalSum / 3;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == requiredSum) {
                ans.add(i);
                if (ans.size() == 2) {
                    return ans;
                }
                sum = 0;
            }
        }
        ans.clear();
        ans.add(-1);
        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        /*
         * Given an array, arr[], determine if arr can be split into three consecutive
         * parts such that the sum of each part is equal. If possible, return any index
         * pair(i, j) in an array such that sum(arr[0..i]) = sum(arr[i+1..j]) =
         * sum(arr[j+1..n-1]), otherwise return an array {-1,-1}.
         * 
         * Note: Since multiple answers are possible, return any of them. The driver
         * code will print true if it is correct otherwise, it will print false.
         * 
         * Examples :
         * 
         * Input: arr[] = [1, 3, 4, 0, 4]
         * Output: true
         * Explanation: [1, 2] is valid pair as sum of subarray arr[0..1] is equal to
         * sum of subarray arr[2..3] and also to sum of subarray arr[4..4]. The sum is
         * 4, so driver code prints true.
         * Input: arr[] = [2, 3, 4]
         * Output: false
         * Explanation: No three subarrays exist which have equal sum.
         * Input: arr[] = [0, 1, 1]
         * Output: false
         * Constraints:
         * 3 ≤ arr.size() ≤ 106
         * 0 ≤ arr[i] ≤ 106
         */
        Q20_SplitInto_EqualSubarray solution = new Q20_SplitInto_EqualSubarray();
        int arr[] = { 1, 3, 4, 0, 4 };
        List<Integer> result = solution.findSplit(arr);
        System.out.println(result);
    }
}
