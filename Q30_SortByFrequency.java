import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class SortByFrequency {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // step 1 we have to find the frequency of the each element in the array
        // create a hashmap and then store the frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        // step 2 to create and arraylist and add all the number from array
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<arr.length;i++) {
            ans.add(arr[i]);
        }

        // step 3 coustom sort

        Collections.sort(ans, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int freqA = map.get(a);
                int freqB = map.get(b);

                if (freqA != freqB) {
                    return freqB - freqA;
                }
                return a - b;
            }

        });
        return ans;

    }
}

public class Q30_SortByFrequency {
    public static void main(String[] args) {
        /*
         * LeetCode:- 1636.
         * https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
         * * Given an array of integers nums, sort the array in increasing order based on
         * the frequency of the values. If multiple values have the same frequency, sort
         * them in decreasing order.
         * * Return the sorted array.
         * 
         */
        SortByFrequency sorter = new SortByFrequency();
        int arr[] = {5, 5, 4, 6, 4};
        ArrayList<Integer> sortedList = sorter.sortByFreq(arr);
        System.out.println(sortedList);
        

    }
}
