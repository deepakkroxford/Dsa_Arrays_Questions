

public class stringarray {
    public static void main(String[] args) {
        //sort the string array 

        String arr[]={"tiger","Aman","hero","king"};
        for(int i =0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i].compareTo(arr[j]))>0)
                {
                    String temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
