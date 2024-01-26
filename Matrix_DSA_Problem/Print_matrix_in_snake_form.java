package Matrix_DSA_Problem;
import java.util.Scanner;

/**
 * Print_matrix_in_snake_form
 */
public class Print_matrix_in_snake_form {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the element ");
        int arr[][]= new int[n][n];
        
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("output");
    //    for(int i =0;i<n;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //         {
    //            System.out.print(arr[i][j]+" ");
    //         }
    //         System.out.println();
    //     }

        for(int i =0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                   System.out.print(arr[i][j]+" "); 
                }
                
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

        



    }
}