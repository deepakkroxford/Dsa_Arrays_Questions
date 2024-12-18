package SearchingAlgorithms;

public class BookAllocationProblem {
    public static boolean isValid(int[] arr, int k, int maxAllowedPage) {
        int stu = 1; // Start with one student
        int page = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxAllowedPage) {
                return false;
            }
            if (page + arr[i] <= maxAllowedPage) {
                page += arr[i];
            } else {
                stu++;
                page = arr[i];
            }
        }
        if (stu > k) {
            return false;
        }
        return true;
    }

    // Method to calculate the sum of all pages
    public static int findTotalPage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Main function to find the minimum number of pages
    public static int findPages(int[] arr, int k) {
        if (k > arr.length) {
            return -1; // Not enough books for each student
        }

        int low = 0;
        int high = findTotalPage(arr);
        int ans = -1;

        // Binary search for the minimum maximum pages
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(arr, k, mid)) {
                // Try to minimize the maxAllowedPage
                ans = mid;
                high = mid - 1;
            } else {
                // Increase maxAllowedPage
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /*
         * You are given an array arr[] of integers, where each element arr[i]
         * represents the number of pages in the ith book. You also have an integer k
         * representing the number of students. The task is to allocate books to each
         * student such that:
         * 
         * Each student receives atleast one book.
         * Each student is assigned a contiguous sequence of books.
         * No book is assigned to more than one student.
         * The objective is to minimize the maximum number of pages assigned to any
         * student. In other words, out of all possible allocations, find the
         * arrangement where the student who receives the most pages still has the
         * smallest possible maximum.
         * 
         * Note: Return -1 if a valid assignment is not possible, and allotment should
         * be in contiguous order (see the explanation for better understanding).
         * 
         * Examples:
         * 
         * Input: arr[] = [12, 34, 67, 90], k = 2
         * Output: 113
         * Explanation: Allocation can be done in following ways:
         * [12] and [34, 67, 90] Maximum Pages = 191
         * [12, 34] and [67, 90] Maximum Pages = 157
         * [12, 34, 67] and [90] Maximum Pages = 113.
         * Therefore, the minimum of these cases is 113, which is selected as the
         * output.
         * Input: arr[] = [15, 17, 20], k = 5
         * Output: -1
         * Explanation: Allocation can not be done.
         * Input: arr[] = [22, 23, 67], k = 1
         * Output: 112
         * Constraints:
         * 1 <= arr.size() <= 106
         * 1 <= arr[i] <= 103
         * 1 <= k <= 103
         */

         int arr[] = { 12, 34, 67, 90 };
         int k = 2;
         int pages = findPages(arr, k);
         System.out.println(pages); // Output: 113
    }
}
