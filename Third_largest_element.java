// Given an array of distinct elements. Find the third largest element in it.
// Suppose you have A[] = {1, 2, 3, 4, 5, 6, 7}, 
// its output will be 5 because it is the 3 largest element in the array A.

import java.util.Arrays;
public class Third_largest_element {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        int n = arr.length;
      Arrays.sort(arr);
      if(n<3)
      {
       System.out.println("not valid ");
      }
     System.out.println("the third largest element of an array is "+arr[arr.length-3]);
    }
}

//  geeks for Geeks solution

// class Solution
// {
//     int thirdLargest(int a[], int n)
//     {
// 	    // Your code here
// 	   Arrays.sort(a);
// 	    if(n<3)
// 	    {
// 	       return -1;
// 	    }
// 	  return a[n-3];
	   
	    
//     }
// }

