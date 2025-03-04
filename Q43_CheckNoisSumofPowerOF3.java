public class Q43_CheckNoisSumofPowerOF3 {
    public boolean checkPowersOfThree(int n) {
        while(n>0)
        {
            if(n%2==2)
            {
                return false;
            }
            n=n/3;
        }
        return true;
    }
    public static void main(String[] args) {

        /*
         * 1780. Check if Number is a Sum of Powers of Three
         * https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
         * 
         * Hint
         * Given an integer n, return true if it is possible to represent n as the sum
         * of distinct powers of three. Otherwise, return false.
         * 
         * An integer y is a power of three if there exists an integer x such that y ==
         * 3x.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: n = 12
         * Output: true
         * Explanation: 12 = 31 + 32
         * Example 2:
         * 
         * Input: n = 91
         * Output: true
         * Explanation: 91 = 30 + 32 + 34
         * Example 3:
         * 
         * Input: n = 21
         * Output: false
         * 
         * 
         * Constraints:
         * 
         * 1 <= n <= 107
         * 
         */

        int n = 12;
        Q43_CheckNoisSumofPowerOF3 obj = new Q43_CheckNoisSumofPowerOF3();
        System.out.println("the anser is: "+obj.checkPowersOfThree(n));

    }

}
