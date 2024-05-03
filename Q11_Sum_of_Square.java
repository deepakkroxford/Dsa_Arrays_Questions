
class sumofsquare {
    public boolean judgeSquareSum(int c) {

        if (c < 0) {
            return false;
        }

        long left = 0;
        long right = (int) Math.sqrt(c);

        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c)
                return true;
            else if (sum < c)
                left++;
            else
                right--;
        }
        return false;

    }
}

public class Q11_Sum_of_Square {

    public static void main(String[] args) {
        /*
         * Given a non-negative integer c, decide whether there're two integers a and b
         * such that a^2 + b^2 = c.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: c = 5
         * Output: true
         * Explanation: 1 * 1 + 2 * 2 = 5
         * 
         * Example 2:
         * Input: c = 3
         * Output: false
         * 
         * 
         * 
         */
        int c = 73;
        sumofsquare ans = new sumofsquare();
        System.out.println(ans.judgeSquareSum(c));

    }
}
