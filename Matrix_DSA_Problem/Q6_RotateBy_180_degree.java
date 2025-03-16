package Matrix_DSA_Problem;

public class Q6_RotateBy_180_degree {
    public static void revrseColWise(int arr[][], int col)
    {
        int top=0;
        int buttom = arr.length-1;
        while(top<buttom)
        {
            int temp = arr[top][col];
            arr[top][col] = arr[buttom][col];
            arr[buttom][col] = temp;
            top++;
            buttom--;
        }
    }
    public static void reverseRow(int matrix[])
    {
        int i=0;
        int j = matrix.length-1;
        while(i<j){
            int temp= matrix[i];
            matrix[i] = matrix[j];
            matrix[j]= temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        /*
         * Rotating a matrix by 180 degrees is a multi-dimensional array problem. It had
         * been asked in the NVIDIA interview round for the role of software
         * engineers/developers. Alongside it is one of those problems that checks an
         * individual's critical thinking by analyzing the most fundamental approach of
         * the programmer.
         * 
         * In this article, we’ll use two methods to solve this problem; the first is
         * the brute force or naive approach, and the second is by swapping positions.
         * 
         * Problem Statement
         * Given a square matrix, the task is to turn it 180 degrees without using extra
         * space.
         * 
         * 
         * Input:
         * N = 3
         * matrix[][] =
         * [[1 2 3],
         * [4 5 6],
         * [7 8 9]]
         * 
         * output :-
         * 9 , 8 , 7 
         * 6 , 5 , 9 
         * 3 , 2 , 1
         * 
         */

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}, 
            {7, 8, 9}
        };
        // Approach to solve this problem is first we reverse the column and then we have to 
        // reverse the row wise then we get the desired matrix 

        for(int col=0; col<matrix[0].length;col++)
        {
            revrseColWise(matrix,col);
        }

        for(int i=0;i<matrix.length;i++)
        {
            reverseRow(matrix[i]);
        }


        System.out.println("after rotation of 180");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
