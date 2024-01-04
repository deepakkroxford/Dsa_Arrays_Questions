import java.util.Arrays;

public class Count_More_than {
    public static void main(String[] args) {
        /*
         * problem
         * Given an array arr of size N and an element k.
         * The task is to find the count of elements in the array
         * that appear more than n/k times.
         */

        class Solution {
            // Function to find all elements in array that appear more than n/k times.
            public int countOccurence(int[] arr, int n, int k) {
                // your code here,return the answer
                Arrays.sort(arr);
                int occ = n / k;

                int times = 0;
                for (int i = 0; i < n; i++) {
                    int count = 1;
                    while (i < n - 1 && arr[i] == arr[i + 1]) {
                        count++;
                        i++;
                    }

                    if (count > occ) {
                        times++;
                    }
                }
                return times;

            }
        }

    }
}
