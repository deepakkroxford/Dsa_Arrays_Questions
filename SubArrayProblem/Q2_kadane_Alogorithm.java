package SubArrayProblem;

class bruteforce {

    long maxSubarraySumON3(int arr[], int n) {
        int maxsum = arr[0];
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                int currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum += arr[k];
                    maxsum = Math.max(maxsum, currentsum);
                }

                currentsum = 0;
            }

        }

        return maxsum;
    }

    long maxSubarraySumON2(int arr[], int n) {
        int maxsum = arr[0];

        for (int i = 0; i < n; i++) {
            int currentsum = 0;
            for (int j = i; j < n; j++) {
                currentsum += arr[j];

                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }
            }
            currentsum = 0;
        }

        return maxsum;
    }

    long maxSubarraySumON(int arr[], int n) {
        int maxsum = arr[0];
        int currentsum = 0;
        for (int i = 0; i < n; i++) {
            currentsum += arr[i];

            maxsum = Math.max(currentsum, maxsum);

            if (currentsum < 0) {
                currentsum = 0;
            }
        }

        return maxsum;
    }

}
/*
 * Given an array Arr[] of N integers.
 * Find the contiguous sub-array(containing at least one number)
 * which has the maximum sum and return its sum.
 */

// Input:
// N = 5
// Arr[] = {1,2,3,-2,5}
// Output:
// 9
// Explanation:
// Max subarray sum is 9
// of elements (1, 2, 3, -2, 5) which
// is a contiguous subarray.
public class Q2_kadane_Alogorithm {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 5 };
        int sum = 0;
        // int maxi = arr[0];
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxi = Math.max(sum, maxi);
            // if(maxi<sum)
            // {
            // maxi=sum;
            // }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxi);
    }
}