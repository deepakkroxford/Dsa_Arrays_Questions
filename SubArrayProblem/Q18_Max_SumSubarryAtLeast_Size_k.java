package SubArrayProblem;

class MaxSumAtleast_Size_K {

    public long maxSumWithK(long a[], long n, long k) {

        int currentsum = 0;
        for (int i = 0; i < k; i++) {
            currentsum += a[i];
        }
        long max = currentsum;
        long sum = currentsum;
        for (int i = (int) k; i < n; i++) {
            currentsum += a[i] - a[i - (int) k];
            max = Math.max(max + a[i], currentsum);
            sum = Math.max(sum, max);
        }
        return sum;
    }
}

/**
 * Q18_Max_SumSubarryAtLeast_Size_k
 */
public class Q18_Max_SumSubarryAtLeast_Size_k {

    public static void main(String[] args) {
        /*
         * Given an array a of length n and a number k, find the largest sum of the
         * subarray containing at least k numbers. It is guaranteed that the size of
         * array is at-least k.
         * 
         * Example 1:
         * 
         * Input :
         * n = 4
         * a[] = {1, -2, 2, -3}
         * k = 2
         * Output :
         * 1
         * Explanation :
         * The sub-array of length at-least 2
         * that produces greatest sum is {1, -2, 2}
         * Example 2:
         * Input :
         * n = 6
         * a[] = {1, 1, 1, 1, 1, 1}
         * k = 2
         * Output :
         * 6
         * Explanation :
         * The sub-array of length at-least 2
         * that produces greatest sum is {1, 1, 1, 1, 1, 1}
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function maxSumWithK() which takes the array a[], its size n and an integer k
         * as inputs and returns the value of the largest sum of the subarray containing
         * at least k numbers.
         * 
         * Expected Time Complexity: O(n)
         * Expected Auxiliary Space: O(n)
         * 
         * Constraints:
         * 1 <= n <= 105
         * -105 <= a[i] <= 105
         * 1 <= k <= n
         * 
         */

        long[] a1 = { 1, -2, 2, -3 };
        int n1 = a1.length;
        int k1 = 2;

        // Example 2
        long[] a2 = { 1, 1, 1, 1, 1, 1 };
        int n2 = a2.length;
        int k2 = 2;

        MaxSumAtleast_Size_K solution = new MaxSumAtleast_Size_K();

        // Testing example 1
        long result1 = solution.maxSumWithK(a1, n1, k1);
        System.out.println("Example 1 Result: " + result1); // Expected output: 1

        // Testing example 2
        long result2 = solution.maxSumWithK(a2, n2, k2);
        System.out.println("Example 2 Result: " + result2); // Expected output: 6

    }
}
