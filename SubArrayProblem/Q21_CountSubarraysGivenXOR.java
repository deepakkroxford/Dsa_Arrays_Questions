package SubArrayProblem;

import java.util.HashMap;

public class Q21_CountSubarraysGivenXOR {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        long count = 0;
        map.put(0, 1);
        for(int i=0;i<arr.length;i++){
            sum =sum^arr[i];
            if(map.containsKey(sum^k))
            {
                count +=map.get(sum^k);
            }
            map.put(sum , map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        /*
         * Given an array of integers arr[] and a number k, count the number of
         * subarrays having XOR of their elements as k.
         * 
         * Examples:
         * 
         * Input: arr[] = [4, 2, 2, 6, 4], k = 6
         * Output: 4
         * Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4,
         * 2, 2, 6, 4], [2, 2, 6], and [6]. Hence, the answer is 4.
         * Input: arr[] = [5, 6, 7, 8, 9], k = 5
         * Output: 2
         * Explanation: The subarrays having XOR of their elements as 5 are [5] and [5,
         * 6, 7, 8, 9]. Hence, the answer is 2.
         * Input: arr[] = [1, 1, 1, 1], k = 0
         * Output: 4
         * Explanation: The subarrays are [1, 1], [1, 1], [1, 1] and [1, 1, 1, 1].
         * Constraints:
         * 
         * 1 ≤ arr.size() ≤ 105
         * 0 ≤ arr[i] ≤105
         * 0 ≤ k ≤ 105
         * 
         */
        Q21_CountSubarraysGivenXOR solution = new Q21_CountSubarraysGivenXOR();
        int arr[] = { 4, 2, 2, 6, 4 };
        int k = 6;
        long result = solution.subarrayXor(arr, k);
        System.out.println(result);

        int arr1[] = { 5, 6, 7, 8, 9 };
        int k1 = 5;
        result = solution.subarrayXor(arr1, k1);
        System.out.println(result);

        int arr2[] = { 1, 1, 1, 1 };
        int k2 = 0;
        result = solution.subarrayXor(arr2, k2);
        System.out.println(result);
    }
}
