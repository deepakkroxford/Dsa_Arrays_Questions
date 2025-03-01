package BinarySearch;

public class CapacityToShipPackage {
    boolean isValid(int[] weights, int days, int minAllowed) {
        int ship = 1; // Number of ships required
        int weight = 0; // Current weight on the ship

        for (int i = 0; i < weights.length; i++) {
            // If a single package is heavier than minAllowed, it cannot be shipped
            if (weights[i] > minAllowed) {
                return false;
            }

            if (weight + weights[i] <= minAllowed) {
                // Add the package to the current ship
                weight += weights[i];
            } else {
                // Use a new ship for the package
                ship++;
                weight = weights[i];
            }

            // If ships required exceed the available days, return false
            if (ship > days) {
                return false;
            }
        }
        return true;
    }

    // Main method to find the minimum ship capacity
    public int shipWithinDays(int[] weights, int days) {
        int low = 0; // Start with the heaviest package
        int high = 0; // Sum of all package weights

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        int ans = 0;

        // Binary search to find the minimum ship capacity
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(weights, days, mid)) {
                // If the capacity works, try to minimize it
                ans = mid;
                high = mid - 1;
            } else {
                // If the capacity doesn't work, increase it
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /*
         * leetcode 1011:
         * https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
         * A conveyor belt has packages that must be shipped from one port to another
         * within days days.
         * 
         * The ith package on the conveyor belt has a weight of weights[i]. Each day, we
         * load the ship with packages on the conveyor belt (in the order given by
         * weights). We may not load more weight than the maximum weight capacity of the
         * ship.
         * 
         * Return the least weight capacity of the ship that will result in all the
         * packages on the conveyor belt being shipped within days days.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
         * Output: 15
         * Explanation: A ship capacity of 15 is the minimum to ship all the packages in
         * 5 days like this:
         * 1st day: 1, 2, 3, 4, 5
         * 2nd day: 6, 7
         * 3rd day: 8
         * 4th day: 9
         * 5th day: 10
         * 
         * Note that the cargo must be shipped in the order given, so using a ship of
         * capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6,
         * 7), (8), (9), (10) is not allowed.
         * Example 2:
         * 
         * Input: weights = [3,2,2,4,1,4], days = 3
         * Output: 6
         * Explanation: A ship capacity of 6 is the minimum to ship all the packages in
         * 3 days like this:
         * 1st day: 3, 2
         * 2nd day: 2, 4
         * 3rd day: 1, 4
         * Example 3:
         * 
         * Input: weights = [1,2,3,1,1], days = 4
         * Output: 3
         * Explanation:
         * 1st day: 1
         * 2nd day: 2
         * 3rd day: 3
         * 4th day: 1, 1
         * 
         */

         int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         int days = 5;
         CapacityToShipPackage capacityToShipPackage = new CapacityToShipPackage();
         System.out.println(capacityToShipPackage.shipWithinDays(weights, days)); // Output: 15
    }
}
