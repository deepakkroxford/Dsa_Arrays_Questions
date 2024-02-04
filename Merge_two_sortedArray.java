public class Merge_two_sortedArray {
    public static void main(String[] args) {
        /*
         * Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing
         * order. Merge them in sorted order without using any extra space. Modify arr1
         * so that it contains the first N elements and modify arr2 so that it contains
         * the last M elements.
         * 
         * Example 1:
         * 
         * Input:
         * n = 4, arr1[] = [1 3 5 7]
         * m = 5, arr2[] = [0 2 6 8 9]
         * Output:
         * arr1[] = [0 1 2 3]
         * arr2[] = [5 6 7 8 9]
         * Explanation:
         * After merging the two
         * non-decreasing arrays, we get,
         * 0 1 2 3 5 6 7 8 9.
         * Example 2:
         * 
         * Input:
         * n = 2, arr1[] = [10 12]
         * m = 3, arr2[] = [5 18 20]
         * Output:
         * arr1[] = [5 10]
         * arr2[] = [12 18 20]
         * Explanation:
         * After merging two sorted arrays
         * we get 5 10 12 18 20.
         * 
         */

         int arr1 [] ={1,3, 5, 7};
         int n = arr1.length;

         int arr2[]={0 ,2, 6, 8, 9};
         int m =arr2.length;

         int arr[]=new int[n+m];
         
        int left=0,right=0;
        int index =0;
         while (left<n && right<m) {
            if(arr1[left]<=arr2[right])
            {
                arr[index]=arr1[left];
                left++;
                index++;
            }
            else{
                arr[index]=arr2[right];
                right++;
                index++;
            }
         }

         while (left<n) {
            arr[index]=arr1[left];
            left++;index++;

         }
         while (right<m) {
            arr[index]=arr2[right];
            right++;index++; 
         }

         for(int i=0;i<m+n;i++)
         {
            if(i<n)
            {
                arr1[i]=arr[i];
            }
            else{
                arr2[i-n]=arr[i];
            }
         }
        //this is for printing the array
         for(int x=0;x<n;x++)
         {
            System.out.println(arr1[x]);
         }


         for(int x=0;x<m;x++)
         {
            System.out.println(arr2[x]);
         }
       
    }
}
