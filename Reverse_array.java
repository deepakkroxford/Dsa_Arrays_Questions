import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        /*
         * Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse
         * the array after that position.
         * Example:
         * We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0
         * based indexing so the subarray {5, 6} will be reversed and our
         * output array will be {1, 2, 3, 4, 6, 5}.
         */
        /*
         * Sample Input 1:
         * 2
         * 6 3
         * 1 2 3 4 5 6
         * 5 2
         * 10 9 8 7 6
         * 
         * Sample Output 1:
         * 1 2 3 4 6 5
         * 10 9 8 6 7
         * 
         * Explanation 1:
         * For the first test case,
         * Considering 0-based indexing we have M = 3 so the
         * subarray[M+1 … N-1] has to be reversed.
         * Therefore the required output will be {1, 2, 3, 4, 6, 5}.
         * 
         * For the second test case,
         * Considering 0-based indexing we have M = 2 so the
         * subarray[M+1 … N-1] has to be reversed.
         * Therefore the required output will be {10, 9, 8, 6, 7}.
         * 
         * Sample Input 2:
         * 2
         * 7 3
         * 1 4 5 6 6 7 7
         * 9 3
         * 10 4 5 2 3 6 1 3 6
         * Sample Output 2:
         * 1 4 5 6 7 7 6
         * 10 4 5 2 6 3 1 6 3
         * 
         */

        // this code is for reverse the array element

        // int arr[] = { 1, 2, 3, 4, 5 };
        // int n = arr.length;
        // int i = 0;
        // int j = n-1;
        // while (i<j) {
        // int temp = arr[i];
        // arr[i]=arr[j];
        // arr[j]=temp;
        // i++;
        // j--;
        // }
        // for(int x =0;x<n;x++)
        // {
        // System.out.println(arr[x]);
        // }

        /*
         * acording to the question solution will be
         */

        int arr[] = { 1, 2, 3, 4, 5, 6, 2, 23, 212 };
        int n = arr.length;
        int m = 2;
        int j = n - 1;
        while (m + 1 < j) {
            int temp = arr[m + 1];
            arr[m + 1] = arr[j];
            arr[j] = temp;
            m++;
            j--;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        /*
         * public class Solution
         * {
         * public static void reverseArray(ArrayList<Integer> arr, int m)
         * {
         * // Write your code here.
         * 
         * 
         * 
         * // int temp =arr.get(i);
         * // arr.get(i)=arr.get(j);
         * // arr.get(j)=temp;
         * // j--;
         * for (int i =arr.size()-1;i>m;i--)
         * {
         * Collections.swap(arr,m+1,i);
         * m++;
         * 
         * }
         * 
         * }
         * 
         * }
         */

    }
}
