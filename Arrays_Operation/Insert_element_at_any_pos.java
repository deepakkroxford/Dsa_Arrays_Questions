package Arrays_Operation;

import java.util.Scanner;

public class Insert_element_at_any_pos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the element you want to insert");
        int number = sc.nextInt();

        System.out.println("enter the position to be insert");

        int pos = sc.nextInt(); // pos = 3 means at index 2 we have to the element

        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];

        }
        arr[pos - 1] = number;

        System.out.println("element after inserted the value");
        for (int ele : arr) {
            System.out.println(ele);
        }

    }
}
