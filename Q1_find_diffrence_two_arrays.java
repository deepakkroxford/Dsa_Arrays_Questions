import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class finddiffrence {
    public List<List<Integer> > findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();


        for(int i =0;i<nums1.length;i++)
        {
            s1.add(nums1[i]);

        }
        for(int i =0;i<nums2.length;i++)
        {
            s2.add(nums2[i]);
            
        }
        
        HashSet<Integer> ans1 = new HashSet<>();
       

       for(int i=0;i<nums1.length;i++){
             if(s2.contains (nums1[i])== false)
             {
                ans1.add(nums1[i]);
              }
       }
     HashSet<Integer> ans2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
             if(s1.contains (nums2[i])== false)
             {
                ans2.add(nums2[i]);
              }
       }
       
       return Arrays.asList (new ArrayList<>( ans1), new ArrayList<>(ans2));
    }
}

public class Q1_find_diffrence_two_arrays {
    public static void main(String[] args) {
        
    }
}
