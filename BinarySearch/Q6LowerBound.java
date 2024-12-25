package BinarySearch;

public class Q6LowerBound {
    static int findFloor(int[] arr, int k) {
        // write code here
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= k) {
                index = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
    static int findFloorON(int[] arr, int k) {
        // write code here
        int index =-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        /*
         * Floor in a Sorted Array
         * Difficulty: EasyAccuracy: 33.75%Submissions: 391K+Points: 2
         * Given a sorted array arr[] (with unique elements) and an integer k, find the
         * index (0-based) of the largest element in arr[] that is less than or equal to
         * k. This element is called the "floor" of k. If such an element does not
         * exist, return -1.
         * 
         * Examples
         * 
         * Input: arr[] = [1, 2, 8, 10, 11, 12, 19], k = 0
         * Output: -1
         * Explanation: No element less than 0 is found. So output is -1.
         * Input: arr[] = [1, 2, 8, 10, 11, 12, 19], k = 5
         * Output: 1
         * Explanation: Largest Number less than 5 is 2 , whose index is 1.
         * Input: arr[] = [1, 2, 8], k = 1
         * Output: 0
         * Explanation: Largest Number less than or equal to 1 is 1 , whose index is 0.
         * Constraints:
         * 1 ≤ arr.size() ≤ 106
         * 1 ≤ arr[i] ≤ 106
         * 0 ≤ k ≤ arr[n-1]
         */

         int arr[] = {1, 2, 8, 10, 11, 12, 19};
         int k = 5;
         int result = findFloor(arr, k);
         System.out.println(result);
         int resultON = findFloorON(arr, k);
         System.out.println(resultON);

    }
}
