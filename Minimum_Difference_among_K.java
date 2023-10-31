import java.util.Arrays;

public class Minimum_Difference_among_K {
    public static void main(String[] args) {
        int arr [] = {10, 100, 300, 200, 1000, 20, 30};
        int k =3;
        Arrays.sort(arr);
        int max= arr[0];
        int min = arr[0];
        
        for(int i =0;i<=k-1;i++)
        {
            if(arr[i]>=max)
            {
                max= arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
       
        System.out.println(max);
        System.out.println(min);
        int result = max-min;
        System.out.println(result);

        

    }
}
