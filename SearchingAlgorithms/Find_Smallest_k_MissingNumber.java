package SearchingAlgorithms;

public class Find_Smallest_k_MissingNumber {
    public int kthMissing(int[] arr, int k) {
        // Time complexity is O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    public int kthMissingBinarySearch(int[] arr, int k) {
        // Time complexity is O(logn)
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low + k;
    }

    public static void main(String[] args) {

        // Test the function
        Find_Smallest_k_MissingNumber obj = new Find_Smallest_k_MissingNumber();
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println("the kth smalles missing number is :- " + obj.kthMissing(arr, k)); // Output: 9
        System.out.println("the kth smalles missing number is :- " + obj.kthMissingBinarySearch(arr, k)); 
    }
}
