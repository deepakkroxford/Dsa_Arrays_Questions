// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// Initial Array: [1, 2, 3, 4]
// Cumulative Sum: [1, 3, 6, 10]

//leetcode java answer
class Solution {
    public int[] runningSum(int[] nums) {
       for(int i=1;i<nums.length;i++)
       {
           nums[i] = nums[i]+nums[i-1];
           //nums[i]+=nums[i-1];
       }
       return nums;
    }
}

// in this question we have to add the runnig sum of n number 
// so we start the loop from index 1 to the length of an array 


