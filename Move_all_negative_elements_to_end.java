import java.util.ArrayList;
import java.util.*;

public class Move_all_negative_elements_to_end {
    public static void main(String[] args) {
        /*
         * Given an unsorted array arr[] of size N having both negative and positive
         * integers. The task is place all negative element at the end of array without
         * changing the order of positive element and negative element.
         * 
         * Input :
         * N = 8
         * arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
         * Output :
         * 1 3 2 11 6 -1 -7 -5
         */

        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans.add(arr[i]);
            }
        }
        System.out.println("according to the question the actual output be");
        System.out.println(ans);
        System.out.println();


        //two pointer approach but order is not maintained

        int left=0;
        int right= arr.length-1;
        while(left<right)
        {
            while(arr[left]>0)
            {
                left++;
            }
            while(arr[right]<0)
            {
                right--;
            }
            if(left>=right)break;

            int temp =arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

        }
       System.out.println("we can do like this also but not in order according to the question");
       System.out.println(Arrays.toString(arr));

       
       
    }
}
