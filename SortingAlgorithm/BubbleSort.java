package SortingAlgorithm;
class bubble{
    public void bubblesort(int arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 12, 45, 23, 51, 19, 8 };

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // for (int i : arr) {
        //     System.out.println(i);
        // }

        bubble bubble = new bubble();
        bubble.bubblesort(arr);
       


    }
}
