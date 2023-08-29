import java.util.ArrayList;

public class Sub_array_withgiven_sum {
    public static void main(String[] args) {
        int s=12;
        int arr[]={1,2,3,7,5};
        int n = arr.length;
        ArrayList<Integer>ans= new ArrayList<>();
        if(s==0)
        {
            ans.add(-1);
            System.out.println(ans);
        }
        int l=0;
        int r = 0;
        int sum =arr[0];
        boolean isfound= false;
        while(r<arr.length-1)
        {
            if(sum==s)
            {
                isfound =true;
                break;
            }
            else if(sum<s)
            {
                r++;
                if(r<n)
                sum = sum+arr[r];
                
            }
            else
            {
                sum =sum-arr[l];
                l++;
            }
        }
        if(isfound)
        {
            ans.add(l+1);
            ans.add(r+1);
            System.out.println(ans);
        }
        ans.add(-1);
        System.out.println(ans);

    }
}
