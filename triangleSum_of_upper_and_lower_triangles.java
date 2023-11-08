import java.util.Scanner;

/*
 * question
 * Given a square matrix of size N*N, print the sum of upper and lower triangular elements.
 *  Upper Triangle consists of elements on the diagonal and above it. 
 * The lower triangle consists of elements on the diagonal and below it. 
 * nput:
N = 3 
matrix[][] = {{6, 5, 4},
           {1, 2, 5}
           {7, 9, 7}}
Output: 
29 32
Explanation:
The given matrix is
6 5 4
1 2 5
7 9 7
The elements of upper triangle are
6 5 4
  2 5
    7
Sum of these elements is 6+5+4+2+5+7=29.
The elements of lower triangle are
6
1 2
7 9 7
Sum of these elements is 6+1+2+7+9+7= 32.

 */
public class triangleSum_of_upper_and_lower_triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the element ");
        int arr[][] = new int[n][n];
        int uppersum = 0;
        int lowersum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // System.out.println("upper");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j + 1; i++) {
                uppersum += arr[i][j];
            }
        }
        // System.out.println("lower");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                lowersum +=arr[i][j];
            }
        }
        System.out.println("upper" + uppersum);
        System.out.println("lower" + lowersum);

    }
}
