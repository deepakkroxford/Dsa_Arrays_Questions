import java.util.Scanner;
public class Sub_arrayprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int arr =sc.nextInt();
        System.out.println("enter the element in an array");
        int [] box =new int [arr];
        for(int i =0;i<box.length;i++)
        {
            box[i]=sc.nextInt();
        }
        for(int i=0;i<box.length;i++)
        {
            for(int j=i;j<box.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.println(box[k]+" ");
                }
                System.out.println("");
            }
        }
        
        

    }
}
