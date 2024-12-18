package SearchingAlgorithms;

import java.util.Arrays;

public class AgressiveCow {
   boolean isCowfits (int stalls[], int k, int minDis)
  {
    int cow =1;
    int lastPos = stalls[0];
    for(int i =1; i<stalls.length; i++)
    {
      if(stalls[i] - lastPos >= minDis)
      {
        cow++;
        lastPos = stalls[i];
      }
      if(cow == k)
        return true;
    }
    return false;
  }

    public int aggressiveCows(int[] stalls, int k) {
        /*
         * In this problem we have to find the maximum minimum distance where we can palce the aggresive cow
         * so we use the binary search for finding the maximum minimum distance
         * 
         * 
         */

         /*
          * Step 1: Sort the given stalls positions
          */

          Arrays.sort(stalls);
          int low = 1; // the minimum distance should be one at least between two cows
          int high = stalls[stalls.length - 1] - stalls[0]; // the maximum distance between the two cow is when we place the cow in the first position ans the last poistion 
            int ans = 0;
          /*
           * Step 2: writing the logic for the binary search
           */
            while (low<=high) {
              int mid = low + (high - low)/2;

              if(isCowfits(stalls,k,mid))
              {
                ans = mid;
                low = mid + 1;
              }
              else{
                high = mid - 1;
              }
            }



           return ans;

    }

    public static void main(String[] args) {
        /* Medium  https://www.geeksforgeeks.org/problems/aggressive-cows/1
         * You are given an array with unique elements of stalls[], which denote the
         * position of a stall. You are also given an integer k which denotes the number
         * of aggressive cows. Your task is to assign stalls to k cows such that the
         * minimum distance between any two of them is the maximum possible.
         * 
         * Examples :
         * 
         * Input: stalls[] = [1, 2, 4, 8, 9], k = 3
         * Output: 3
         * Explanation: The first cow can be placed at stalls[0],
         * the second cow can be placed at stalls[2] and
         * the third cow can be placed at stalls[3].
         * The minimum distance between cows, in this case, is 3, which also is the
         * largest among all possible ways.
         * Input: stalls[] = [10, 1, 2, 7, 5], k = 3
         * Output: 4
         * Explanation: The first cow can be placed at stalls[0],
         * the second cow can be placed at stalls[1] and
         * the third cow can be placed at stalls[4].
         * The minimum distance between cows, in this case, is 4, which also is the
         * largest among all possible ways.
         * Input: stalls[] = [2, 12, 11, 3, 26, 7], k = 5
         * Output: 1
         * Explanation: Each cow can be placed in any of the stalls, as the no. of
         * stalls are exactly equal to the number of cows.
         * The minimum distance between cows, in this case, is 1, which also is the
         * largest among all possible ways.
         */

         int[] stalls = {1, 2, 4, 8, 9};
         int k = 3;
         AgressiveCow obj = new AgressiveCow();
         System.out.println(obj.aggressiveCows(stalls, k)); // 3
         
    }
}
