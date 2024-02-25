class sortred_array_square {
    public int[] sortedSquares(int[] nums) {

        // Time complexcity O(n^2)
        int n = nums.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(nums[i]) < Math.abs(nums[j])) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }

            }

        }

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i] * nums[i];
        }

        return ans;

    }

    public int[] sortedSquaresOrdern(int[] nums) {
        // timeComplexcity O(n);

        int head = 0;
        int tail = nums.length - 1;
        int result[] = new int[nums.length];
        int k = result.length - 1;

        // first we find the sqaure of all array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        while (head <= tail) {
            if (nums[head] < nums[tail]) {
                result[k] = nums[tail];
                k--;
                tail--;
            } else {
                result[k] = nums[head];
                k--;
                head++;
            }
        }
        return result;

    }

}

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        /*
         * Given an integer array nums sorted in non-decreasing order, return an array
         * of the squares of each number sorted in non-decreasing order.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [-4,-1,0,3,10]
         * Output: [0,1,9,16,100]
         * Explanation: After squaring, the array becomes [16,1,0,9,100].
         * After sorting, it becomes [0,1,9,16,100].
         * Example 2:
         * 
         * Input: nums = [-7,-3,2,3,11]
         * Output: [4,9,9,49,121]
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 104
         * -104 <= nums[i] <= 104
         * nums is sorted in non-decreasing order.
         * 
         * 
         * Follow up: Squaring each element and sorting the new array is very trivial,
         * could you find an O(n) solution using a different approach?
         *  
         * 
         */
        sortred_array_square ans = new sortred_array_square();
        int nums[] = { -7, -3, 2, 3, 11 };

        int[] result = ans.sortedSquaresOrdern(nums);

        System.out.print("Sorted Squares: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
