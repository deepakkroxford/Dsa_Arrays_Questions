import java.util.Arrays;
public class Check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        int a[]={1,2,5,4,0};
        int b[]={2,4,5,0,1};

        Arrays.sort(a);
        Arrays.sort(b);
        int count=0;
        for(int i =0;i<=a.length-1;i++)
        {
            for(int j=0;j<=b.length-1;j++)
            {
                if(a[i]==b[j])
                {
                    count++;
                }
                
            }
        }
        if(count==a.length)
        {
            System.out.println("array is same");
        }
        else{
            System.out.println("not same");
        }
        
    }
}