public class Q6_left_rotate_by_one {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
