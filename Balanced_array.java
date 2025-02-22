public class Balanced_array {
    public static void main(String[] args) {
        /*
         * Given an array of even size N, task is to find minimum value that can be
         * added to an element so that array become balanced. An array is balanced if
         * the sum of the left half of the array elements is equal to the sum of right
         * half.
         * 
         * Input:
         * N = 4
         * arr[] = {1, 5, 3, 2}
         * Output: 1
         * Explanation:
         * Sum of first 2 elements is 1 + 5 = 6,
         * Sum of last 2 elements is 3 + 2 = 5,
         * To make the array balanced you can add 1.
         */
class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
   int mid = n/2;
    long sumLeft =0;
    long sumRight=0;
      for(int i=0;i<mid;i++)
      {
          sumLeft = sumLeft+a[i];
      }
      for(int i=mid;i<n;i++)
      {
          sumRight = sumRight+a[i];
      }
      return Math.abs(sumLeft-sumRight);

    }
}
    }
}
