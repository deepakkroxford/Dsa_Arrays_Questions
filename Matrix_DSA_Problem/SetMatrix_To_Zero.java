package Matrix_DSA_Problem;

public class SetMatrix_To_Zero {
    public void setZeroes(int[][] matrix) {
        // step 1 :- I will mark the matrix as zero if there is any zero present in the
        // Check if the first row and first column need to be zero
        // firstrow and firstcol

        boolean firstrow = false;
        boolean firstcol = false;

        /*
         * checking seperatly
         * i-> represent the columns
         * for (int i = 0; i < matrix.length;i++){
         * if(matrix[i][0]==0)
         * {
         * firstcol=true;
         * }
         * }
         * 
         * j->represent the rows
         * for (int j = 0; j < matrix[0].length;j++){
         * if(matrix[0][j]==0)
         * {
         * firstrow=true;
         * }
         * }
         * 
         */

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {

                    // checking the first column and row we can do this seperatly
                    if (i == 0) {
                        firstrow = true;
                    }
                    if (j == 0) {
                        firstcol = true;
                    }

                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // step 2: traversing the inner of the matrix

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // step 3 : if the firstrow is true we make all the rows value to zero

        if (firstrow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if (firstcol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public void setZeroesExtraSpace(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (row[i] == true) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (col[j] == true) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the class
        SetMatrix_To_Zero obj = new SetMatrix_To_Zero();

        // Input matrix
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };

        // Print the matrix before modification
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Apply the setZeroes function
        obj.setZeroes(matrix);

        // Print the matrix after modification
        System.out.println("Matrix After Setting Zeros:");
        printMatrix(matrix);
    }

    // Utility method to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
