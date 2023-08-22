import java.util.HashSet;
public class union_of_two_array
{     
    public static void main(String[] args) {

        /* 
         * we use set in set it not allows the duplicate element
         * Union: union means set of elements which is present in array one or array two 
         * or both arrays
         */
        HashSet <Integer> set = new HashSet<>();
        int arr[]={1,2, 3, 4, 5};
        int n =arr.length;
        int brr[]={1,2,3};
        int m = brr.length;


        for(int i =0;i<n;i++)
        {
            set.add(arr[i]);
        }
        for(int i =0;i<m;i++)
        {
            set.add(brr[i]);
        }

        System.out.println(set);
        System.out.println(set.size());
            
    }
    }
