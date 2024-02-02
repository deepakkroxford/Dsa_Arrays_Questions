import java.util.HashSet;

public class Sum_equals_to_Sum {
    public static void main(String[] args) {
        /*
         * Given an array A of N integers. The task is to find if there are two pairs
         * (a, b) and (c, d) such that a+b = c+d.
         * 
         * Example 1:
         * 
         * Input:N=7 A[] = {3, 4, 7, 1, 2, 9, 8} Output: 1Explanation:(3, 7) and (9, 1)
         * are the pairs whosesum are equal.
         * 
         * Example 2:
         * 
         * Input:N=7 A[] = {65, 30, 7, 90, 1, 9, 8}Output: 0
         * 
         */


class Solution
{ 
    public int findPairs(int arr[],int n) 
    { 
        //code here.
        HashSet<Integer> ans = new HashSet<>();
        int sum=0;
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                sum =arr[i]+arr[j];
                if(ans.contains(sum))
                {
                    return 1;
                }
                ans.add(sum);
            }
        }
        return 0;
    }
}
    }
}
