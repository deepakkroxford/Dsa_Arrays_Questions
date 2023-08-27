import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class find_duplicate_element_array {
    public static void main(String[] args) {
        /*
         * Given an array a of size N which contains elements from 0 to N-1, you need to
         * find all the elements occurring more than once in the given array. Return the
         * answer in ascending order. If no such element is found, return list
         * containing [-1].
         * 
         * example 1:
         * Input:
         * N = 4
         * a[] = {0,3,1,2}
         * Output:
         * -1
         * Explanation:
         * There is no repeating element in the array. Therefore output is -1.
         * 
         * example 2:
         * Input:
         * N = 5
         * a[] = {2,3,1,2,3}
         * Output:
         * 2 3
         * Explanation:
         * 2 and 3 occur more than once in the given array.
         */

         int arr[] = {2,3,1,2,3};
      HashSet<Integer> s= new HashSet<>();
      Arrays.sort(arr);
    for(int i=0 ; i<arr.length-1 ; i++)
    {
        if(arr[i]==arr[i+1])
        {
            s.add(arr[i]) ;
            
        }
    }
    ArrayList<Integer> list = new ArrayList<>(s) ;
    Collections.sort(list) ;
    if(s.size()==0)
    {
        list.add(-1) ;
       
    }
   System.out.println(list);

    }
}