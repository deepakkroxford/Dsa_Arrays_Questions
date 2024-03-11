/**
 * Q4_Maximum_Index
 */

class Maximum_Index {
    int maxindexOn2(int arr[]) {
        int maxdif = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentdiff = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    currentdiff = j - i;

                    if (currentdiff > maxdif) {
                        maxdif = currentdiff;
                    }
                }
            }

        }

        return maxdif;
    }

    int maxindexdifOn(int arr[])
    {
        int i =0;
        int j = arr.length-1;
         int maxdif=0;
        while(i<=j)
        {
            if(arr[i]<=arr[j])
            {
                int currentdiff=j-i;
                maxdif=Math.max(maxdif, currentdiff);
                i++;
                j=arr.length-1;
            }
            else{
                j--;
            }
        }
        return maxdif;
    }
}

public class Q4_Maximum_Index {

    public static void main(String[] args) {
        /*
         * Given an array a of n positive integers. The task is to find the maximum of j
         * - i subjected to the constraint of a[i] < a[j] and i < j.
         * 
         * Example 1:
         * 
         * Input:
         * n = 2
         * a[] = {1, 10}
         * Output:
         * 1
         * Explanation:
         * a[0] < a[1] so (j-i) is 1-0 = 1.
         * Example 2:
         * 
         * Input:
         * n = 9
         * a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
         * Output:
         * 6
         * Explanation:
         * In the given array a[1] < a[7] satisfying the required condition(a[i] < a[j])
         * thus giving the maximum difference of j - i which is 6(7-1).
         * Your Task:
         * The task is to complete the function maxIndexDiff() which finds and returns
         * maximum index difference. Printing the output will be handled by driver code.
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(N)
         * 
         * Constraints:
         * 1 ≤ n ≤ 106
         * 0 ≤ a[i] ≤ 109
         * 
         * int a[] = { 9, 4, 8, 16, 19, 2 };
         * int a[] = {29,29,8,1,26,10,1,22,14,26};
         */
        Maximum_Index ans = new Maximum_Index();

        int a[] = {29,29,8,1,26,10,1,22,14,26};
        System.out.println(ans.maxindexOn2(a));
        System.out.println(ans.maxindexdifOn(a));

    }
}