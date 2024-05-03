/**
 * InnerQ17_can_we_place
 */
class Solution_can_place_flower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int max = 0;
        int firstone = -1;
        int lastone = -1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                continue;
            } else if (firstone == -1) {
                firstone = i;
                lastone = i;
            } else {
                lastone = i;
            }
        }

        if (firstone == -1) {
            max = (flowerbed.length + 1) / 2;
        } else {
            int firstzero = firstone;
            int lastzero = flowerbed.length - 1 - lastone;

            max = firstzero / 2;
            max += lastzero / 2;

            int count = 0;
            for (int i = firstone + 1; i < lastone; i++) {
                if (flowerbed[i] == 0) {
                    count++;
                } else {
                    max += (count - 1) / 2;
                    count = 0;
                }
            }

            max += (count - 1) / 2;
        }
        return n <= max;
    }
}

public class Q17_can_we_place_flower {
    public static void main(String[] args) {
        // leetcode -> 605
        /*
         * You have a long flowerbed in which some of the plots are planted, and some
         * are not. However, flowers cannot be planted in adjacent plots.
         * 
         * Given an integer array flowerbed containing 0's and 1's, where 0 means empty
         * and 1 means not empty, and an integer n, return true if n new flowers can be
         * planted in the flowerbed without violating the no-adjacent-flowers rule and
         * false otherwise.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: flowerbed = [1,0,0,0,1], n = 1
         * Output: true
         * Example 2:
         * 
         * Input: flowerbed = [1,0,0,0,1], n = 2
         * Output: false
         * 
         * 
         * Constraints:
         * 
         * 1 <= flowerbed.length <= 2 * 104
         * flowerbed[i] is 0 or 1.
         * There are no two adjacent flowers in flowerbed.
         * 0 <= n <= flowerbed.length
         * 
         */

         Solution_can_place_flower ans = new Solution_can_place_flower();
         int[] flowerbed = {1,0,0,0,1};
         int n = 1;
         System.out.println(ans.canPlaceFlowers(flowerbed,n));


    }
}
