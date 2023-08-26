 import java.util.Arrays;
import java.util.HashSet;
public class remove_dupilicate_element {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5,5};
        Arrays.sort(arr);
        // int temp[]= new int[arr.length];
        // int j =0;
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     if(arr[i]!=arr[i+1])
        //     {
        //         temp[j]=arr[i]; 
        //         j++;
        //     }
        // }
        // temp[j]=arr[arr.length-1];

        // for(int i =0;i<temp.length;i++)
        // {
        //     System.out.println(temp[i]);
        // }

        //2nd approch in single array only applicable for sorted array
        int j =0;       
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
               
                arr[j]=arr[i];
                j++;
                
            }
        }
         arr[j]=arr[arr.length-1];

        System.out.println("the element are");


        for(int i=0;i<j+1;i++)
        {
            System.out.println(arr[i]+" ");
        }


        //third approach using hash set for sorted or unsorted array
        HashSet <Integer> hs = new HashSet<>();
        for(int i =0;i<arr.length;i++)
        {
           hs.add(arr[i]);
        }
        System.out.println(hs);

    }
}
