
// Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal 
// if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
// Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

import java.util.Arrays;

public class Check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 4, 0 };
        int b[] = { 2, 4, 5, 0, 1 };
     
        // time complexity 0(nlogn) so this technique is not optimize
        Arrays.sort(a);
        Arrays.sort(b);
        int count = 0;

        // geeks for Geeks Solution 0(N)

        // Input:
        // N = 5
        // A[] = {1,2,5,4,0}
        // B[] = {2,4,5,0,1}
        // Output: 1
        // Explanation: Both the array can be
        // rearranged to {0,1,2,4,5}
        // Expected Time Complexity : O(N)
        // Expected Auxilliary Space : O(N)


        // for (int i = 0; i < N; i++) {
        //     if (A[i] != B[i])
        //         return false;
        // }
        // return true;

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= b.length - 1; j++) {
                if (a[i] == b[j]) {
                    count++;
                }

            }
        }
        if (count == a.length) {
            System.out.println("array is same");
        } else {
            System.out.println("array are not same");
        }

    }
}

/*
 * 2nd apporach
 * let take the two given array is A and B given below
 * A[] = {1,2,5,4,0} B[] = {2,4,5,0,1}
 * so we can solve the problem using the Hash technique
 * so the apporach is first we traverse the array A[] one bye one only one time
 * and what ever the element we get incremnt the count by 1
 * and in the second array B[] what ever the element we get we decrease the
 * count
 * by one.
 * after doing this if the count of every element get 0 so it means that
 * our both array is same
 * 
 */