import java.util.HashMap;
import java.util.HashSet;


class solutions {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        HashSet <Integer> set= new HashSet<>(map.values());
        return (map.size()==set.size());

}
}

public class unique_number_occurance_by_frequency {
    public static void main(String[] args) {
        /*
         * Given an array of integers arr, return true if the number of occurrences of
         * each value in the array is unique or false otherwise.
         * 
         * 
         * 
         * Example 1:
         * Input: arr = [1,2,2,1,1,3]
         * Output: true
         * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two
         * values have the same number of occurrences.
         * 
         * Example 2:
         * Input: arr = [1,2]
         * Output: false
         * Example 3:
         * 
         * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
         * Output: true
         * 
         * 
         * Constraints:
         * 
         * 1 <= arr.length <= 1000
         * -1000 <= arr[i] <= 1000
         */

         solutions sol = new solutions();

         int[] arr1 = {1, 2, 2, 1, 1, 3}; // Example input
         boolean result1 = sol.uniqueOccurrences(arr1);
         System.out.println("Result for arr1: " + result1);
        
        

    }
}
