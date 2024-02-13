package contest_problem;

class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        /*
         * Given an array arril of size n and two elements x and y. Find the element
         * which is occuring more number of times than other. If both x and y are
         * occurring for equal number of times return the smaller of them.
         * Note: We need to return the element, not its count.
         * Example 1:
         * Input:
         * n = 11
         * arr[] = {1,1,2,2,3,3,4,4,4,4,5}
         * x = 4, У = 5
         * Output: 4
         * Explanation:
         * frequency of 4 is 4. frequency of 5 is 1.
         * 
         * Input:
         * n = 8
         * arr[] = {1,2,3,4,5,6,7,8}
         * x = 1, y = 7
         * Output: 1
         * Explanation:
         * frequency of 1 is 1. frequency of 7 is 1.
         * Since 1 < 7, return 1.
         * Your Task:
         * You don't need to read input or print anything. Complete the function
         * majorityWins) that takes array arr, n, x, y as input parameters and return
         * the element withhigher frequency.
         * Constraints:
         * 1 <=n <= 10^3
         * O<=arri, x,y<= 10^8
         * 
         */
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count1++;
            }
            if (arr[i] == y) {
                count2++;
            }
        }
        if (count1 > count2) {
            return x;
        } else if (count2 > count1) {
            return y;
        }

        if (x < y) {
            return x;
        }
        return y;
    }
}

public class who_Has_Major_Priority {
    // {1,1,2,2,3,3,4,4,4,4,5}
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 4, y = 5;
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5 };
        int n = arr.length;
        System.out.println(s.majorityWins(arr, n, x, y));

    }
}