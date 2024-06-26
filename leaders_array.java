import java.util.ArrayList;
import java.util.Collections;

// Given an array A of positive integers.
// Your task is to find the leaders in the array.
// An element of array is leader if it is greater than or equal to all the elements to its right side.The rightmost element is always a leader.

//Geeks for Geeks
class Solution___ {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1];
        ans.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;

        /*
         * public class Solution {
         * public int[] solve(int[] A) {
         * int ans[] = new int [A.length];
         * int j=0;
         * int max = A[A.length-1];
         * ans[0]=A[A.length-1];
         * for(int i =A.length-2;i>=0;i--)
         * {
         * if(A[i]>=max)
         * {
         * j++;
         * max=A[i];
         * ans[j]=A[i];
         * }
         * }
         * return Arrays.copyOfRange(ans, 0, j + 1); 
         * // this we use when we have to return the array. using this we can eleminate the zero
         * }
         * }
         */
    }
}

// Input:
// n = 6
// A[] = {16,17,4,3,5,2}
// Output: 17 5 2
// Explanation: The first leader is 17
// as it is greater than all the elements
// to its right. Similarly, the next
// leader is 5. The right most element
// is always a leader so it is also
// included.