public class palindromic_Array {
    public static void main(String[] args) {
        int arr[]={111,222,333,444};
        for(int i =0;i<arr.length;i++)
        {   
            int rev=0;
            int temp = arr[i];
            while(temp>0)
            {
                int rem;
                rem = temp%10;
                temp /= temp;
                rev = (rev*10)+rem;
                
            }
            if(rev!=arr[i])
            {
                System.out.println("not palindrome");
            }
            
        }
        System.out.println("palindrome");

    }
}
