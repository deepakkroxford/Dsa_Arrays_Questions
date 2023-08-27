import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class union_of_two_array {
    public static void main(String[] args) {

        /*
         * we use set in set it not allows the duplicate element
         * Union: union means set of elements which is present in array one or array two
         * or both arrays
         */
        HashSet<Integer> set = new HashSet<>();
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int brr[] = { 1, 2, 3 };
        int m = brr.length;

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(brr[i]);
        }

        System.out.println(set);
        System.out.println(set.size());

        /*
         * Union of two arrays can be defined as the common and distinct elements in the
         * two arrays.
         * Given two sorted arrays of size n and m respectively, find their union.
         * Input:
         * n = 5, arr1[] = {1, 2, 3, 4, 5}
         * m = 3, arr2 [] = {1, 2, 3}
         * Output: 1 2 3 4 5
         * Explanation: Distinct elements including
         * both the arrays are: 1 2 3 4 5.
         */

        int arr1[] = { 1 ,35};
        int arr2[] = { 6 ,9, 13, 15, 20, 25, 29, 46};
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        // This loop is used to copy the elements of hashset to arraylist
      for (Integer integer : hs) {
        al.add(integer);
      }

        // for (int j : hs) {
        //     al.add(j);
        // }
        Collections.sort(al);
        System.out.println(al);
    }
}
