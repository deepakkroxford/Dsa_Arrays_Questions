import java.util.Scanner;

public class Q8_Rotate_arrya_k_element {

    /*
     * Given an unsorted array arr[] of size N. Rotate the array to the left
     * (counter-clockwise direction) by D steps, where D is a positive integer.
     * 
     * Example 1:
     * 
     * Input:
     * N = 5, D = 2
     * arr[] = {1,2,3,4,5}
     * Output: 3 4 5 1 2
     * Explanation: 1 2 3 4 5 when rotated
     * by 2 elements, it becomes 3 4 5 1 2.
     * Example 2:
     * 
     * Input:
     * N = 10, D = 3
     * arr[] = {2,4,6,8,10,12,14,16,18,20}
     * Output: 8 10 12 14 16 18 20 2 4 6
     * Explanation: 2 4 6 8 10 12 14 16 18 20
     * when rotated by 3 elements, it becomes
     * 8 10 12 14 16 18 20 2 4 6.
     */
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        int dtimes = 17;
        dtimes = dtimes % n;
        int temp[] = new int[dtimes];
        for (int i = 0; i < dtimes; i++) {
            // so actuallly we store the array element that we have to rotate
            temp[i] = arr[i];
        }
        for (int i = dtimes; i < n; i++) {
            // this logic actuly shift the array
            arr[i - dtimes] = arr[i];
        }
        int j = 0;
        for (int i = n - dtimes; i < n; i++) {
            // this logic put the elemnt at the end to the array
            // and it provide the actual output
            arr[i] = temp[j];
            j++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
