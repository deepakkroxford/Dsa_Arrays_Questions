package BinarySearch;

public class Q0BinarySearch {
    public static void main(String[] args) {
        /*
         * Binary Search is defined as a searching algorithm used in a sorted array by
         * repeatedly dividing the search interval in half. The idea of binary search is
         * to use the information that the array is sorted and reduce the time
         * complexity to O(log N).
         * 
         * In this algorithm,
         * 
         * Divide the search space into two halves by finding the middle index “mid”.
         * Compare the middle element of the search space with the key.
         * If the key is found at middle element, the process is terminated.
         * If the key is not found at middle element, choose which half will be used as
         * the next search space.
         * If the key is smaller than the middle element, then the left side is used for
         * next search.
         * If the key is larger than the middle element, then the right side is used for
         * next search.
         * This process is continued until the key is found or the total search space is
         * exhausted.
         * 
         */
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int low = 0;
        int high = arr.length - 1;
        int key = 23;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("the element is found--> " + mid);
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

    }
}
