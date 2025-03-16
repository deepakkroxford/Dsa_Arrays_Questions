package Matrix_DSA_Problem;
import java.util.*;
public class Q2_TwoD_array_element_search {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the size of row");
       int row = sc.nextInt();

       System.out.println("enter the size of col");
       int col = sc.nextInt();

       int matrix [][] = new int [row][col];

       System.out.println("enter the elements");
       for(int i =0;i<row;i++)
       {
        for(int j=0;j<col;j++)
        {
            matrix[i][j]= sc.nextInt();
        }
       }
       System.out.println("enter the element to be searched");
       int x=sc.nextInt();
        
       System.out.println("the element at position is");
       for(int i =0;i<row;i++)
       {
        for(int j=0;j<col;j++)
        {
           if(matrix[i][j]==x)
           {
            System.out.println(i +" "+j);
           }
        }
       }




    }
}
