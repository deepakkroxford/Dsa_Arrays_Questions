package SubArrayProblem;

import java.util.Deque;
import java.util.LinkedList;

public class Q19_ContinousSubarray {
    public long continuousSubarrays(int[] nums) {
        long count = 0;
        // we have to find the subarray cotinously such that the diffrence between the
        // element are not more that 2 , if it is more than 2 so we dont have to count
        // those
        // subarray as the continous subarray

        // brute force time complexity - O(n^2)

        for (int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                if (max - min <= 2) {
                    count++;
                }
            }
        }
        return count;
    }

    public long continuousSubarraysUsingQueue(int arr[]) {
        long count = 0;
        // we use the monotonic queue and sliding window approach

        // in this i store the value in the decreseing order so we get the maximum
        // element at the first
        Deque<Integer> MaxQ = new LinkedList<>();

        // in this queue i store the value in the incresing order so i get the minimum
        // as first
        Deque<Integer> MinQ = new LinkedList<>();

        int left = 0;
        int right = 0;

        while (right < arr.length) {

            while (!MaxQ.isEmpty() && arr[right] > MaxQ.getLast()) {
                MaxQ.pollLast();
            }

            while (!MinQ.isEmpty() && arr[right] < MinQ.getLast()) {
                MinQ.pollLast();
            }

            MinQ.add(arr[right]);
            MaxQ.add(arr[right]);

            while (MaxQ.getFirst() - MinQ.getFirst() > 2) {
                if (arr[left] == MaxQ.getFirst()) {
                    MaxQ.pollFirst();
                }

                if (arr[left] == MinQ.getFirst()) {
                    MinQ.pollFirst();
                }
                left++;
            }
            count = count + right - left + 1;
            right++;
        }

        return count;

    }

    public static void main(String[] args) {
        /*
         * Leetcode 2762 :-
         * https://leetcode.com/problems/continuous-subarrays/description/?envType=daily
         * -question&envId=2024-12-14
         * You are given a 0-indexed integer array nums. A subarray of nums is called
         * continuous if:
         * 
         * Let i, i + 1, ..., j be the indices in the subarray. Then, for each pair of
         * indices i <= i1, i2 <= j, 0 <= |nums[i1] - nums[i2]| <= 2.
         * Return the total number of continuous subarrays.
         * 
         * A subarray is a contiguous non-empty sequence of elements within an array.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [5,4,2,4]
         * Output: 8
         * Explanation:
         * Continuous subarray of size 1: [5], [4], [2], [4].
         * Continuous subarray of size 2: [5,4], [4,2], [2,4].
         * Continuous subarray of size 3: [4,2,4].
         * Thereare no subarrys of size 4.
         * Total continuous subarrays = 4 + 3 + 1 = 8.
         * It can be shown that there are no more continuous subarrays.
         * 
         * 
         * Example 2:
         * 
         * Input: nums = [1,2,3]
         * Output: 6
         * Explanation:
         * Continuous subarray of size 1: [1], [2], [3].
         * Continuous subarray of size 2: [1,2], [2,3].
         * Continuous subarray of size 3: [1,2,3].
         * Total continuous subarrays = 3 + 2 + 1 = 6.
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 105
         * 1 <= nums[i] <= 109
         */

        Q19_ContinousSubarray obj = new Q19_ContinousSubarray();
        int arr[] = { 5, 4, 2, 4 };
        System.out.println();
        System.out.println("the count of continousSubarray is :- " + obj.continuousSubarrays(arr));
        System.out.println();

        System.out.println(obj.continuousSubarraysUsingQueue(arr));
    }
}
