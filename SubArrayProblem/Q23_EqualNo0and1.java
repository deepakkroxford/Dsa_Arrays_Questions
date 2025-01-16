package SubArrayProblem;

import java.util.HashMap;

public class Q23_EqualNo0and1 {
    public int maxLen(int[] arr) {
        // the key concept in this we have to treat the 0 =-1 and 1 =1

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxLen = 0;
        int sum = 0;
        map.put(sum, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sum += -1;
            } else if (arr[i] == 1) {
                sum += 1;
            }
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;

    }

    public static void main(String[] args) {
        /*
         * Given an array arr of 0s and 1s. Find and return the length of the longest
         * subarray with equal number of 0s and 1s.
         * 
         * Examples:
         * 
         * Input: arr[] = [1, 0, 1, 1, 1, 0, 0]
         * Output: 6
         * Explanation: arr[1...6] is the longest subarray with three 0s and three 1s.
         * Input: arr[] = [0, 0, 1, 1, 0]
         * Output: 4
         * Explnation: arr[0...3] or arr[1...4] is the longest subarray with two 0s and
         * two 1s.
         * Input: arr[] = [0]
         * Output: 0
         * Explnation: There is no subarray with an equal number of 0s and 1s.
         * Constraints:
         * 1 <= arr.size() <= 105
         * 0 <= arr[i] <= 1
         * 
         */
        Q23_EqualNo0and1 obj = new Q23_EqualNo0and1();
        int[] arr = { 0, 0, 1, 1, 0 };
        int result = obj.maxLen(arr);
        System.out.println(result);

    }
}
