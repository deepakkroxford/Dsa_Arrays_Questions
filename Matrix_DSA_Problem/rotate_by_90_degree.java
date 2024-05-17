package Matrix_DSA_Problem;

/**
 * rotate_by_90_degree
 */
public class rotate_by_90_degree {

    public static void main(String[] args) {

        /*
         * Given a square matrix[][] of size N x N. The task is to rotate it by 90
         * degrees in an anti-clockwise direction without using any extra space.
         * 
         * Example 1:
         * 
         * Input:
         * N = 3
         * matrix[][] = 
         * [[1 2 3],
         * [4 5 6],
         * [7 8 9]]
         * Output:
         * 3 6 9
         * 2 5 8
         * 1 4 7
         * 
         */
        // Code Here
        class GFG {
            static void rotate(int matrix[][]) {
                // Code Here
                int N = matrix.length;
                // Transpose - The row become column and vice-versa
                for (int i = 0; i < N; i++) {
                    for (int j = i; j < N; j++) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }
                int top = 0, bottom = N - 1;
                // Swap rows from top to bottom
                while (top < bottom) {
                    int[] temp = matrix[top];
                    matrix[top] = matrix[bottom];
                    matrix[bottom] = temp;
                    top++;
                    bottom--;
                }
            }
        }
    }
}