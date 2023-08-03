 public class kadane_Alogorithm
 {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        for(int i =0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum=0;
                sum= sum+arr[j];
            }
        }
    }
 }