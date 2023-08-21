public class Perfect_Arrays {
    public static void main(String[] args) {
        /*
         * Given an array of size N and you have to tell whether the array is perfect or
         * not. An array is said to be perfect if its reverse array matches the original
         * array. If the array is perfect then return True else return False.
         */
        /*
         * Input : Arr[] = {1, 2, 3, 2, 1}
         * Output : PERFECT
         * Explanation:
         * Here we can see we have [1, 2, 3, 2, 1]
         * if we reverse it we can find [1, 2, 3, 2, 1]
         * which is the same as before.
         * So, the answer is PERFECT.
         */

        int arr[] = { 1, 2, 3, 2, 1};
        int n = arr.length;
        // int j = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                System.out.println("not perfect");
            } else {
                System.out.println("perfect");
            }
        }
    }

}
