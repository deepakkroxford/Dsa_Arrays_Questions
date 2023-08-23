public class check_array_is_sorted {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50};
        int n = arr.length;
        int count=0;
        for(int i =0;i<n-1;i++)
        {
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
