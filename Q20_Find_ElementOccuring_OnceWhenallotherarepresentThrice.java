import java.util.Arrays;

/**
 * Q20_Find_ElementOccuring_OnceWhenallotherarepresentThrice
 */
class find_the_unique_out_of_three {
    static int singleElement(int[] arr, int N) {
        Arrays.sort(arr);
        if (N == 1) {
            return arr[0];
        }

        for (int i = 1; i < N - 1; i++) {
            if (arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        /*
         * if we have the unique element at the first and unique at the last then
         * we have to handel this case
         */
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        return arr[N - 1];

    }
}

public class Q20_Find_ElementOccuring_OnceWhenallotherarepresentThrice {

    public static void main(String[] args) {
        /*
         * Given an array of integers arr[] of length N, every element appears thrice
         * except for one which occurs once.
         * Find that element which occurs once.
         * 
         * Example 1: 
         * Input:
         * N = 4
         * arr[] = {1, 10, 1, 1}
         * Output:
         * 10
         * Explanation:
         * 10 occurs once in the array while the other
         * element 1 occurs thrice.
         * 
         * Example 2: 
         * Input:
         * N = 10
         * arr[] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1}
         * Output:
         * 3
         * 
         * Explanation:
         * All elements except 3 occurs thrice in the array.
         * Your Task:
         * You do not need to take any input or print anything. You task is to complete
         * the function singleElement() which takes an array of integers arr and an
         * integer N which finds and returns the element occuring once in the array.
         * 
         * Constraints:
         * 1 ≤ N ≤ 105
         * -109 ≤ A[i] ≤ 109
         * 
         * Expected Time Complexity: O(N).
         * Expected Auxiliary Space: O(1).
         * 
         */
        find_the_unique_out_of_three ans = new find_the_unique_out_of_three();
        int  N = 10;
         int arr[] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1};
         System.out.println(ans.singleElement(arr, N));

    }
}