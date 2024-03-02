package SubArrayProblem;

import java.util.HashMap;

class main {
    int longest_Subarray_with0sum(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        /*
         * so first our sum =0; and it pointing the index -1;
         * in this case sum is our key
         * ans index is our frequency
         */
        int maxlen = 0;
        int sum = 0;

        map.put(sum, -1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
                /*
                 * so if sum not exist in our hashmap so we put in our hashmap with the index
                 * value
                 */
            } else {
                /*
                 * if sum is alredy exist in our hashmap so we simply calculate the difference with subtracting
                 * with the last index value of sum and current index value of sum the we got the diffrence;
                 * 
                 */
                int len = i - map.get(sum);
                maxlen = Math.max(maxlen, len);
            }
        }

        return maxlen;
    }
}

public class Q7_longest_Subarray_with0sum {
    public static void main(String[] args) {
        /*
         * Given an array having both positive and negative integers. The task is to
         * compute the length of the largest subarray with sum 0.
         * 
         * Example 1:
         * 
         * Input:
         * N = 8
         * A[] = {15,-2,2,-8,1,7,10,23}
         * Output: 5
         * Explanation: The largest subarray with
         * sum 0 will be -2 2 -8 1 7.
         * 
         * Your Task:
         * You just have to complete the function maxLen() which takes two arguments an
         * array A and n, where n is the size of the array A and returns the length of
         * the largest subarray with 0 sum.
         * 
         * Expected Time Complexity: O(N).
         * Expected Auxiliary Space: O(N).
         * 
         * Constraints:
         * 1 <= N <= 105
         * -1000 <= A[i] <= 1000, for each valid i
         * 
         */
        main ans = new main();
        
        int arr[] = { -1, 1, -1, 1 };
        
        System.out.println(ans.longest_Subarray_with0sum(arr));
    }
}
