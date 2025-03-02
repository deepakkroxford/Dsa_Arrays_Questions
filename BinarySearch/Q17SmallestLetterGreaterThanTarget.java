package BinarySearch;

public class Q17SmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    public char nextGreatestLetterUsingBinary(char[] letters, char target) {
       int low =0;
         int high = letters.length-1;
            while(low<=high)
            {
                int mid = low + (high-low)/2;
                // we need greater than the target value if we get equal then we have to move right side to find just bigger character then the target
                if(letters[mid]<=target)
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
            return letters[low%letters.length];
    }
    public static void main(String[] args) {
        /*Leetcode - 744 https://leetcode.com/problems/find-smallest-letter-greater-than-target/?envType=study-plan-v2&envId=binary-search
         * You are given an array of characters letters that is sorted in non-decreasing
         * order, and a character target. There are at least two different characters in
         * letters.
         * 
         * Return the smallest character in letters that is lexicographically greater
         * than target. If such a character does not exist, return the first character
         * in letters.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: letters = ["c","f","j"], target = "a"
         * Output: "c"
         * Explanation: The smallest character that is lexicographically greater than
         * 'a' in letters is 'c'.
         * Example 2:
         * 
         * Input: letters = ["c","f","j"], target = "c"
         * Output: "f"
         * Explanation: The smallest character that is lexicographically greater than
         * 'c' in letters is 'f'.
         * Example 3:
         * 
         * Input: letters = ["x","x","y","y"], target = "z"
         * Output: "x"
         * Explanation: There are no characters in letters that is lexicographically
         * greater than 'z' so we return letters[0].
         * 
         * 
         * Constraints:
         * 
         * 2 <= letters.length <= 104
         * letters[i] is a lowercase English letter.
         * letters is sorted in non-decreasing order.
         * letters contains at least two different characters.
         * target is a lowercase English letter.
         */

        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        Q17SmallestLetterGreaterThanTarget obj = new Q17SmallestLetterGreaterThanTarget();
        System.out.println(obj.nextGreatestLetter(letters, target));

        System.out.println(obj.nextGreatestLetterUsingBinary(letters, target));

    }
}
