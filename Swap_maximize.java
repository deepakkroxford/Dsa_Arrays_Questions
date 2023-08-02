import java.util.Arrays;

public class Swap_maximize {

    public static void main(String[] args) {

        /*
         * Given an array a[ ] of N elements.
         * Consider array as a circular array i.e. element after an is a1.
         * The task is to find maximum sum of the absolute difference between
         * consecutive elements with rearrangement of array elements allowed i.e.
         * after any rearrangement of array elements
         * find |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1|.
         */
        // Input:
        // N = 4
        // a[] = {4, 2, 1, 8}
        // Output:
        // 18
        // Explanation: Rearrangement done is {1, 8,
        // 2, 4}. Sum of absolute difference between
        // consecutive elements after rearrangement =
        // |1 - 8| + |8 - 2| + |2 - 4| + |4 - 1| =
        // 7 + 6 + 2 + 3 = 18.

        int a[] = { 4, 2, 1, 8 };
        int n = a.length;
        Arrays.sort(a);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.abs(a[i] - a[n - i - 1]);
        }
        System.out.println(sum);

    }
}
