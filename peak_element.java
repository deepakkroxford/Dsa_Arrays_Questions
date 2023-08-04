public class peak_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,2,1,3,45};
        int max=arr[0];
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                //this will print the index number of peak element
                // max =i+1;
             //this will print the peak number
                  max=arr[i+1];
            }
        }
        System.out.println(max);
    }
    
}
