package Matrix_DSA_Problem;

public class Q15_Matrix_Can_obtainedByRotation {
    public static void reverse(int arr[]) {
        int i=0;
        int j= arr.length-1;
        while(i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void rotate90(int [][]mat) {

        // step 1 find the transpose of the matrix

        for(int i=0;i<mat.length;i++) {
            for(int j=i+1;j<mat[0].length;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // step 2 reverse the each row of the matrix to get the 90 degree rotation

        for(int i=0;i<mat[0].length;i++) {
            reverse(mat[i]);
        }
    }
    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int k = 0; k < 4; k++) { // we are rotating 4 time to cover all the possible case
            // we know that rotation is done till 360 degree.
            boolean isSame = true;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] != target[i][j]) {
                        isSame = false;
                        break;
                    }
                }
                if (!isSame) break;
            }
            if (isSame) return true;

            // rotate for the next check
            rotate90(mat);
        }
        return false;


    }
    public static void main(String[] args) {
        /**
         * Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
         *
         *
         *
         * Example 1:
         * Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
         * Output: true
         * Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
         * Example 2:
         *
         *
         * Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
         * Output: false
         * Explanation: It is impossible to make mat equal to target by rotating mat.
         * Example 3:
         *
         *
         * Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
         * Output: true
         * Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
         *
         *
         * Constraints:
         *
         * n == mat.length == target.length
         * n == mat[i].length == target[i].length
         * 1 <= n <= 10
         * mat[i][j] and target[i][j] are either 0 or 1.
         */

        // Test Case 1
        int[][] mat1 = {{0, 1}, {1, 0}};
        int[][] target1 = {{1, 0}, {0, 1}};
        System.out.println("Test Case 1: " + findRotation(mat1, target1)); // Should print true

        // Test Case 2
        int[][] mat2 = {{0, 1}, {1, 1}};
        int[][] target2 = {{1, 0}, {0, 1}};
        System.out.println("Test Case 2: " + findRotation(mat2, target2)); // Should print false

        // Test Case 3
        int[][] mat3 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target3 = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println("Test Case 3: " + findRotation(mat3, target3)); // Should print true

    }
}

