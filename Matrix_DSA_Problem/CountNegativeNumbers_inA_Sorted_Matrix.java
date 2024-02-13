
/**
 * InnerCountNegativeNumbers_inA_Sorted_Matrix
 */
class Solution{
      public  int countNegatives(int grid[][])
      {
        int count=0;
    for(int i = 0; i < grid.length; i++)
      {
        for(int j = 0; j < grid[i].length; j++)
          {
            if(grid[i][j]<0)
            {
              count++;
            }
          }
      }
      return count;

      }
    
}
public class CountNegativeNumbers_inA_Sorted_Matrix {
    public static void main(String[] args) {
        Solution ans = new Solution();

        int [][] grid = { { 1, 2 }, { -5,-5,-5 } };
        System.out.println(ans.countNegatives(grid));
    }
}
