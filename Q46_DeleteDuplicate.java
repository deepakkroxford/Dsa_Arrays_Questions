import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class Q46_DeleteDuplicate {

    public static List<Integer> findUniqueElements(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }

        for(var e:map.entrySet())
        {
            int value = e.getValue();
            if(value==1)
            {
                ans.add(e.getKey());
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        /*
         * Write a Java program to find all unique elements in a given array. A unique
         * element is an element that appears only once in the array.
         * 
         * Example 1:
         * 
         * Input:
         * 
         * int[] arr = {1, 1, 2, 3, 4, 4, 5, 15, 15, 12, 11};
         * Output:
         * 
         * [2, 3, 5, 12, 11]
         * Explanation:
         * 
         * 1 appears twice, so it's not unique.
         * 4 and 15 also appear twice.
         * The elements 2, 3, 5, 12, and 11 appear only once, so they are the unique
         * elements.
         * Example 2:
         * 
         * Input:
         * 
         * int[] arr = {7, 8, 9, 10, 7, 8, 9};
         * Output:
         * 
         * [10]
         * Explanation:
         * 
         * 7, 8, and 9 appear twice.
         * 10 appears only once, so it's the only unique element.
         * Constraints:
         * 
         * The array size can be 1 ≤ n ≤ 10⁶.
         * The elements are integers and can be negative.
         */

        int[] arr = {1, 1, 2, 3, 4, 4, 5, 15, 15, 12, 11};
        System.out.println("Input array: " + Arrays.toString(arr));

        List<Integer> result = findUniqueElements(arr);
        
        System.out.println("Unique elements: " + result);

        int[] arr2 = {7, 8, 9, 10, 7, 8, 9};
        System.out.println("\nInput array: " + Arrays.toString(arr2));
        result = findUniqueElements(arr2);
        System.out.println("Unique elements: " + result);
      
    }
}
