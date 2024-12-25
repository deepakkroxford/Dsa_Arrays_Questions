package BinarySearch;

public class Q7UpperBound {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor = -1;
        int ceil = -1;

        for (int i=0;i<arr.length;i++) {
            // Update floor if num <= x and num > current floor
            if (arr[i] <= x && (floor == -1 || arr[i] > floor)) {
                floor = arr[i];
            }
            // Update ceil if num >= x and num < current ceil
            if (arr[i] >= x && (ceil == -1 || arr[i] < ceil)) {
                ceil = arr[i];
            }
        }

        return new int[]{floor, ceil};
    }
    public static void main(String[] args) {
        /*
         * Given an unsorted array arr[] of integers and an integer x, find the floor
         * and ceiling of x in arr[].
         * 
         * Floor of x is the largest element which is smaller than or equal to x. Floor
         * of x doesn’t exist if x is smaller than smallest element of arr[].
         * Ceil of x is the smallest element which is greater than or equal to x. Ceil
         * of x doesn’t exist if x is greater than greatest element of arr[].
         * Return an array of integers denoting the [floor, ceil]. Return -1 for floor
         * or ceiling if the floor or ceiling is not present.
         * 
         * 
         * Examples:
         * 
         * Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
         * Output: 6, 8
         * Explanation: Floor of 7 is 6 and ceil of 7 is 8.
         * Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6]
         * Output: 8, -1
         * Explanation: Floor of 10 is 8 but ceil of 10 is not possible.
         * Expected Time Complexity: O(n)
         * Expected Auxiliary Space: O(1)
         * 
         * Constraints :
         * 1 ≤ arr.size ≤ 105
         * 1 ≤ arr[i], x ≤ 106
         */

         Q7UpperBound upperBound = new Q7UpperBound();
         int x = 7;
         int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
         int[] result = upperBound.getFloorAndCeil(x, arr);
         System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
         x = 10;
         arr = new int[]{5, 6, 8, 8, 6, 5, 5, 6};
         result = upperBound.getFloorAndCeil(x, arr);
         System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);

    }
}
