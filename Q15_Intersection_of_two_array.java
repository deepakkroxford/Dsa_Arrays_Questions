import java.util.ArrayList;
import java.util.HashSet;

class Intersection_of_two_array {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }

        int result[] = new int[set2.size()];

        int i = 0;
        for (Integer e : set2) {
            result[i++] = e;

        }
        return result;

    }
}

public class Q15_Intersection_of_two_array {
    public static void main(String[] args) {

        /*
         * leetcode -349 easy
         * Given two integer arrays nums1 and nums2, return an array of their
         * intersection. Each element in the result must be unique and you may return
         * the result in any order.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums1 = [1,2,2,1], nums2 = [2,2]
         * Output: [2]
         * Example 2:
         * 
         * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
         * Output: [9,4]
         * Explanation: [4,9] is also accepted.
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums1.length, nums2.length <= 1000
         * 0 <= nums1[i], nums2[i] <= 1000
         */

        Intersection_of_two_array ans = new Intersection_of_two_array();
        int nums1[] = { 4, 9, 5 };
        int nums2[] = { 9, 4, 9, 8, 4 };
        int[] intersection = ans.intersection(nums1, nums2);

        for (int i = 0; i < intersection.length; i++) {
            System.out.println(intersection[i]);
        }

        // Second approch to solve this
        HashSet<Integer> map1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            map1.add(nums1[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map1.contains(nums2[i])) {
                list.add(nums2[i]);
                map1.remove(nums2[i]);
            }
        }

        System.out.println(list);

        /*
         * Given two arrays a[] and b[] respectively of size n and m, the task is to
         * print the count of elements in the intersection (or common elements) of the
         * two arrays.
         * 
         * For this question, the intersection of two arrays can be defined as the set
         * containing distinct common elements between the two arrays.
         * 
         * Example 1:
         * 
         * Input:
         * n = 5, m = 3
         * a[] = {89, 24, 75, 11, 23}
         * b[] = {89, 2, 4}
         * 
         * Output: 1
         * 
         * Explanation:
         * 89 is the only element
         * in the intersection of two arrays.
         * Example 2:
         * 
         * Input:
         * n = 6, m = 5
         * a[] = {1, 2, 3, 4, 5, 6}
         * b[] = {3, 4, 5, 6, 7}
         * 
         * Output: 4
         * 
         * Explanation:
         * 3 4 5 and 6 are the elements
         * in the intersection of two arrays.
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function NumberofElementsInIntersection() which takes two integers n and m
         * and their respective arrays a[] and b[] as input. The function should return
         * the count of the number of elements in the intersection.
         * 
         * 
         * 
         * Expected Time Complexity: O(n + m).
         * Expected Auxiliary Space: O(n).
         * 
         * Constraints:
         * 1 ≤ n, m ≤ 105
         * 1 ≤ a[i], b[i] ≤ 105
         * 
         * NOTE: now in this case we have to return the count of intersection between
         * two array
         * 
         */

        int a[] = { 89, 24, 75, 11, 23 };
        int b[] = { 89, 2, 4 };

        int count = 0;
        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set1.add(a[i]);

        }

        for (int i = 0; i < b.length; i++) {
            if (set1.contains(b[i])) {
                count++;
                set1.remove(b[i]);
            }
        }

        /*
         * or we can solve like this also
         * HashSet <Integer> set2 = new HashSet<>();
         * for(int i =0;i<m;i++)
         * {
         * if(set1.contains(b[i]))
         * {
         * set2.add(b[i]);
         * }
         * }
         * 
         * count=set2.size();
         */

        System.out.println(count);

    }
}
