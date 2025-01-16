package SubArrayProblem;

public class Q22_CountTheNiceSubarray {
    public int numberOfSubarrays(int[] arr, int k) {
        int left =0;
        int right =0;
        int oddCount =0;
        int PrevCount =0;
        int result = 0;
        while( right<arr.length)
        {
            
            if(arr[right]%2!=0)
            {
                oddCount++;
                PrevCount =0;
            }
           

            while(oddCount==k)
            {
                PrevCount++;
                if(arr[left]%2==1){
                    oddCount--;
                }
                left++;
            }
            result += PrevCount;
            right++;
          
            
        }
        return result;

    }
    public static void main(String[] args) {
        /*
         * LeetCode :- 1248. Count Number of Nice Subarrays
         * Medium
         * 
         * Topics
         * Companies
         * 
         * Hint
         * Given an array of integers nums and an integer k. A continuous subarray is
         * called nice if there are k odd numbers on it.
         * 
         * Return the number of nice sub-arrays.
         * 
         * 
         * 
         * Example 1:
         * Input: nums = [1,1,2,1,1], k = 3
         * Output: 2
         * Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and
         * [1,2,1,1].
         * 
         * Example 2:
         * Input: nums = [2,4,6], k = 1
         * Output: 0
         * Explanation: There are no odd numbers in the array.
         * 
         * Example 3:
         * Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
         * Output: 16
         */
        int[] arr = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        Q22_CountTheNiceSubarray obj = new Q22_CountTheNiceSubarray();
        int result = obj.numberOfSubarrays(arr, k);
        System.out.println(result);
    }
}
