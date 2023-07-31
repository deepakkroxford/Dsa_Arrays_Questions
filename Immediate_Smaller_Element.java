// Given an integer array Arr of size N. For each element in the array, check whether the right adjacent element (on the next immediate position) of the array is smaller.
//  If next element is smaller, update the current index to that element. If not, then  -1.


public class Immediate_Smaller_Element {
    public static void main(String[] args) {
        int arr[]={5, 6, 2, 3, 1, 7};
        
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                arr[i]=arr[i+1];
            }
            else
            {
                arr[i]=-1;
            }
            
        }
        arr[arr.length-1]=-1;
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
    }
}
// Input:
// N = 5
// Arr[] = {4, 2, 1, 5, 3}
// Output:
// 2 1 -1 3 -1
// Explanation: Array elements are 4, 2, 1, 5
// 3. Next to 4 is 2 which is smaller, so we
// print 2. Next of 2 is 1 which is smaller,
// so we print 1. Next of 1 is 5 which is
// greater, so we print -1. Next of 5 is 3
// which is smaller, so we print 3.  Note
// that for last element, output is always 
// going to be -1 because there is no element
// on right.