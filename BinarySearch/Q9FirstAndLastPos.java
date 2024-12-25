package BinarySearch;

public class Q9FirstAndLastPos {
    public int[] searchRange(int[] arr, int target) {
        
        /*
         * Time Complexity of this code is O(n)
         */
        int firstpos = -1;
        int lastpos = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                if(firstpos ==-1)
                {
                    firstpos =i;
                }
                lastpos = i;
            }
        }
        return new int []{firstpos,lastpos};
    }
    public static void main(String[] args) {
        // Your code here
        /*
           Leetcode -> 34 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
         * Given an array of integers nums sorted in non-decreasing order, find the
         * starting and ending position of a given target value.
         * 
         * If target is not found in the array, return [-1, -1].
         * 
         * You must write an algorithm with O(log n) runtime complexity.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [5,7,7,8,8,10], target = 8
         * Output: [3,4]
         * Example 2:
         * 
         * Input: nums = [5,7,7,8,8,10], target = 6
         * Output: [-1,-1]
         * Example 3:
         * 
         * Input: nums = [], target = 0
         * Output: [-1,-1]
         * 
         */
        Q9FirstAndLastPos obj = new Q9FirstAndLastPos();
        int[] res = obj.searchRange(new int[]{5,7,7,8,8,10}, 8);
        System.out.println("the first position is-> "+res[0] + "  and the last pos is -> " + res[1]); // Output: 3 4
    }
}