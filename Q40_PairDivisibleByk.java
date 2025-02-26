public class Q40_PairDivisibleByk {
    public boolean canArrange(int[] arr, int k) {
        int freq[]= new int[k];
        for(int i=0;i<arr.length;i++)
        {
            int rem = arr[i]%k;
            if(rem<0)
            {
                rem +=k;// to make the remainder positive.
            }
            freq[rem]++;
        }

        // SO THE FREQUENCY OF 0 SHOULD BE EVEN BECAUSE WE HAVE TO MAKE THE PAIR IF IT IS ODD THEN WE CAN NOT MAKE THE PAIR;
        if(freq[0]%2!=0){
            return false;
        }
        // we have to start from index 1 because we have already checked the index 0
        for(int i=1;i<=k/2;i++){
            if(freq[i]!=freq[k-i])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * Leetcode 1497. Check If Array Pairs Are Divisible by k
         * https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/
         * description/?envType=daily-question&envId=2024-10-01
         * Given an array of integers arr of even length n and an integer k.
         * 
         * We want to divide the array into exactly n / 2 pairs such that the sum of
         * each pair is divisible by k.
         * 
         * Return true If you can find a way to do that or false otherwise.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
         * Output: true
         * Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).
         * Example 2:
         * 
         * Input: arr = [1,2,3,4,5,6], k = 7
         * Output: true
         * Explanation: Pairs are (1,6),(2,5) and(3,4).
         * Example 3:
         * 
         * Input: arr = [1,2,3,4,5,6], k = 10
         * Output: false
         * Explanation: You can try all possible pairs to see that there is no way to
         * divide arr into 3 pairs each with sum divisible by 10.
         */

        int arr[] = { 1, 2, 3, 4, 5, 10, 6, 7, 8, 9 };
        int k = 5;
        Q40_PairDivisibleByk obj = new Q40_PairDivisibleByk();
        System.out.println(obj.canArrange(arr, k));

    }
}
