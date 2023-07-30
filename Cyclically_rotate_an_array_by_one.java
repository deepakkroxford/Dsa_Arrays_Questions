public class Cyclically_rotate_an_array_by_one {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
         //here we using two variable i and j 
        //  so i target last index value 
        // and the j targe the 2nd last index value
        int  i=arr.length-1;
         int  j=arr.length-2; 

         while(i>0)
         {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i--;
            j--;
         }
         for( i=0;i<arr.length;i++)
         {
         System.out.println(arr[i]);
         }

        // //here we setting temp value to last element of the array
        // int temp = arr[arr.length - 1];
        // for (int i = arr.length - 1; i > 0; i--) {
        //     arr[i] = arr[i - 1];
        // }
        // arr[0] = temp;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

    }

}
