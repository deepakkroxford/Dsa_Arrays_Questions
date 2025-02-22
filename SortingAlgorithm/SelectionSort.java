package SortingAlgorithm;

class Selection {
    public void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

}

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 23, 51, 19, 8 };

        /*
         * In the selection sort we move the minimum element at first
         * so we find the minimum value and then swap with i th index element
         */

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        // for (int i : arr) {
        //     System.out.println(i);
        // }


        Selection selection = new Selection();
        selection.selectionsort(arr);

    }
}
