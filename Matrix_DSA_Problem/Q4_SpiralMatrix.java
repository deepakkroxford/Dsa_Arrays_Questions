package Matrix_DSA_Problem;

import java.util.ArrayList;
import java.util.List;

public class Q4_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        /*
         * There is one way to solve the problem and that is optimal way
         * to solve this so lets see how we can solve this problem
         * 
         * 1. we use the four pointers to solve this problem and name are -> top ,
         * bottom , left , right
         * 2. Initially top =0 , buttom = matrix.length-1 , left = 0 , right =
         * matrix[0].length-1
         * 3. first iterration -> left -> right
         * 4. second iteration -> top -> bottom
         * 5. third iteration -> right -> left
         * 6. fourth iteration -> bottom -> top
         * 7. we have to do this four step till the top<=buttom && left<=right
         * 
         * so lets solve this problem
         */
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            // top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Q4_SpiralMatrix spiralMatrix = new Q4_SpiralMatrix();
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        System.out.println(result); // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
