package BinarySearch;

public class Q13BookAllocationProblem {
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

     public static int findPagesAnotherApporach(int[] arr, int k) {
        int low = 0,high=0,ans=-1;

        // it means that if the number of students is greater than the number of the books so we have to return the -1;
        if(k>arr.length) {
            return ans;
        }
        for(int i=0;i<arr.length;i++) {
            high+=arr[i]; // and setting the highest value we can assing to one student so the sum of all pages.
            low = Math.max(low, arr[i]); // we are setting the low value  to the maximum number of pages in the book
        }

        while(low<=high)
        {
            int mid = low +(high-low)/2;
            int page =0, count =1;
            for(int i=0;i<arr.length;i++)
            {
                page += arr[i];
                // if the page value is greater than the maximum value we can assing to one student then we have to assign the book to the next student
                if(page+arr[i]>mid)
                {
                    count++; // we are increasing the number of students
                    page = arr[i]; // and setting the page value to the current book value
                }
            }
            if(count<=k) // if the number of students is less than or equal to the given number of students
            {
                ans = mid; // then we are setting the ans to the mid value
                high = mid-1; // and we are decreasing the high value to further minimize the ans
            }
            else{
                low = mid+1; // if the number of students is greater than the given number of students then we have to increase the low value to increase the ans to further minimize the ans.
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
