package BinarySearch;

public class Q10SearchAndInsert {
    public int searchInsert(int[] nums, int target) {
        /*
         * the time complexty of this code is O(n)
         */

         int pos = nums.length;
         for(int i=0;i<nums.length;i++) {
            if(nums[i]>=target)
            {
                pos=i;
                break;
            }
         }
         return pos;
    }
    public int searchInsertLogN(int[] nums, int target) {
        /*
         * the time complexty of this code is O(n)
         * 
         *       0,1,2,3
         *       1,3,5,6
         *     low mid  high
         */   

         int low = 0;
         int high = nums.length - 1;
         while(low<=high)
         {
            int mid = low +(high-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            
         }
         // or low 
         return high+1;
    }
    public static void main(String[] args) {
        /*
         * https://leetcode.com/problems/search-insert-position/
         * 
         * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
         * If not, return the index where it would be if it were inserted in order.
         * 
         * You must write an algorithm with O(log n) runtime complexity.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,3,5,6], target = 5
         * Output: 2
         * Example 2:
         * 
         * Input: nums = [1,3,5,6], target = 2
         * Output: 1
         * Example 3:
         * 
         * Input: nums = [1,3,5,6], target = 7
         * Output: 4
         * Example 4:
         * 
         * Input: nums = [1,3,5,6], target = 0
         * Output: 0
         * Example 5:
         * 
         * Input: nums = [1], target = 0
         * Output: 0
         */
        Q10SearchAndInsert obj = new Q10SearchAndInsert();
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(obj.searchInsertLogN(nums, target)); // Output: 2
    }
}
