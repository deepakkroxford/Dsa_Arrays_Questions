package SubArrayProblem;

import java.util.ArrayList;

class subMax_SumSubarrayof_size_K {
    static long maximumSumSubarrayON2(int K, ArrayList<Integer> Arr, int N) {

        long max = Integer.MIN_VALUE;
        for (int i = 0; i <= N - K; i++) {
            int sum = 0;
            for (int j = i; j < K + i; j++) {
                sum += Arr.get(j);
            }

            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }
        return max;

    }

    static long maximumSumSubarrayON(int K, ArrayList<Integer> Arr, int N) {
        int maxsum = 0;
        int currentsum = 0;
        for (int i = 0; i < K; i++) {
            currentsum += Arr.get(i);
        }

        maxsum = currentsum;

        for (int i = K; i < N; i++) {
            currentsum += Arr.get(i) - Arr.get(i - K);
            maxsum = Math.max(maxsum, currentsum);
        }

        return maxsum;
    }
}

public class Q13_subMax_SumSubarrayof_size_K {
    public static void main(String[] args) {
        /*
         * geekforgeeks
         * Given an array of integers Arr of size N and a number K. Return the maximum
         * sum of a subarray of size K.
         * 
         * NOTE*: A subarray is a contiguous part of any given array.
         * 
         * Example 1:
         * 
         * Input:
         * N = 4, K = 2
         * Arr = [100, 200, 300, 400]
         * Output:
         * 700
         * Explanation:
         * Arr3 + Arr4 =700,
         * which is maximum.
         * Example 2:
         * 
         * Input:
         * N = 4, K = 4
         * Arr = [100, 200, 300, 400]
         * Output:
         * 1000
         * Explanation:
         * Arr1 + Arr2 + Arr3 + Arr4 =1000,
         * which is maximum.
         * 
         * 
         */
        subMax_SumSubarrayof_size_K ans = new subMax_SumSubarrayof_size_K();

        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(100);
        Arr.add(200);
        Arr.add(300);
        Arr.add(400);

        int N = Arr.size();
        int K = 2; // Example input values

        long result = ans.maximumSumSubarrayON(K, Arr, N);
        System.out.println("Maximum sum of a subarray of size " + K + ": " + result);

    }
}