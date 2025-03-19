import java.util.Arrays;
import java.util.Comparator;

public class Q48_FormLargestNumber {
    // sorting logic using the comparator class
    class Sortinglogic implements Comparator<String>{
       
        @Override
        public int compare(String s1,String s2)
        {
            return s2.compareTo(s1);
        }
    }

    public String largestNumber(int[] nums) {

        //Step 1 : We have to conver into String to perform the operation beacuse the number is very large according to the question 
        String [] value = new String[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            value[i] = String.valueOf(nums[i]);
        }

        // using the comparator do the coustom sort 
        Arrays.sort(value,(a, b)->{
            return (b+a).compareTo(a+b);
        });
        
        // we can sort like this also using the class and implementing the comparator
       // Arrays.sort(value,new Sortinglogic());

        // edge case 
        if (value[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<value.length;i++)
        {
            sb.append(value[i]);
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        /*
         * leetcode : 179
         * https://leetcode.com/problems/largest-number/description/
         *
         *
         * Given a list of non-negative integers nums, arrange them such that they form
         * the largest number and return it.
         * Since the result may be very large, so you need to return a string instead of
         * an integer.
         * 
         * Example 1:
         * Input: nums = [10,2]
         * Output: "210"
         * 
         * Example 2:
         * Input: nums = [3,30,34,5,9]
         * Output: "9534330"
         * 
         * Constraints:
         * 1 <= nums.length <= 100
         * 0 <= nums[i] <= 109
         */
        
        int nums[] = {3,30,34,5,9};
        Q48_FormLargestNumber obj = new Q48_FormLargestNumber();
        String ans = obj.largestNumber(nums);
        System.out.println(ans);


        int nums2[] = {0,0};
        String ans2 = obj.largestNumber(nums2);
        System.out.println(ans2);


    }
}
