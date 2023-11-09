import java.util.Scanner;

public class Predict_the_Column {
    /*
     * question
     * Given a matrix(2D array) M of size N*N consisting of 0s and 1s only.
     * The task is to find the column with maximum number of 0s.
     * If more than one column exists, print the one which comes first.
     * If the maximum number of 0s is 0 then return -1.
     * 
     * inptut:
     * 1 1 1 0 0 0 1 1
     * 0 1 0 0 0 0 1 1
     * 1 1 0 0 1 1 0 0
     * 1 0 0 1 1 1 1 1
     * 1 1 1 1 1 0 0 1
     * 1 1 0 0 0 0 1 1
     * 1 1 0 1 0 1 1 1
     * 1 1 1 1 1 0 0 0
     * 
     * output:
     * 2   because the column 2 has more number of zero;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the n");
        int n = sc.nextInt();
        System.out.println("enter the element in the matrix");
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("printing the enterd matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int ans=-1;
        int max=0;

        for(int i =0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j][i]==0)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                ans=i;
            }

        }
        System.out.println("the column "+ans+ " has more number of zero");


    }
}
