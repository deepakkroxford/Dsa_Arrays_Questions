package Matrix_DSA_Problem;

public class Q14_FindingMaximumInEachRow {

    public static int[] findMaxElementInEachRow(int[][] matrix) {

        int []res = new int[matrix.length];
        int x = 0;
        for (int[] ints : matrix) {
            int currentMax = Integer.MIN_VALUE;
            for (int j = 0; j < ints.length; j++) {
                if (currentMax < ints[j]) {
                    currentMax = ints[j];
                }
            }
            res[x++] = currentMax;
        }

        return res;
    }

    public static void main(String[] args) {
        /**
         * Given a 2D matrix of integers, write a program to find the maximum element in each row of the matrix.
         * [
         *   [3, 5, 9, 1],
         *   [4, 8, 2, 6],
         *   [7, 0, 3, 5],
         *   [9, 4, 6, 2]
         * ]
         *
         * Expected Output:
         * [9, 8, 7, 9]
         */

        int [][]arr = {{3,5,9,1},{4,8,2,6},{7,0,3,5},{9,4,6,2}};

        int ans[] = findMaxElementInEachRow(arr);

        for(int i =0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
