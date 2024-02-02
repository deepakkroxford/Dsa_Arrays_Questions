/*You don't need to read input or print anything.
 Your task is to complete the function print2largest()
  which takes the array of integers arr and n as parameters 
  and returns an integer denoting the answer. If 2nd largest 
  element doesn't exist then return -1.
 */

public class Second_Largest {
    public static void main(String[] args) {


        int arr[]={12, 35, 1, 10, 34, 34,1};
        int largest = arr[0];
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>largest)
          {
            largest=arr[i];
          }
        }
        int slargest=-1;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>slargest && arr[i]!=largest)
            {
                slargest=arr[i];
            }
        }
        System.out.println(slargest);

      //The another approach to solve this question
      //  Arrays.sort(arr);
      //   for(int i=n-2;i>=0;i--)
      //    {
      //     if(arr[i]!=arr[n-1])
      //     {
      //     return arr[i];
      //     }
      //     return -1;


        // int n =arr.length;
        // int temp=0;
        // for(int i =0;i<n;i++)
        // {
        //     for(int j =i+1;j<n;j++)
        //     {
        //         if(arr[i]>=arr[j])
        //         {
        //             temp=arr[j];
        //             arr[j]=arr[i];
        //             arr[i]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        // System.out.println("the second largest element in array is"+arr[n-2]);
        
    }
    }
  

