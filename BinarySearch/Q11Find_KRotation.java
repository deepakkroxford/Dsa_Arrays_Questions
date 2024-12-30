package BinarySearch;

public class Q11Find_KRotation {

     public int findKRotation(int [] arr) {
        // Code here

        /*
         * this question is similar to the find the minimum in the sorted rotated array 
         * so if we able to find the minimum in the sorted rotaed array so we can easily find how many time the 
         * sorted roated array is rotated. just we have to retun the index of the minimum value 
         */
        int low =0;
        int high = arr.length-1;
        while(low<=high)
        {

            int mid = low +(high-low)/2;
            if(arr[mid]>arr[high])
            {
                low = mid+1;
            }
            else{
                high = mid-1;   
            }
        }
        return low;
    }
    public static void main(String[] args) {
        /*
         * Given an increasing sorted rotated array arr of distinct integers. The array
         * is right-rotated k times. Find the value of k.
         * Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2
         * times so that it will look like this:
         * After 1st Rotation : [9, 2, 4, 6]
         * After 2nd Rotation : [6, 9, 2, 4]
         * 
         * Examples:
         * 
         * Input: arr = [5, 1, 2, 3, 4]
         * Output: 1
         * Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3
         * 4 5. We can see that the array was rotated 1 times to the right.
         * Input: arr = [1, 2, 3, 4, 5]
         * Output: 0
         * Explanation: The given array is not rotated.
         * Expected Time Complexity: O(log(n))
         * Expected Auxiliary Space: O(1)
         */

         int arr[] = {1, 2, 3, 4, 5};
         Q11Find_KRotation obj = new Q11Find_KRotation();
         System.out.println(obj.findKRotation(arr));
    }
}
