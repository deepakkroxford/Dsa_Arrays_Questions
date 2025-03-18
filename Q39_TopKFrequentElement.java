import java.util.*;

public class Q39_TopKFrequentElement {
    public  static int[] topKFrequent(int[] arr, int k) {
        //step1 = Count the frquency of element in the array
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        // sort by the frequency 
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((a,b)->{
            int freqA = a.getValue();
            int freqB = b.getValue();
            
            return freqB-freqA;
            //return b.getValue()-a.getValue();
        });

        // finding the top k element from the list 
        int ans[] = new int [k];
        for(int i=0;i<k;i++)
        {
            ans[i] = entries.get(i).getKey();
        }
        return ans;
    }
    public static void main(String[] args) {
        /*
           LeetCode:- 347.
           https://leetcode.com/problems/top-k-frequent-elements/description/
         * Given an integer array nums and an integer k, return the k most frequent
         * elements. You may return the answer in any order.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,1,1,2,2,3], k = 2
         * Output: [1,2]
         * Example 2:
         * 
         * Input: nums = [1], k = 1
         * Output: [1]
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 105
         * -104 <= nums[i] <= 104
         * k is in the range [1, the number of unique elements in the array].
         * It is guaranteed that the answer is unique.
         * 
         * 
         * Follow up: Your algorithm's time complexity must be better than O(n log n),
         * where n is the array's size.
         */

            int arr[] = {-1,-1};
            int k = 1;
            int ans[] =Q39_TopKFrequentElement.topKFrequent(arr, k);
            for(int i=0;i<ans.length;i++)
            {
                System.out.print(ans[i]+" ");
            }
    }
}
