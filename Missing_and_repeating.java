public class Missing_and_repeating {
    public static void main(String[] args) {

        /*
         * Given an unsorted array Arr of size N of positive integers. One number 'A'
         * from set {1, 2,....,N} is missing and one number 'B' occurs twice in array.
         * Find these two numbers.
         * 
         * Example 1:
         * 
         * Input:
         * N = 2
         * Arr[] = {2, 2}
         * Output: 2 1
         * Explanation: Repeating number is 2 and
         * smallest positive missing number is 1.
         * Example 2:
         * 
         * Input:
         * N = 3
         * Arr[] = {1, 3, 3}
         * Output: 3 2
         * Explanation: Repeating number is 3 and
         * smallest positive missing number is 2.
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function findTwoElement() which takes the array of integers arr and n as
         * parameters and returns an array of integers of size 2 denoting the answer (
         * The first index contains B and second index contains A.)
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(1)
         * 
         * Constraints:
         * 2 ≤ N ≤ 105
         * 1 ≤ Arr[i] ≤ N
         * 
         * //4, 3, 6, 2, 1,1
         */
        int arr[] = {2,2};
        int n = arr.length;

        int hash[] = new int[n + 1];
         //this hash array should be n+1 because we the size of n=5 so process the 5 in the hash arry we need to decalre n+1;
        int missing = -1;
        int repeating = -1;
        for(int i =0;i<n;i++)
        {
            int num = arr[i];
            hash[num]++;
        }

        for(int i =1;i<128;i++)
        {
            if(hash[i]==2)
            {
                repeating=i;
            }
            if(hash[i]==0)
            {
                missing = i;

            }

            if(missing!=-1 && repeating!=-1)
            {
                break;
            }
        }

    System.out.println("the missing number is "+missing+" the repeating number is "+repeating);

        
       

    }
}
