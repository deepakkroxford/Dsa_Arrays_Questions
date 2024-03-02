package SubArrayProblem;

import java.util.HashMap;

class count_zero_sumsubarray
{

    int countOn(int arr[],int n)
    {
       
       int count =0;
       HashMap<Integer, Integer>map = new HashMap<>();
       int sum = 0;
       map.put(sum, 1);
       for(int i =0;i<n;i++)
       {
        sum = sum+arr[i];

        if(!map.containsKey(sum))
        {
            map.put(sum, 1);
        }
        else{
            count = count+map.get(sum);
            map.put(sum, map.get(sum)+1);
        }
       }
        return count;
    }

    int countOn3(int arr[],int n)
    {
       
        int count =0;
        for(int i =0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum =0;
                for(int k =i;k<=j;k++)
                {
                   sum +=arr[k];
                }
                if(sum==0)
                {
                    count++;
                }
                sum=0;
            }
        }

        return count;
    }


    int countOn2(int arr[],int n)
    {
       
        int count =0;
        for(int i =0;i<n;i++)
        {
            int sum =0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==0)
                {
                    count++;
                }
            }
            sum=0;
        }
        return count;
    }
   
    
}
public class Q6_Zero_sum_Subarray {
    public static void main(String[] args) {
        /*
         * You are given an array arr[] of size n. Find the total count of sub-arrays
         * having their sum equal to 0.
         * 
         * 
         * Example 1:
         * 
         * Input:
         * n = 6
         * arr[] = {0,0,5,5,0,0}
         * Output: 6
         * Explanation: The 6 subarrays are
         * [0], [0], [0], [0], [0,0], and [0,0].
         * 
         * Example 2:
         * 
         * Input:
         * n = 10
         * arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
         * Output: 4
         * Explanation: The 4 subarrays are [-1 -3 4]
         * [-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
         * 
         * Your Task:
         * You don't need to read input or print anything. Complete the function
         * findSubarray() that takes the array arr and its size n as input parameters
         * and returns the total number of sub-arrays with 0 sum.
         * 
         * 
         * Expected Time Complexity: O(n*log(n))
         * Expected Auxilliary Space: O(n)
         * 
         * 
         * Constraints:
         * 1 <= n <= 10^6
         * -10^9 <= arr[ i ] <= 10^9
         * 
         */


         count_zero_sumsubarray ans = new count_zero_sumsubarray();
         int arr[] ={2,8,-3,-5,2,-4,6,1,2,1,-3,4};
         int n = arr.length;
         System.out.println(ans.countOn(arr, n));
         System.out.println(ans.countOn2(arr, n));
         System.out.println(ans.countOn3(arr, n));
    }
}
