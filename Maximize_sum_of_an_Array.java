import java.util.Arrays;
public class Maximize_sum_of_an_Array {
    public static void main(String[] args) {
        int arr[]={5, 3, 2, 4, 1};
        
        Arrays.sort(arr);
        int sum =0;
        for (int i=0;i<arr.length;i++) {
            sum = sum+arr[i]*i;
        }
        System.out.println(sum);
    

        
    }
}
