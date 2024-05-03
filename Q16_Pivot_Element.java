
class pivot{
public int pivotInteger(int n) {
   
     int totalsum = n*(n+1)/2;
     int prefixsum=0;
     for(int i =1;i<=n;i++)
     {
        prefixsum+=i;
        if(prefixsum==totalsum)
        {
            return i;
        }
        else{
            totalsum=totalsum-i;
        }
     }
    return -1;
}
}


public class Q16_Pivot_Element {
    public static void main(String[] args) {
        /*
         * Given a positive integer n, find the pivot integer x such that:
         * 
         * The sum of all elements between 1 and x inclusively equals the sum of all
         * elements between x and n inclusively.
         * Return the pivot integer x. If no such integer exists, return -1. It is
         * guaranteed that there will be at most one pivot index for the given input.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: n = 8
         * Output: 6
         * Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8
         * = 21.
         * Example 2:
         * 
         * Input: n = 1
         * Output: 1
         * Explanation: 1 is the pivot integer since: 1 = 1.
         * Example 3:
         * 
         * Input: n = 4
         * Output: -1
         * Explanation: It can be proved that no such integer exist.
         * 
         * 
         * Constraints:
         * 
         * 1 <= n <= 1000
         * 
         */

        // dry run check
        /*
         * 1=1
         * 1+2+3+4+5+6+7+8=36
         * 
         * 1+2=3
         * 2+3+4+5+6+7+8=35
         * 
         * 1+2+3=6
         * 3+4+5+6+7+8=32
         * 
         * 1+2+3+4=10;
         * 4+5+6+7+8=29
         * 
         * 1+2+3+4+5=15
         * 5+6+7+8=24
         * 
         * 1+2+3+4+5+6=21
         * 6+7+8=21 then 6 is povit point
         * 
         * 
         * prefixsum = 1, 3, 6, 10,15,21,28,36
         * suffixsum = 36,35,33,30,26,21,15,8
         */

        pivot ans = new pivot();
        int n=8;
        System.out.println("the pivot element is ==> "+ans.pivotInteger(n));
    }
}
