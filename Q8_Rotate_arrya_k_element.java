class rotate {
    public void rotatedk(int nums[], int k) {
           k = k % nums.length;
        // reverse the whole array
        reverse(nums, 0, nums.length - 1);
        // reverse the first k elemnt
        reverse(nums, 0, k - 1);
        // reverse the remaing element
        reverse(nums, k, nums.length - 1);
    }
    protected void reverse(int nums[], int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

public class Q8_Rotate_arrya_k_element {

    /*
     * Given an unsorted array arr[] of size N. Rotate the array to the left
     * (counter-clockwise direction) by D steps, where D is a positive integer.
     * 
     * Example 1:
     * 
     * Input:
     * N = 5, D = 2
     * arr[] = {1,2,3,4,5}
     * Output: 3 4 5 1 2
     * Explanation: 1 2 3 4 5 when rotated
     * by 2 elements, it becomes 3 4 5 1 2.
     * Example 2:
     * 
     * Input:
     * N = 10, D = 3
     * arr[] = {2,4,6,8,10,12,14,16,18,20}
     * Output: 8 10 12 14 16 18 20 2 4 6
     * Explanation: 2 4 6 8 10 12 14 16 18 20
     * when rotated by 3 elements, it becomes
     * 8 10 12 14 16 18 20 2 4 6.
     */

    public static void main(String[] args) {


        /*
         * there are three step that we have to follw
         * step1 : reverse the whole array  0->n-1;
         * step2 : reverse the first k array  0->to k-1
         * step 3: reverse the array from k to last -> k->n-1;
         */
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = nums.length;
        int k = 4%n;

        rotate rotator = new rotate();
        rotator.rotatedk(nums, k);

        System.out.print("Rotated arrays: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // // Ensure k is within the bounds of the array length
        // k = k % n;

        // // Create a temporary array to store the last k elements
        // int[] temp = new int[k];
        // for (int i = 0; i < k; i++) {
        //     temp[i] = nums[n - k + i];
        // }

        // // Shift the remaining elements to the right
        // for (int i = n - 1; i >= k; i--) {
        //     nums[i] = nums[i - k];
        // }

        // // Place the k elements from the temporary array at the beginning
        // for (int i = 0; i < k; i++) {
        //     nums[i] = temp[i];
        // }

        // // Print the rotated array
        // System.out.println("Rotated array:");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(nums[i] + " ");
        // }

    }
}
