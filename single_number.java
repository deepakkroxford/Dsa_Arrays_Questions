public class single_number {
    public static void main(String[] args) {
        //xor operation 
        /*
         * Single Number
         * 
         * Given an array Arr of positive integers of size N where every element appears
         * even times except for one. Find that number occuring odd number of times.
         * 
         * Example 1:
         * 
         * Input:
         * N = 5
         * Arr[] = {1, 1, 2, 2, 2}
         * Output: 2
         * Explanation: In the given array all
         * element appear two times except 2
         * which appears thrice.
         * Example 2:
         * 
         * Input:
         * N = 7
         * Arr[] = {8, 8, 7, 7, 6, 6, 1}
         * Output: 1
         * Explanation: In the given array all
         * element appear two times except 1
         * which appears once.
         * 
         */
         
         //approach is xor operation 
         /*
          * time complexicty = O(n)
          * space complexicty = O(1); 
          */
         int arr[] ={4,1,2,1,2};
         int xor=0;
         for(int i =0;i<arr.length;i++)
         {
            xor = xor ^ arr[i];
         }

         System.out.println("the single number present in arry is " + xor);

    }
}
