public class Index_of_first_1_in_a_sorted_array_of_0s_and_1s {
    public static void main(String[] args) {
        /*
         * Given a sorted array consisting 0s and 1s. The task is to find the index of
         * first 1 in the given array.
         * 
         * Input :
         * arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
         * Output :
         * 6
         * Explanation:
         * The index of first 1 in the array is 6.
         * 
         * Input :
         * arr[] = {0, 0, 0, 0}
         * Output :
         * -1
         * Explanation:
         * 1's are not present in the array.
         */

         class Solution {
    
            public long firstIndex(long arr[], long n)
            {
                // Your code goes here\
                int count=0;
                for(int i =0;i<n;i++)
                {
                    if(arr[i]==1)
                    {
                        return i;
                    }
                }
                return -1;
            }

    }
}
}
