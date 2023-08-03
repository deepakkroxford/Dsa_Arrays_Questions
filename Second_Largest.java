public class Second_Largest {
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};
        int n =arr.length;
        int temp=0;
        for(int i =0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(arr[i]>=arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("the second largest element in array is"+arr[n-2]);
        
    }
    }

