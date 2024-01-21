package Matrix_DSA_Problem;

public class MaximumNo_of_1sRow {
    public static void main(String[] args) {
        /*
         * Given a boolean 2D array, where each row is sorted. Find the row with the
         * maximum number of 1s.
         * 
         * Example 1:
         * 
         * Input:
         * N = 3, M = 4
         * Mat[] = {{0 1 1 1},
         * {0 0 1 1},
         * {0 0 1 1}}
         * Output: 0
         * Explanation: Row 0 has 3 ones whereas
         * rows 1 and 2 have just 2 ones.
         * 
         * Example 2:
         * 
         * Input:
         * N = 2, M = 2
         * Mat[] = {{0 1},
         * {1 1}}
         * Output: 1
         * Explanation: Row 1 has 2 ones whereas
         * row 0 has just a single one.
         * 
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function maxOnes () which takes a 2D array Mat[][] and its dimensions N and M
         * as inputs and returns the row index with the maximum number of 1s (0-based
         * index). If there are multiple rows with the maximum number of ones, then
         * return the row with the smaller index.
         * 
         * 
         * Expected Time Complexity: O(NLogM).
         * Expected Auxiliary Space: O(1).
         * 
         * 
         */

         class Sol
{
    public static int maxOnes (int Mat[][], int N, int M)
    {
        // your code here
        int count=0;
        int index=0;
        int maxones=0;
        for(int i =0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(Mat[i][j]==1)
                {
                    count++;
                }
            }
            if(maxones<count)
            {
                maxones=count;
                index=i;
                
            }
            count=0;
            
        }
        return index;
    }
}
    }
}
