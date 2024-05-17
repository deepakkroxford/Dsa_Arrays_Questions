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

public class Q13_Max_SumSubarraySize_K {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(100);
        Arr.add(200);
        Arr.add(300);
        Arr.add(400);

        int N = Arr.size();
        int K = 2; // Example input values

        long result = subMax_SumSubarrayof_size_K.maximumSumSubarrayON(K, Arr, N);
        System.out.println("Maximum sum of a subarray of size " + K + ": " + result);

    }
}