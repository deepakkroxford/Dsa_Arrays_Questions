class Q53_ReverseSubsetByK {
    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        //we are traversing the array in group of k that why we increse the i by k times
        for (int i = 0; i < n; i += k) {
            //here the left is the starting point of the group and right is the ending point of the group
            int left = i;
            //here the right is the ending point of the group and we are using Math.min to avoid the index out of bound error
            int right = Math.min(i + k - 1, n - 1);
            reverse(arr, left, right);
        }
        
    }
    public static void main(String[] args) {
        /**
         * Given an array arr[] of positive integers. Reverse every sub-array group of
         * size k.
         * Note: If at any instance, k is greater or equal to the array size, then
         * reverse the entire array.
         * 
         * Examples:
         * 
         * Input: arr[] = [1, 2, 3, 4, 5], k = 3
         * Output: [3, 2, 1, 5, 4]
         * Explanation: First group consists of elements 1, 2, 3. Second group consists
         * of 4, 5.
         * Input: arr[] = [5, 6, 8, 9], k = 5
         * Output: [9, 8, 6, 5]
         * Explnation: Since k is greater than array size, the entire array is reversed.
         * Constraints:
         * 1 ≤ arr.size(), k ≤ 105
         * 1 ≤ arr[i] ≤ 105
         *
         */
        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;
        Q53_ReverseSubsetByK obj = new Q53_ReverseSubsetByK();
        obj.reverseInGroups(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}