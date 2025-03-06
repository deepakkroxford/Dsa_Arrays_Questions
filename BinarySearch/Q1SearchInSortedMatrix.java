package BinarySearch;

public class Q1SearchInSortedMatrix {

    public static boolean binarySearch(int arr[],int x)
    {
        int low=0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==x)
            {
                return true;
            }
            else if(arr[mid]<x) {
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        //Time complexity is O(m)×O(logn)=O(mlogn)
        for(int i=0;i<mat.length;i++)
        {
            // it means the value x lies between these;
           if(mat[i][0]<=x && x<=mat[i][mat[0].length-1])
           {
             
             if(binarySearch(mat[i],x)){;
                 return true;
              }
           }
          
        }
        return false;
        
    }


    public static int[] search(int[][] matrix, int target) {
        /*
         * Time complexity is O(n+m)
         */
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        /*
         * Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find
         * whether the number x is present in the matrix or not.
         * Note: In a strictly sorted matrix, each row is sorted in strictly increasing
         * order, and the first element of the ith row (i!=0) is greater than the last
         * element of the (i-1)th row.
         * 
         * Examples:
         * 
         * Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
         * Output: true
         * Explanation: 14 is present in the matrix, so output is true.
         * Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
         * Output: false
         * Explanation: 42 is not present in the matrix.
         * Input: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
         * Output: true
         * Explanation: 101 is present in the matrix.
         * Constraints:
         * 1 <= n, m <= 1000
         * 1 <= mat[i][j] <= 109
         * 1 <= x <= 109
         */
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int target = 29;
        int[] ans = search(matrix, target);
        System.out.println("Row: " + ans[0] + " Column: " + ans[1]);
    }
}
