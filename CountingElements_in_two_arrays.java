import java.util.ArrayList;
import java.util.LinkedList;

public class CountingElements_in_two_arrays {
    public static void main(String[] args) {
        int arr1[]={4,8,7,5,1};
        int arr2[]={4,48,3,0,1,1,5};


        LinkedList<Integer> arr = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int count=0;
        for(int i =0;i<arr1.length;i++)
        {
            
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]>=arr2[j])
                {
                    count++;
                }
            }
            ans.add(count);
            count=0;
        }
        System.out.println(ans);
    }
}
