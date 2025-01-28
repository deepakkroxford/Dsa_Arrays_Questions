package BinarySearch;

public class Q2PeakElementInMountedArray {

    public int findPeakElement(int[] arr) {
        /*
         * This logic will take time complexity of O(n) time
         * But we can solve this question using the binary search algorithm
         */
        int peak = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > peak)
                peak = arr[i];
        }
        return peak;
    }

    public int findPeakUsingBinarySearch(int arr[]) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr[high];

    }

    public static void main(String[] args) {
        /*
         * leetcode :- 162. Find Peak Element
         * https://leetcode.com/problems/find-peak-element/description/
         * 
         * 
         * A peak element is an element that is strictly greater than its neighbors.
         * 
         * Given a 0-indexed integer array nums, find a peak element, and return its
         * index. If the array contains multiple peaks, return the index to any of the
         * peaks.
         * 
         * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is
         * always considered to be strictly greater than a neighbor that is outside the
         * array.
         * 
         * You must write an algorithm that runs in O(log n) time.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3,1]
         * Output: 2
         * Explanation: 3 is a peak element and your function should return the index
         * number 2.
         * Example 2:
         * 
         * Input: nums = [1,2,1,3,5,6,4]
         * Output: 5
         * Explanation: Your function can return either index number 1 where the peak
         * element is 2, or index number 5 where the peak element is 6.
         */

        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
        Q2PeakElementInMountedArray obj = new Q2PeakElementInMountedArray();
        int ans = obj.findPeakElement(arr);
        System.out.println(ans);
        int ans1 = obj.findPeakUsingBinarySearch(arr);
        System.out.println(ans1);

    }
}
