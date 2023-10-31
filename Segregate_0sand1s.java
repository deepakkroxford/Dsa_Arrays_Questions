import java.util.Arrays;

public class Segregate_0sand1s {
    public static void main(String[] args) {
        int arr[] = { 0,2,1,2,0 };

        // first method

        // Arrays.sort(arr);
        // for(int i =0;i<n;i++)
        // {
        // System.out.println(arr[i]);
        // }

        // this is the second method

        // int count=0;
        // for(int i=0;i<n;i++)
        // {
        // if(arr[i]==0)
        // {
        // count ++;
        // }
        // }
        // for(int i=0;i<count;i++)
        // {
        // arr[i]=0;
        // }
        // for(int i =count ;i<n;i++)
        // {
        // arr[i]=1;
        // }

        // for(int j=0;j<arr.length;j++){
        // System.out.println(arr[j]);
        // }

        // third method to segrigate
        // int low =0;
        // int mid =0;
        // while(mid<n)
        // {
        // switch(arr[mid])
        // {
        // case 0:
        // int temp = arr[low];
        // arr[low]=arr[mid];
        // arr[mid]=temp;
        // mid++;
        // low++;
        // break;

        // case 1:
        // mid++;
        // break;
        // }
        // }
        // for(int i =0;i<n;i++){
        // System.out.println(arr[i]);
        // }

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;

                    break;
                }
                case 1:
                mid++;
                break;

                case 2:
                {
                  temp = arr[mid];
                  arr[mid]=arr[high];
                  arr[high]= temp;
                  high--;
                  break;  
                }

            }
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
