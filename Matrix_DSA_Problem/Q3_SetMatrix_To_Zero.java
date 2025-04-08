package Matrix_DSA_Problem;

public class Q3_SetMatrix_To_Zero {
    public void setZeroes(int[][] matrix) {
        // step 1 :- In the first step i will check if matrix[i][j]==0 if true then i will check if i==0 and j==0  if any one 
        // is true then i will make it true if not then i will mark the matrix using matrix[i][0]=0 and matrix[0][j];

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

        /*
         * What It Does:
         * The loop iterates over the entire matrix and identifies cells containing 0.
         * When it finds a zero at mat[i][j], it:
         * 
         * Sets flags:
         * If the zero is in the first row, firstrow = true.
         * If the zero is in the first column, firstcol = true.
         * Marks the corresponding row and column:
         * Sets mat[i][0] = 0 to mark the entire row for zeroing later.
         * Sets mat[0][j] = 0 to mark the entire column for zeroing later.
         * Example Walkthrough
         * Input:
         * 
         * mat =
         * [
         * [1, 2, 3],
         * [4, 0, 6],
         * [7, 8, 9]
         * ]
         * Iteration 1: i = 0, j = 0 to 2 (first row)
         * 
         * mat[0][0] = 1 → No action.
         * mat[0][1] = 2 → No action.
         * mat[0][2] = 3 → No action.
         * Flags: firstrow = false, firstcol = false
         * Matrix remains unchanged:
         * 
         * [
         * [1, 2, 3],
         * [4, 0, 6],
         * [7, 8, 9]
         * ]
         * Iteration 2: i = 1, j = 0 to 2 (second row)
         * 
         * mat[1][0] = 4 → No action.
         * mat[1][1] = 0 → Found a zero:
         * Mark the row: Set mat[1][0] = 0.
         * Mark the column: Set mat[0][1] = 0.
         * mat[1][2] = 6 → No action.
         * Flags: firstrow = false, firstcol = false
         * Matrix after marking:
         * 
         * [
         * [1, 0, 3], // Marked column 1
         * [0, 0, 6], // Marked row 1
         * [7, 8, 9]
         * ]
         * Iteration 3: i = 2, j = 0 to 2 (third row)
         * 
         * mat[2][0] = 7 → No action.
         * mat[2][1] = 8 → No action.
         * mat[2][2] = 9 → No action.
         * Flags: firstrow = false, firstcol = false
         * Matrix remains unchanged:
         * 
         * [
         * [1, 0, 3], // Marked column 1
         * [0, 0, 6], // Marked row 1
         * [7, 8, 9]
         * ]
         * Marking Logic Summary
         * The first row and first column of the matrix serve as markers.
         * If mat[1][1] = 0, then both mat[1][0] and mat[0][1] are set to 0.
         * These markers are later used to set the entire rows or columns to 0.
         * 
         */

        // step 2: traversing the inner of the matrix

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        /*
         * 
         * Input after marking (from the first loop):
         * 
         * matrix =
         * [
         * [1, 0, 3], // Column 1 marked (marker)
         * [0, 0, 6], // Row 1 marked (marker)
         * [7, 8, 9]
         * ]
         * Iteration:
         * 
         * i = 1, j = 1:
         * Check matrix[1][0] == 0 → True (row marker).
         * Set matrix[1][1] = 0.
         * i = 1, j = 2:
         * Check matrix[1][0] == 0 → True (row marker).
         * Set matrix[1][2] = 0.
         * i = 2, j = 1:
         * Check matrix[2][0] == 0 → False (no row marker).
         * Check matrix[0][1] == 0 → True (column marker).
         * Set matrix[2][1] = 0.
         * i = 2, j = 2:
         * Check matrix[2][0] == 0 → False (no row marker).
         * Check matrix[0][2] == 0 → False (no column marker).
         * No change.
         * Matrix After Inner Loop:
         * 
         * matrix =
         * [
         * [1, 0, 3], // Markers remain untouched
         * [0, 0, 0], // Entire row 1 set to 0
         * [7, 0, 9] // Column 1 set to 0
         * ]
         */

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

    public static void setZeroesExtraSpace(int[][] arr) {
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
        Q3_SetMatrix_To_Zero obj = new Q3_SetMatrix_To_Zero();

        // Input matrix
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };

        int[][] matrix2 = {

                { 1, 2, 3 },
                { 4, 0, 6 },
                { 7, 8, 9 }
        };

        // Print the matrix before modification
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Apply the setZeroes function
        obj.setZeroes(matrix);

        // Print the matrix after modification
        System.out.println("Matrix After Setting Zeros:");
        printMatrix(matrix);

        setZeroesExtraSpace(matrix2);
        System.out.println("Printing the matrix2 after setting zero");
        printMatrix(matrix2);
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
