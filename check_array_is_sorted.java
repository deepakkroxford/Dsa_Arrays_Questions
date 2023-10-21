public class check_array_is_sorted {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        int n = arr.length;
        int count=0;
        for(int i =0;i<n-1;i++)
        {
            //so in this case we check first the false satement 
            //it means that we check the ith element is greater than i+1 
            //elemnt if this is true it means the array is not sorted
            if(arr[i]>arr[i+1])
            {
                count++;
            }
        }

        if(count==0)
        {
            System.out.println("the array is sorted");
        }
        else
        {
            System.out.println("not sorted");
        }
    }
}
