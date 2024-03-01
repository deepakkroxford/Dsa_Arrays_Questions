package SubArrayProblem;

import java.util.HashMap;

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
        HashMap <Integer,Integer> map = new HashMap<>();
        int maxLen=0;
        int arr[]={-1,1 ,-1, 1};
        int sum =0;
        map.put(sum, -1);

        for(int i =0;i<arr.length;i++)
        {
            sum = sum+arr[i];
            if(!map.containsKey(sum))
            {
                map.put(sum, i);
            }
            else
            {
                int len = i-map.get(sum);
                maxLen =Math.max(maxLen, len);
            }
        }
        System.out.println(maxLen);
    }
}
