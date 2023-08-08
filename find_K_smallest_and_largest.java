import java.util.Scanner;
public class find_K_smallest_and_largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= {7 ,10, 4 ,3 ,20, 15};
        System.out.println("enter the value of k");
        int k = sc.nextInt();

        System.out.println("the sorted array is");
        for(int i =0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("the third smallest element is "+arr[k-1]);
        System.out.println("the k largest element is "+arr[arr.length-k]);

    }
}
