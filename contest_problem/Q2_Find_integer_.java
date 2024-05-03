package contest_problem;
 class findinteger {
	public static int findInteger(int n, int k) {
		// Write your code here
	// 	int arr[] = new int [n];
        
	// 	int i=0;
	// 	for(int x=1;x<=n;x++)
	// 	{
	// 		if(x%2!=0)
	// 		{
	// 			arr[i]=x;
	// 			i++;
	// 		}
	// 	}
	// 	for(int x=2;x<=n;x++)
	// 	{
	// 		if(x%2==0)
	// 		{
	// 			arr[i]=x;
	// 			i++;
	// 		}
	// 	}

	//    int ans = arr[k-1];
	//    return ans;
			int index;
			if(k<=(n+1)/2)
			{
				index= 2*k-1;
			}
			else{
				index= (k-(n+1)/2)*2;
			}
			return index;



	}

}
public class Q2_Find_integer_ {
    public static void main(String[] args) {
        /*
            coding ninja
         * Problem statement
         * You are given two integers, ‘N’ and ‘K’. Assume numbers from 1 to ‘N’ are
         * arranged such that all odd numbers (in ascending order) are present first and
         * then come to all even numbers (also in ascending order).
         * You need to find the integer at position ‘K’ (numbering of positions starts
         * from 1).
         * For example:
         * You are given ‘N’ as 7 and ‘K’ as 4. Numbers from 1 to 7 are arranged as [1,
         * 3, 5, 7, 2, 4, 6], and the number at position 4 is 7. So, the answer is 7.
         * Detailed explanation ( Input/output format, Notes, Images )
         * Constraints:
         * 1 <= T <= 10
         * 1 <= N <= 10^12
         * 1 <= K <= N
         * 
         * Time Limit: 1 sec
         * Sample Input 1:
         * 2
         * 7 4
         * 5 3
         * Sample Output 1:
         * 7
         * 5
         * Explanation:
         * For the first test case, the numbers from 1 to 7 are arranged as [1, 3, 5, 7,
         * 2, 4, 6], and the number at position 4 is 7. Hence the answer is 7.
         * 
         * For the second test case, the numbers from 1 to 5 are arranged as [1, 3, 5,
         * 2, 4], and the number at position 3 is 5. Hence the answer is 5.
         * Sample Input 2:
         * 2
         * 6 2
         * 7 3
         * Sample Output 2:
         * 3
         * 5
         */
        findinteger ans = new findinteger();
         int n =7;
         int k=4;
         System.out.println(ans.findInteger(n, k));
    }
}
