

public class chararray {
   public static void main(String[] args) {
    char []arr={'a','b','x','y','m','s','g'};

    //sorting the character array
    for(int i =0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]<arr[j])
            {
                char temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

    }
    for (char c : arr) {
        System.err.println(c);
    }
   } 
}
