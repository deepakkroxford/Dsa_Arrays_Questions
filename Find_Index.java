public class Find_Index {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 5};
        int key =5;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(i);
            }
        }
    }
}
