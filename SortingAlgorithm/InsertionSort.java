package SortingAlgorithm;

class insertionSorts {
    public void sorting(int arr[]) {

        for (int i = 1; i < arr.length; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {

                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

    public void print(int arr[]) {

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        /*
         * In the insertion sort we move the element from the unsorted part to sorted
         * part at their right place
         */

        int arr[] = { 12, 45, 23, 51, 19, 8 };

        insertionSorts obj = new insertionSorts();
        obj.sorting(arr);
        obj.print(arr);

        /*
         * The code you’ve provided is an implementation of the Insertion Sort
         * algorithm. Let’s break down each iteration to understand how the array [12,
         * 45, 23, 51, 19, 8] is sorted.
         * 
         * Initial Array:
         * 
         * arr = [12, 45, 23, 51, 19, 8]
         * 
         * Insertion Sort Process:
         * 
         * 1. Iteration 1 (i = 1):
         * • Key: key = arr[1] = 45
         * • j = 0:
         * • Compare key (45) with arr[0] (12):
         * • Since key (45) is not less than arr[0] (12), no movement occurs.
         * • Result after Iteration 1: [12, 45, 23, 51, 19, 8]
         * 
         * 
         * 
         * 
         * 2. Iteration 2 (i = 2):
         * • Key: key = arr[2] = 23
         * • j = 1:
         * • Compare key (23) with arr[1] (45):
         * • Since key (23) is less than arr[1] (45), move arr[1] to arr[2]: [12, 45,
         *      45, 51, 19, 8]
         * • j = 0:
         * • Compare key (23) with arr[0] (12):
         * • Since key (23) is not less than arr[0] (12), no further movement is needed.
         * • Insert key at arr[1]: [12, 23, 45, 51, 19, 8]
         * • Result after Iteration 2: [12, 23, 45, 51, 19, 8]
         * 
         * 
         * 3. Iteration 3 (i = 3):
         * • Key: key = arr[3] = 51
         * • j = 2:
         * • Compare key (51) with arr[2] (45):
         * • Since key (51) is not less than arr[2] (45), no movement occurs.
         * • Result after Iteration 3: [12, 23, 45, 51, 19, 8]
         * 
         * 
         * 4. Iteration 4 (i = 4):
         * • Key: key = arr[4] = 19
         * • j = 3:
         * • Compare key (19) with arr[3] (51):
         * • Since key (19) is less than arr[3] (51), move arr[3] to arr[4]: [12, 23,
         * 45, 51, 51, 8]
         * • j = 2:
         * • Compare key (19) with arr[2] (45):
         * • Since key (19) is less than arr[2] (45), move arr[2] to arr[3]: [12, 23,
         *    45, 45, 51, 8]
         * • j = 1:
         * • Compare key (19) with arr[1] (23):
         * • Since key (19) is less than arr[1] (23), move arr[1] to arr[2]: [12, 23,
         *     23, 45, 51, 8]
         * • j = 0:
         * • Compare key (19) with arr[0] (12):
         * • Since key (19) is not less than arr[0] (12), no further movement is needed.
         * • Insert key at arr[1]: [12, 19, 23, 45, 51, 8]
         * • Result after Iteration 4: [12, 19, 23, 45, 51, 8]
         * 
         * 
         * 5. Iteration 5 (i = 5):
         * • Key: key = arr[5] = 8
         * • j = 4:
         * • Compare key (8) with arr[4] (51):
         * • Since key (8) is less than arr[4] (51), move arr[4] to arr[5]: [12, 19, 23,
         * 45, 51, 51]
         * • j = 3:
         * • Compare key (8) with arr[3] (45):
         * • Since key (8) is less than arr[3] (45), move arr[3] to arr[4]: [12, 19, 23,
         * 45, 45, 51]
         * • j = 2:
         * • Compare key (8) with arr[2] (23):
         * • Since key (8) is less than arr[2] (23), move arr[2] to arr[3]: [12, 19, 23,
         * 23, 45, 51]
         * • j = 1:
         * • Compare key (8) with arr[1] (19):
         * • Since key (8) is less than arr[1] (19), move arr[1] to arr[2]: [12, 19, 19,
         * 23, 45, 51]
         * • j = 0:
         * • Compare key (8) with arr[0] (12):
         * • Since key (8) is less than arr[0] (12), move arr[0] to arr[1]: [12, 12, 19,
         * 23, 45, 51]
         * • Insert key at arr[0]: [8, 12, 19, 23, 45, 51]
         * • Result after Iteration 5: [8, 12, 19, 23, 45, 51]
         * 
         * Final Sorted Array:
         * 
         * [8, 12, 19, 23, 45, 51]
         * 
         */
    }
}
