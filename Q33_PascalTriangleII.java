import java.util.ArrayList;
import java.util.List;

public class Q33_PascalTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> creationPascal = new ArrayList<>();
        List<Integer> firstrow = new ArrayList<>();
        firstrow.add(1);
        if (rowIndex == 0) {
            return firstrow;
        }
        creationPascal.add(firstrow);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> previousRow = creationPascal.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                row.add(sum);
            }
            row.add(1);
            creationPascal.add(row);
        }
        List<Integer> sol = creationPascal.get(rowIndex);
        return sol;
    }

    public static void main(String[] args) {
        /*
         * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the
         * Pascal's triangle.
         * 
         * In Pascal's triangle, each number is the sum of the two numbers directly
         * above it as shown:
         * https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.
         * gif
         * 
         * 
         * Example 1:
         * Input: rowIndex = 3
         * Output: [1,3,3,1]
         * Example 2:
         * 
         * Input: rowIndex = 0
         * Output: [1]
         * Example 3:
         * 
         * Input: rowIndex = 1
         * Output: [1,1]
         * 
         */

        Q33_PascalTriangleII pascal = new Q33_PascalTriangleII();

        int rowIndex = 10; // Change this value to test with different row indexes
        List<Integer> result = pascal.getRow(rowIndex);

        System.out.println("Row " + rowIndex + " of Pascal's Triangle: " + result);

    }
}
