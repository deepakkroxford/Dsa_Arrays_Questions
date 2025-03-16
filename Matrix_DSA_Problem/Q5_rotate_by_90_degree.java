package Matrix_DSA_Problem;
/**
 * rotate_by_90_degree
 */
public class Q5_rotate_by_90_degree {
    public static void rotateI(int matrix[][]) {
        int n = matrix.length;
        int res[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = res[i][j];
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }

    public static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotateII(int matrix[][]) {
        int n = matrix.length;

        // finding the transpose of the matrix 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Traversing each row and reverse them to get the desire result.
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
        // Printing the result 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

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

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // rotateI(matrix);
        System.out.println();
        rotateII(matrix);

    }
}