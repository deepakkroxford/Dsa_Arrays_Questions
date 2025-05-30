package Matrix_DSA_Problem;
/**
 * rotate_by_90_degree
 */
public class Q5_rotate_by_90_degree {

    // But this approach is not efficient because we are extra space and time complexity is O(n^2)
    public static void rotateI(int matrix[][]) {
        int n = matrix.length;
        int[][] res = new int[n][n];

        // We are rotating directly and copying it into the new res matrix;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - 1 - i] = matrix[i][j];
            }
        }

        // then we copy back into the original matrix.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = res[i][j];
            }
            System.out.println();
        }

        // Printing the result
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

        // finding the transpose of the matrix. so mening of the transpose is we are changing the row in to the column
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Traversing each row and reverse them to get the desire result.
        for (int[] value : matrix) {
            reverse(value);
        }

        // Printing the result x
        System.out.println("After rotation of the matrix by 90 degree");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
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

        System.out.println("Before rotation of the matrix");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        // rotateI(matrix);
        System.out.println();
        rotateII(matrix);


        /*
         * for rotating the 90 degree of the matrix i have to first find the transpose of the matrix
         * then i have to reverse each row then we get 90 degree rotation.
         */

    }
}