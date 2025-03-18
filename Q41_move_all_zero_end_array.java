//question:
/*
 * Given an array arr[] of n positive integers. 
 * Push all the zeros of the given array to the right end of the array 
 * while maintaining the order of non-zero elements.
 *  Do the mentioned change in the array in-place.
 */

import java.util.Scanner;

public class Q41_move_all_zero_end_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of an array ");
        int n = sc.nextInt();

        System.out.println("enter the array element");
        int arr[] = new int[n];

        for(int x =0;x<n;x++)
        {
            arr[x]=sc.nextInt();
        }
        
        // int j=0;
        // int i =0;
        // while(j<n)
        // {
        //     if(arr[i]!=0)
        //     {
        //     int temp = arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //     j++;
        //     }
        //     i++;
        // }
        int j=0;
        for (int i = 0; i < arr.length; i++) 
        {
            
                if(arr[i]!=0)
                {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
            }
    

        System.out.println("the output of an array is ");
        for (int x = 0; x < n; x++)
        {
            System.out.println(arr[x]);
        }
        sc.close();
    }
}
