public class max_min_elem_arr {
    public static void main(String[] args) {

        int arr[]={31,22,12,-7,75,-6,17,47,60};
        int max=arr[0];
        int min = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("the maximum ele "+ max +" the min ele " +min);

    }
}
