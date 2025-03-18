package Matrix_DSA_Problem;

public class Q8_SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        /**
         * This question is Similar to the Matrix1 question . for solving this question
         * we have to know about
         * how to traverse in the spiral form.
         * All the concept are same just we have to fill the number in the spiral matrix
         * form and return the 2d array.
         */

        int matrix[][] = new int[n][n];
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        int counter = 1;
        while (left <= right && top <= bottom) {
            // step 1:- left to right and when we move left to right the top pointer remains
            // constant

            for (int i = left; i <= right; i++) {
                matrix[top][i] = counter++;
            }
            top++;

            // step 2: top to bottom and when we move top to bottom the right pointer remain
            // constant

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = counter++;
            }
            right--;

            // step 3: right to left and when we move right to left bottom remain constant

            if(top<=bottom){
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = counter++;
            }
            bottom--;
        }

            // step 4 : bottom to top when we move bottom to top the left pointer remain
            // constant

            if(left<=right){
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = counter++;
            }
            left++;
          }
          
        }
        return matrix;

    }

    public static void main(String[] args) {
        /*
         * Leetcode :- 59 https://leetcode.com/problems/spiral-matrix-ii/description/
         * Given a positive integer n, generate an n x n matrix filled with elements
         * from 1 to n2 in spiral order.
         * Example 1:
         * 
         * 
         * Input: n = 3
         * Output: [[1,2,3],[8,9,4],[7,6,5]]
         * Example 2:
         * 
         * Input: n = 1
         * Output: [[1]]
         * 
         * 
         * Constraints:
         * 
         * 1 <= n <= 20
         */

        int n = 1;
        Q8_SpiralMatrix2 spiralMatrix = new Q8_SpiralMatrix2();
        int[][] result = spiralMatrix.generateMatrix(n);
        
        // Print the result matrix
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
