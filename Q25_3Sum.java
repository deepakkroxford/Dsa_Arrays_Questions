import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Find3Sum {
    public List<List<Integer>> threeSum(int[] arr) {

        Set<List<Integer>> result = new HashSet<>();
        if(arr==null || arr.length<3)
        {
            return new ArrayList<>();
        }

        Arrays.sort(arr);
        for(int i =0;i<arr.length-2;i++)
        {
            int sum=0;
            int j=i+1;
            int k= arr.length-1;
            while(j<k)
            {
                sum = arr[i]+arr[j]+arr[k];

                if(sum==0)
                {
                    result.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        
        return new ArrayList<>(result);
    }

}

public class Q25_3Sum {
    public static void main(String[] args) {
        /*Leetcode ->15 
         https://leetcode.com/problems/3sum/description/
         * Given an integer array nums, return all the triplets [nums[i], nums[j],
         * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
         * nums[k] == 0.
         * 
         * Notice that the solution set must not contain duplicate triplets.
         * 
         * Example 1:
         * Input: nums = [-1,0,1,2,-1,-4]
         * Output: [[-1,-1,2],[-1,0,1]]
         * Explanation:
         * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
         * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
         * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
         * The distinct triplets are [-1,0,1] and [-1,-1,2].
         * Notice that the order of the output and the order of the triplets does not
         * matter.
         * 
         * Example 2:
         * Input: nums = [0,1,1]
         * Output: []
         * Explanation: The only possible triplet does not sum up to 0.
         * Example 3:
         * 
         * Input: nums = [0,0,0]
         * Output: [[0,0,0]]
         * Explanation: The only possible triplet sums up to 0.
         * 
         * 
         * Constraints:
         * 
         * 3 <= nums.length <= 3000
         * -105 <= nums[i] <= 105
         * 
         */
        Find3Sum solution = new Find3Sum();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {0, 1, 1};
        int[] nums3 = {0, 0, 0};

        List<List<Integer>> result1 = solution.threeSum(nums1);
        List<List<Integer>> result2 = solution.threeSum(nums2);
        List<List<Integer>> result3 = solution.threeSum(nums3);

        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + result1);

        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + result2);

        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + result3);


    }
}
