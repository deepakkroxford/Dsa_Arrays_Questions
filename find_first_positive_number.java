public class find_first_positive_number {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n = arr.length;

        // for(int i=1;i<n;i++)
        // {
            
        //     int diff= arr[i]-arr[i-1];
            
        //     if(diff>1)
        //     {
        //         System.out.println(i+1);
        //         break;
                
        //     }
           
        //     while(i<n && diff==1 && arr[i]==arr[n-1])
        //     {
        //          System.out.println(n+1);
        //         break;
        //     }
            
        // }
         
        //very simple approach
         int smallestpos=1;
         for(int i =0;i<n;i++)
         {
            if(arr[i]==smallestpos)
            {
                smallestpos++;
            }
         }
         System.out.println(smallestpos);
    }
}
