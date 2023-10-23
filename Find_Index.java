public class Find_Index {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 5};
        int key =5;
        
        for(int i =0;i<arr.length;i++)
        {
            int count = 0;
            if(arr[i]==key)
            {

                System.out.println(i);
                count++;
                if(count==1)
                break;
            }
        }
    }
}
