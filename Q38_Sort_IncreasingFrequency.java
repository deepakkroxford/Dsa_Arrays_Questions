import java.util.Arrays;
import java.util.HashMap;

public class Q38_Sort_IncreasingFrequency {
  
        public static int[] frequencySort(int[] arr) {
            //Step 1: Create a HashMap to store the frequency of each elememt 
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<arr.length;i++)
            {
                map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            }
            //Step 2 :Store the array value into Integer
            Integer[] arr1 = new Integer[arr.length];
            for(int i=0;i<arr.length;i++)
            {
                arr1[i] = arr[i];
            }
            // step 2: Custom sort
            Arrays.sort(arr1,(a,b)->{
                int freqA = map.get(a);
                int freqB = map.get(b);
                if(freqA==freqB){
                    return b-a;
                }
                return freqA-freqB;

            });

            for(int i=0;i<arr.length;i++){
                arr[i] = arr1[i];
            }
            return arr;
            
        }
   
    public static void main(String[] args) {
        /*1636. Sort Array by Increasing Frequency
          https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
         * Given an array of integers nums, sort the array in increasing order based on
         * the frequency of the values. If multiple values have the same frequency, sort
         * them in decreasing order.
         * 
         * Return the sorted array.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,1,2,2,2,3]
         * Output: [3,1,1,2,2,2]
         * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has
         * a frequency of 3.
         * Example 2:
         * 
         * Input: nums = [2,3,1,3,2]
         * Output: [1,3,3,2,2]
         * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in
         * decreasing order.
         * Example 3:
         * 
         * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
         * Output: [5,-1,4,4,-6,-6,1,1,1]
         */

         int arr[] ={-1,1,-6,4,5,-6,1,4,1};
        int res[]= Q38_Sort_IncreasingFrequency.frequencySort(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
