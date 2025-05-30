package SubArrayProblem;

import java.util.ArrayList;

class brutetooptimal {
    ArrayList<Integer> subarraySumON2(int[] arr, int n, int s) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == s) {
                    res.add(i + 1);
                    res.add(j + 1);
                    return res;
                }
            }
            sum = 0;
        }
        res.add(-1);
        return res;

    }

    ArrayList<Integer> subarraySumON(int[] arr, int n, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i=0;
        int j=0;
        int currentSum = 0;
        while(i<arr.length) {
            currentSum += arr[i];
            
            while(j<=i && currentSum>target) {
                currentSum -= arr[j];
                j++;
            }

            if(currentSum==target && j<=i) 
            {
                ans.add(j+1);
                ans.add(i+1);
                return ans;
            }

            i++;
        }

        ans.add(-1);
        return ans;
    }

}

public class Q4_Sub_array_withgiven_sum {
    public static void main(String[] args) {
        /*
         * Given an unsorted array A of size N that contains only non negative integers,
         * find a continuous sub-array that adds to a given number S and return the left
         * and right index(1-based indexing) of that subarray.
         * 
         * In case of multiple subarrays, return the subarray indexes which come first
         * on moving from left to right.
         * 
         * Note:- You have to return an ArrayList consisting of two elements left and
         * right. In case no such subarray exists return an array consisting of element
         * -1.
         * 
         * Example 1:
         * Input:
         * N = 5, S = 12
         * A[] = {1,2,3,7,5}
         * Output: 2 4
         * Explanation: The sum of elements
         * from 2nd position to 4th position
         * is 12.
         * 
         * 
         * Example 2:
         * Input:
         * N = 10, S = 15
         * A[] = {1,2,3,4,5,6,7,8,9,10}
         * Output: 1 5
         * Explanation: The sum of elements
         * from 1st position to 5th position
         * is 15.
         * 
         * Your Task:
         * You don't need to read input or print anything. The task is to complete the
         * function subarraySum() which takes arr, N, and S as input parameters and
         * returns an ArrayList containing the starting and ending positions of the
         * first such occurring subarray from the left where sum equals to S. The two
         * indexes in the array should be according to 1-based indexing. If no such
         * subarray is found, return an array consisting of only one element that is -1.
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(1)
         * 
         * Constraints:
         * 1 <= N <= 105
         * 0 <= Ai <= 109
         * 0<= S <= 109
         * 
         */

        brutetooptimal result = new brutetooptimal();
        int target = 15;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        System.out.println(result.subarraySumON(arr, n, target));
    }
}
