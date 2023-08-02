public class Second_Largest {
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};
        int n =arr.length;
        int temp=0;
        for(int i =0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
        
    }
    }

