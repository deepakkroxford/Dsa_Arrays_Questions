package Matrix_DSA_Problem;
import java.util.*;
public class Q1_TwoD_Array_Inisilization {
    public static void main(String[] args) {

    /*
     * In two d array the indexing start with 0 and first comes row
     * and then column.
     * 
     */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of row");
        int row = sc.nextInt();

        System.out.println("enter the size of coloum");
        int col = sc.nextInt();

        //initilzing the array
        int num[][] = new int [row][col];
        
        //this loop is taking input from user
        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                num[i][j]=sc.nextInt();
            }
        }

        //and this loop is used for printing the enter element
        System.out.println("the enterd elemet are");
        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
