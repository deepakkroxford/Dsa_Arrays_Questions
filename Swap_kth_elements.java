public class Swap_kth_elements
{
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8};
        
        int k =3;
       
         int temp = arr[k-1];
         arr[k-1]= arr[arr.length-k];
         arr[arr.length-k]=temp;

         for(int i =0;i<arr.length;i++)
         {
            System.out.print(" "+arr[i]);
         }
            
            
            

      
        
    }
}