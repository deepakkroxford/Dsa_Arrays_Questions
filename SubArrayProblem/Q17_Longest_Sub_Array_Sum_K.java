package SubArrayProblem;

import java.util.HashMap;

/**
 * InnerQ17_Longest_Sub_Array_Sum_K
 */
class Longest_Sub_Array_Sum_K {
    public static int lenOfLongSubarr(int A[], int N, int k) {
        // Complete the function
        int sum = 0;
        int maxlen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
            if (map.containsKey(sum - k)) {
                maxlen = Math.max(maxlen, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {

                map.put(sum, i);

            }
        }
        return maxlen;
    }

}

public class Q17_Longest_Sub_Array_Sum_K {
    public static void main(String[] args) {
        /*
         * Given an array containing N integers and an integer K., Your task is to find
         * the length of the longest Sub-Array with the sum of the elements equal to the
         * given value K.
         * 
         * 
         * 
         * Example 1:
         * 
         * 
         * Input :
         * A[] = {10, 5, 2, 7, 1, 9}
         * K = 15
         * Output : 4
         * Explanation:
         * The sub-array is {5, 2, 7, 1}.
         * Example 2:
         * 
         * Input :
         * A[] = {-1, 2, 3}
         * K = 6
         * Output : 0
         * Explanation:
         * There is no such sub-array with sum 6.
         * Your Task:
         * This is a function problem. The input is already taken care of by the driver
         * code. You only need to complete the function lenOfLongSubarr() that takes an
         * array (A), sizeOfArray (n), sum (K)and returns the required length of the
         * longest Sub-Array. The driver code takes care of the printing.
         * 
         * Expected Time Complexity: O(N).
         * Expected Auxiliary Space: O(N).
         * 
         * 
         * 
         * Constraints:
         * 1<=N<=105
         * -105<=A[i], K<=105
         * 
         */
        Longest_Sub_Array_Sum_K ans = new Longest_Sub_Array_Sum_K();
        int A[] = { 10, 5, 2, 7, 1, 9 };
        int n = A.length;
        int k = 15;
        System.out.println(Longest_Sub_Array_Sum_K.lenOfLongSubarr(A, n, k));
    }
}
