import java.util.Arrays;

public class find_unique_element {
    public static void main(String[] args) {
        /*
         * Given an array of size n which contains all elements occurring in multiples
         * of K,
         * except one element which doesn't occur in multiple of K.
         * Find that unique element.
         * 
         * Example 1:
         * 
         * Input :
         * n = 7, k = 3
         * arr[] = {6, 2, 5, 2, 2, 6, 6}
         * Output :
         * 5
         * Explanation:
         * Every element appears 3 times except 5.
         * 
         * 
         * Example 2:
         * 
         * Input :
         * n = 5, k = 4
         * arr[] = {2, 2, 2, 10, 2}
         * Output :
         * 10
         * Explanation:
         * Every element appears 4 times except 10.
         */

        class Solution {

            public int findUnique(int a[], int n, int k) {
                Arrays.sort(a);
                int count = 1;
                for (int i = 1; i < n; i++) {
                    if (a[i] == a[i - 1]) {
                        count++;
                    } else if (count % k != 0) {

                        return a[i - 1];
                    } else {
                        count = 1;
                    }

                }
                return a[n - 1];

            }
        }
    }
}
