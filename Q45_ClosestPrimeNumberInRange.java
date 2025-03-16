import java.util.*;

public class Q45_ClosestPrimeNumberInRange {
    public static boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        else 
        {
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
           if(isPrime(i))
           {
            ans.add(i);
           }
        }
        if(ans.size()<2)
        {
            return new int[] {-1,-1};
        }

        int minDiffrence = Integer.MAX_VALUE;
        int res[] =new int [2];
        for(int i=1;i<ans.size();i++){
            int diff = ans.get(i)-ans.get(i-1);
            if(diff<minDiffrence)
            {
                minDiffrence = diff;
                res[0]=ans.get(i-1);
                res[1]=ans.get(i);
            }
        }
        return res;

    }
    public static void main(String[] args) {
        /*Leetcode - 2523
        https://leetcode.com/problems/closest-prime-numbers-in-range/
         * Given two positive integers left and right, find the two integers num1 and
         * num2 such that:
         * 
         * left <= num1 < num2 <= right .
         * Both num1 and num2 are prime numbers.
         * num2 - num1 is the minimum amongst all other pairs satisfying the above
         * conditions.
         * Return the positive integer array ans = [num1, num2]. If there are multiple
         * pairs satisfying these conditions, return the one with the smallest num1
         * value. If no such numbers exist, return [-1, -1].
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: left = 10, right = 19
         * Output: [11,13]
         * Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
         * The closest gap between any pair is 2, which can be achieved by [11,13] or
         * [17,19].
         * Since 11 is smaller than 17, we return the first pair.
         * Example 2:
         * 
         * Input: left = 4, right = 6
         * Output: [-1,-1]
         * Explanation: There exists only one prime number in the given range, so the
         * conditions cannot be satisfied.
         * 
         * 
         * Constraints:
         * 
         * 1 <= left <= right <= 106
         * 
         */

        int left = 10;
        int right = 19;
        Q45_ClosestPrimeNumberInRange obj = new Q45_ClosestPrimeNumberInRange();
        int res[] = obj.closestPrimes(left, right);
        System.out.println(res[0]+" "+res[1]);

    }
}
