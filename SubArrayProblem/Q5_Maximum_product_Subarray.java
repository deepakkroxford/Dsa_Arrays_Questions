package SubArrayProblem;

class BruteToOptimal {
    int maxProductON3(int[] arr) {
        int maxproduct = arr[0];
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int currentproduct = 1;
                for (int k = i; k <= j; k++) {
                    currentproduct *= arr[k];
                }
                maxproduct = Math.max(maxproduct, currentproduct);
            }

        }
        return maxproduct;
    }
    int maxProductON2(int[] arr) {
        int maxproduct = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentproduct =1;
            for (int j = i; j < arr.length; j++) {
                currentproduct=currentproduct*arr[j];
                maxproduct = Math.max(maxproduct, currentproduct);
            }
        }
        return maxproduct;
    }

    int maxProductON(int[] arr) {
        int maxproduct = Integer.MIN_VALUE;
        int suffix=1;
        int prefix = 1;

        for(int i =0;i<arr.length;i++)
        {
            if(suffix==0)
            {
                suffix=1;
            }
            if(prefix==1)
            {
                prefix = 1;
            }

            prefix *=arr[i];
            suffix*=arr[arr.length-i-1];
            maxproduct = Math.max(maxproduct,Math.max(prefix, suffix));

        }
        return maxproduct;
    }
}

public class Q5_Maximum_product_Subarray {
    public static void main(String[] args) {
        /*
         * Given an array Arr[] that contains N integers (may be positive, negative or
         * zero). Find the product of the maximum product subarray.
         * 
         * Example 1:
         * Input:
         * N = 5
         * Arr[] = {6, -3, -10, 0, 2}
         * Output: 180
         * Explanation: Subarray with maximum product
         * is [6, -3, -10] which gives product as 180.
         * 
         * Example 2:
         * Input:
         * N = 6
         * Arr[] = {2, 3, 4, 5, -1, 0}
         * Output: 120
         * Explanation: Subarray with maximum product
         * is [2, 3, 4, 5] which gives product as 120.
         * 
         * 
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function maxProduct() which takes the array of integers arr and n as
         * parameters and returns an integer denoting the answer.
         * Note: Use 64-bit integer data type to avoid overflow.
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(1)
         * 
         * Constraints:
         * 1 ≤ N ≤ 500
         * -102 ≤ Arri ≤ 102
         * 
         */

        BruteToOptimal ans = new BruteToOptimal();
        int arr[] = {0 ,0 ,-5 ,0 ,0};
        System.out.println(ans.maxProductON(arr));
    }
}
