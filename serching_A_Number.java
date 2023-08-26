public class serching_A_Number {
    public static void main(String[] args) {
        /*
         * Given an array Arr of N elements and a integer K. Your task is to return the
         * position of first occurence of K in the given array.
         * Note: Position of first element is considered as 1.
         * Input:
         * N = 5, K = 16
         * Arr[] = {9, 7, 2, 16, 4}
         * Output: 4
         * Explanation: K = 16 is found in the
         * given array at position 4.
         * 
         */

         int arr[]={9, 7, 2, 16, 4};
         int k = 16;
         for(int i =0;i<arr.length;i++)
         { 
            
            if(arr[i]==k)
            {
                System.out.println("the element found at position");
                System.out.println(i+1);
            }
            
         }
         

        }
}