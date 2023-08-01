//geeks for geeks solution 
// it is a typecasting problem
// class Solution{
    
//     int Maximize(int arr[], int n)
//     {
//         // Complete the function
       
//        long sum = 0;
       
//         Arrays.sort(arr);
//         for(int  i = 0;i<n;i++)
//         {
//             sum += ((long)(arr[i])*i);
//         }
//         int result=(int)(sum%(Math.pow(10,9)+7));
//         return result;
//     }   
// }



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
