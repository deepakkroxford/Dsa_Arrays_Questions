public class Multiply_left_and_right_array_sum {
    public static void main(String[] args) {
        class Complete {

            /*
             * Pitsy needs help with the given task by her teacher. The task is to divide an
             * array into two sub-array (left and right) containing n/2 elements each and do
             * the sum of the subarrays and then multiply both the subarrays.
             * 
             * Note: If the length of the array is odd then the right half will contain one
             * element more than the left half.
             * 
             * Example 1:
             * 
             * Input : arr[ ] = {1, 2, 3, 4}
             * Output : 21
             * Explanation:
             * Sum up an array from index 0 to 1 = 3
             * Sum up an array from index 2 to 3 = 7
             * Their multiplication is 21.
             * 
             * Example 2:
             * 
             * Input : arr[ ] = {1, 2}
             * Output : 2
             */
            // Function for finding maximum and value pair
            public static int multiply(int arr[], int n) {
                // Complete the function
                int mid = n / 2;
                int sumright = 0;
                for (int i = 0; i < mid; i++) {
                    sumright = sumright + arr[i];
                }
                int sumleft = 0;
                for (int i = mid; i < n; i++) {
                    sumleft = sumleft + arr[i];
                }
                return (sumleft * sumright);
            }

        }
    }
}
