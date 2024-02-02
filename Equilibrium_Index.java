public class Equilibrium_Index {
    public static void main(String[] args) {
        /*
         * Problem statement
         * You are given an array Arr consisting of N integers. You need to find the
         * equilibrium index of the array.
         * An index is considered as an equilibrium index if the sum of elements of the
         * array to the left of that index is equal to the sum of elements to the right
         * of it.
         * Note:
         * 1. The array follows 0-based indexing, so you need to return the 0-based
         * index of the element.
         * 2. Note that the element at the equilibrium index won’t be considered for
         * either left sum or right sum.
         * 3. If there are multiple indices which satisfy the given condition, then
         * return the left-most index i.e if there are indices i,j,k…. which are
         * equilibrium indices, return the minimum among them
         * 4. If no such index is present in the array, return -1.
         * 
         * Sample Input 1:
         * 1
         * 6
         * 1 7 3 6 5 6
         * Sample Output 1:
         * 3
         * Explanation for Sample Input 1:
         * The sum of elements to the left of arr[3] = 1 + 7 + 3 = 11.
         * The sum of elements to the right of arr[3] = 5 + 6 = 11.
         * Hence the answer is 3.
         * Sample Input 2:
         * 2
         * 6
         * 1 2 2 9 3 2
         * 4
         * 1 2 3 4
         * Sample Output 2:
         * 3
         * -1
         * Explanation for Sample Input 2:
         * In the first test case of sample input 2, the sum of elements on the left of
         * index 3 (arr[3] = 9) is five which is equal to the sum of elements on the
         * right of arr[3].
         * For the second test case, since no such index exists, we print -1.
         * 
         * 
         */

         //solution
         
 class s {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here

		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum +arr[i];
		}
		int l =0;
		int r=sum;
		for(int i =0;i<arr.length;i++)
		{
			r= r-arr[i];
			if(l==r)
			{
				return i;
			}
			l=l+arr[i];
		}
		return -1;
	}
}

    }
}
