import java.util.Arrays;
import java.util.HashMap;

public class Count_More_than {
    public static void main(String[] args) {
        /*
         * problem
         * Given an array arr of size N and an element k.
         * The task is to find the count of elements in the array
         * that appear more than n/k times.
         * 
         * 
         * Example 1:
         * 
         * Input:
         * N = 8
         * arr = [3,1,2,2,1,2,3,3]
         * k = 4
         * Output:
         * 2
         * Explanation:
         * In the given array, 3 and 2 are the only elements that appears more than n/k
         * times.
         * Example 2:
         * 
         * Input:
         * N = 4
         * arr = [2,3,3,2]
         * k = 3
         * Output:
         * 2
         * Explanation: In the given array, 3 and 2 are the only elements that appears
         * more than n/k times. So the count of elements are 2.
         */

        // class Solution {
        //     // Function to find all elements in array that appear more than n/k times.
        //     public int countOccurence(int[] arr, int n, int k) {
        //         // your code here,return the answer
        //         Arrays.sort(arr);
        //         int occ = n / k;

        //         int times = 0;
        //         for (int i = 0; i < n; i++) {
        //             int count = 1;
        //             while (i < n - 1 && arr[i] == arr[i + 1]) {
        //                 count++;
        //                 i++;
        //             }

        //             if (count > occ) {
        //                 times++;
        //             }
        //         }
        //         return times;

        //     }
        // }


        HashMap <Integer,Integer> map = new HashMap<>();
        int arr[]={3,1,2,2,1,2,3,3};
        int n =arr.length;
        int k =3;
        int counter=0;

        for(int i =0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i], 1);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        
        //entrySet is used to print all key with values 
        //System.out.println(map.entrySet());

        for(int e:map.keySet())
        {
            if(map.get(e)>n/k)
            {
                System.out.println(e);
                counter++;
            }
        }
        System.out.println(counter);


    }
}
