package SubArrayProblem;

import java.util.HashMap;

class subarraysumK {
    int subarraywithsum_K_ON(int arr[],int k ) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(sum, 1);
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];

            
            

            if(map.containsKey(sum-k))
            {
                count =count +map.get(sum-k);
            }
           
            map.put(sum, map.getOrDefault(sum,0)+1);
            
        }

        return count;
    }
    int subarraywithsum_K_ON2(int arr[],int k ) {

        int count = 0;
       
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    count++;
                }
            }
            sum = 0;
        }

        return count;
    }
}

public class Q8_Subarray_with_sum_K {
    public static void main(String[] args) {

        /*
         * Given an unsorted array of integers, find the number of continuous subarrays
         * having sum exactly equal to a given number k.
         * 
         * 
         * Example 1:
         * Input:
         * N = 5
         * Arr = {10 , 2, -2, -20, 10}
         * k = -10
         * Output: 3
         * Explaination:
         * Subarrays: arr[0...3], arr[1...4], arr[3..4]
         * have sum exactly equal to -10.
         * 
         * 
         * Example 2:
         * Input:
         * N = 6
         * Arr = {9, 4, 20, 3, 10, 5}
         * k = 33
         * Output: 2
         * Explaination:
         * Subarrays : arr[0...2], arr[2...4] have sum
         * exactly equal to 33.
         * 
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function findSubArraySum() which takes the array Arr[] and its size N and k
         * as input parameters and returns the count of subarrays.
         * 
         * 
         * Expected Time Complexity: O(NlogN)
         * Expected Auxiliary Space: O(N)
         * 
         * {3,9,-2,4,1,-7,2,6,-5,8,-3,-7,6,2,1};
         * 0 ,0, 5, 5, 0, 0
         */

         subarraysumK ans = new subarraysumK();
         int arr[]={0 ,0, 5, 5, 0, 0};
         int k =0;
         System.out.println("subarray with sum k is "+ans.subarraywithsum_K_ON2(arr,k));
         System.out.println("subarray with sum k is "+ans.subarraywithsum_K_ON(arr,k));
    }
}
