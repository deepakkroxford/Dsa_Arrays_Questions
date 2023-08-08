import java.util.Arrays;
public class Segregate_0sand1s {
public static void main(String[] args) {
     int arr[]={0, 0, 1, 1, 0};
     int n = arr.length;
    //first method
    // Arrays.sort(arr);
    // for(int i =0;i<n;i++)
    // {
    //     System.out.println(arr[i]);
    // }
    //this is the second method
    // int count=0;
    // for(int i=0;i<n;i++)
    // {
    //     if(arr[i]==0)
    //     {
    //         count ++;
    //     }
    // }
    // for(int i=0;i<count;i++)
    // {
    //     arr[i]=0;
    // }
    // for(int i =count ;i<n;i++)
    // {
    //     arr[i]=1;
    // }

    // for(int j=0;j<arr.length;j++){
    //    System.out.println(arr[j]);
    // }

    //third method to segrigate
    int low =0;
    int mid =0;
    while(mid<n)
    {
        switch(arr[mid])
        {
            case 0:
            int temp = arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            mid++;
            low++;
            break;


            case 1:
            mid++;
            break;
        }
    }
    for(int i =0;i<n;i++){
        System.out.println(arr[i]);
    }
    
    
}
}
