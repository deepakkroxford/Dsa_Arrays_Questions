public class longest_Subarray_withsum_k {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,4,2,3};
        int s=5;

        //brute force approch
        // first write the code for pinting the array
        //then insialize the sum =0;
        //check using if condition (sum=s)
        //if it yes then len = Math.max(len,j-i+1)

        int len =0;
        // for(int i =0;i<arr.length;i++)
        // {
        //     for(int  j=i;j<arr.length;j++)
        //     {
        //         int sum =0;
        //         for(int k=i;k<=j;k++){
        //           sum =sum +arr[k];  
        //         }
        //           if(sum == s)
        //          len = Math.max(len,j-i+1);//this is use to find the maximum length
                
                
        //     }
        // }
        // System.out.println(len);

        for(int i =0;i<arr.length;i++)
        {
            int sum =0;
            for(int j=i;j<arr.length;j++)
            sum=sum+arr[j];
            if(sum==s)
                len = Math.max(len,j-i+1);
            
        }
        System.out.println(len);
    }
}
