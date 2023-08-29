public class find_smallest_and_secondsmallest {
    public static void main(String[] args) {
        // Given an array of integers, your task is to find the smallest and second
        // smallest element in the array. If smallest and second smallest do not exist,
        // print -1.

        int arr[]={2, 4, 3, 5, 6};
        int ans []=new int [2]; 
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
        ans[0]=arr[0];
        ans[1]=arr[1];
        for (int i : ans) {
             System.out.print(i +" ");
        }
       
           // System.out.println(arr[0]+" "+arr[1]);
        
    }
}
