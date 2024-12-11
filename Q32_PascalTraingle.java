import java.util.ArrayList;
import java.util.List;

public class Q32_PascalTraingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> fistrow = new ArrayList<Integer>();
        /*
         * Base conditions
         */
        if (numRows == 0) {
            return result;
        }
        fistrow.add(1);
        result.add(fistrow);

        if(numRows==1)
        {
            return result;
        }
        for(int i=1;i<numRows;i++){
           List <Integer> previous = result.get(i-1);
           /*
            * this help us to fill the value at first and at the last of the row
            */
           List <Integer> row = new ArrayList<>();
            row.add(1);
           for(int j=1;j<previous.size();j++)
           {
             int sum = previous.get(j-1)+previous.get(j);
             row.add(sum);
           }
           row.add(1);
           result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        /*
            Leetcode - 118  https://leetcode.com/problems/pascals-triangle/description/
         * Given an integer numRows, return the first numRows of Pascal's triangle.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: numRows = 5
         * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
         * Example 2:
         * 
         * Input: numRows = 1
         * Output: [[1]]
         * 
         */

         Q32_PascalTraingle pascalTriangle = new Q32_PascalTraingle();
         List<List<Integer>> result = pascalTriangle.generate(6);
         System.out.println(result);
         result = pascalTriangle.generate(1);
         System.out.println(result);

    }
}

