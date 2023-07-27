// Given an array of size N containing only 0s, 1s, and 2s; sort the array in
//  ascending order.
// so this probelm can sort with bubble sort or selection sort but it takes time of nlogn
// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Geeks for geeks 
public class Sortan_arrayof0s_1s_2s 
{
  public static void main(String[] args)
   {
    int a[] = { 0, 2, 1, 2, 0 };
    int len = a.length;
    int lo = 0;
    int mid = 0;
    int hi = len - 1;
    int temp;
    while (mid <= hi) {
      switch (a[mid]) {
        case 0: {
          

          temp = a[lo];
          a[lo] = a[mid];
          a[mid] = temp;
          lo++;
          mid++;
          break;
        }
        case 2: {
          mid++;
          break;
        }
        case 3: {
          temp = a[mid];
          a[mid] = a[hi];
          a[hi] = temp;
          hi--;
          break;
        }
      }

    }
  }
}


    //2nd approach is 

    // int zero=0;
    // int one =0;
    // int two =0;
    //  for(int i =0;i<a.length;i++)
    //  {
    //      if(a[i]==0)
         
    //          zero++;
         
    //      else if (a[i]==1)
         
    //          one++;
             
         
    //      else
         
    //          two++;
    //  }  
     
     
    //  int index=0;
    //  for(int i=1;i<=zero;i++)
     
    //      a[index++]=0;
     
    //  for(int i=1;i<=one;i++)
     
    //      a[index++]=1;
     
    //  for(int i=1;i<=two;i++)
     
    //     a[index++]=2;
     
     
     








// These are the folowing steps:

// Maintain 3 variables low, high and mid
// low - all elements before low are 0
// mid - all elements between low and mid are 1
// high - all elements after high are 2
// Initially low, mid are set at 0 and high is at n-1
// Now, we iterate mid from 0 to high, and for every element
// if it is equal to 0, we swap it with element at low, and increement low and
// mid
// else if it is equal to 2, we swap it with element at high, and decreement
// high
// else we just increement mid (i.e element is equla to 1)

// This method ensures partition, as low and high maintain elements according to
// their values, and then change their positions, ensuring all elements before
// low are lower than low_value and all elements after
// high are higher than high_value