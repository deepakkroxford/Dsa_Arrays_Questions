public class Even_odd_sum {
    public static void main(String[] args) {
        /*
         * Given an array Arr[] of N integers.Find the sum of values of even and odd
         * index positions separately.
         * 
         * Example 1:
         * 
         * Input:
         * N=5
         * Arr={1,2,3,4,5}
         * Output:
         * 9 6
         * Explanation:
         * The sum of elements at odd places i.e
         * at 1st,3rd and 5th places are (1+3+5=9)
         * Similarly,the sum of elements at even
         * places i.e. at 2nd and 4th places are
         * (2+4=6).
         * Example 2:
         * 
         * Input:
         * N=5
         * Arr={1,1,1,1,1}
         * Output:
         * 3 2
         * Explanation:
         * The sum of elements at odd places
         * is (1+1+1=3).Similarly, the sum of
         * elements at even places is (1+1=2)
         * 
         */
        int Arr[] = { 1, 1, 1, 1, 1 };
        int evensum = 0;
        int oddsum = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (i % 2 == 0) {
                evensum = evensum + Arr[i];
            } else {
                oddsum = oddsum + Arr[i];
            }
        }
        System.out.println("evensum is "+evensum);
        System.out.println("oddsum is "+oddsum);
    }
}
