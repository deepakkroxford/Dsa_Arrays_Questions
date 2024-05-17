package SubArrayProblem;

class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            sum += a[end];

            while (sum > x) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= a[start];
                start++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}

public class Q14_Smallest_subarray_sum_greater_than_x {
    public static void main(String[] args) {
        /*
         * Given an array of integers (A[]) and a number x, find the smallest subarray
         * with sum greater than the given value. If such a subarray do not exist return
         * 0 in that case.
         * 
         * Example 1:
         * 
         * Input:
         * A[] = {1, 4, 45, 6, 0, 19}
         * x = 51
         * Output: 3
         * Explanation:
         * Minimum length subarray is
         * {4, 45, 6}
         * 
         * Example 2:
         * Input:
         * A[] = {1, 10, 5, 2, 7}
         * x = 9
         * Output: 1
         * Explanation:
         * Minimum length subarray is {10}
         * 
         * 
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function smallestSubWithSum() which takes the array A[], its size N and an
         * integer X as inputs and returns the required ouput.
         * 
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(1)
         * 
         * Constraints:
         * 1 ≤ N, x ≤ 105
         * 0 ≤ A[] ≤ 104
         * 
         */

        // User function Template for Java

        class Solution {

            public static int smallestSubWithSum(int a[], int n, int x) {
                int minlen = Integer.MAX_VALUE; // Initialize to Integer.MAX_VALUE to handle edge cases
                for (int i = 0; i < n; i++) {
                    int sum = 0;
                    for (int j = i; j < n; j++) {
                        sum += a[j];
                        if (sum > x) {
                            minlen = Math.min(minlen, j - i + 1);
                            break; // Once sum>x is found, no need to continue with this subarray
                        }
                    }
                }
                return (minlen == Integer.MAX_VALUE) ? 0 : minlen; // Return 0 if no such subarray is found
            }
        }

    }
}
