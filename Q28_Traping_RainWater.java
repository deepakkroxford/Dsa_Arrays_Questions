class RainWaterTrap {
    static long maxwater(int arr[], int n) {
        /*
         * Time complexity -> O(3N) => O(N);
         * Space complexity -> O(N)
         */

        long water = 0;
        // first we have to find the maxleft
        int maxleft[] = new int[arr.length];
        maxleft[0] = 0;
        for (int i = 1; i < n; i++) {
            maxleft[i] = Math.max(maxleft[i - 1], arr[i - 1]);
        }
        // second we have to find the maxright
        int maxright[] = new int[arr.length];
        maxleft[arr.length - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            maxright[i] = Math.max(maxright[i + 1], arr[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int minhight = Math.min(maxleft[i], maxright[i]);
            if (minhight - arr[i] >= 0) {
                water += minhight - arr[i];
            }
        }

        return water;
    }
}

public class Q28_Traping_RainWater {

    public static void main(String[] args) {
        /*
         * Trapping Rain Water
         * Difficulty: MediumAccuracy: 33.14%Submissions: 413K+Points: 4
         * Given an array arr[] of N non-negative integers representing the height of
         * blocks. If width of each block is 1, compute how much water can be trapped
         * between the blocks during the rainy season.
         * 
         * 
         * Example 1:
         * Input:
         * N = 6
         * arr[] = {3,0,0,2,0,4}
         * Output:
         * 10
         * 
         * Example 2:
         * Input:
         * N = 4
         * arr[] = {7,4,0,9}
         * Output:
         * 10
         * Explanation:
         * Water trapped by above
         * block of height 4 is 3 units and above
         * block of height 0 is 7 units. So, the
         * total unit of water trapped is 10 units.
         * 
         * Example:3
         * Input:
         * N = 3
         * arr[] = {6,9,9}
         * Output:
         * 0
         * Explanation:
         * No water will be trapped.
         * 
         * Your Task:
         * You don't need to read input or print anything. The task is to complete the
         * function trappingWater() which takes arr[] and N as input parameters and
         * returns the total amount of water that can be trapped.
         * 
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(N)
         * 
         * 
         * Constraints:
         * 3 < N < 106
         * 0 < Ai < 108
         * 
         */

         int arr[]={6,9,9};
         int n = arr.length;
         System.out.println("the water stored will be --> "+RainWaterTrap.maxwater(arr, n));

         int arr2[]={4,2,0, 5 ,2 ,6, 2, 3};
         int n2 = arr2.length;
         System.out.println("the water will store--> "+RainWaterTrap.maxwater(arr2, n2));
    }
}
