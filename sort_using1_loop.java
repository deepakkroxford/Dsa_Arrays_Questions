public class sort_using1_loop {
    public static void main(String[] args) {
        int arr[]={1,1,1};
        int n =arr.length;
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
            
        }
        for (int i=0;i<n;i++) {
             System.out.println(arr[i]);
        }
       
    }
}
