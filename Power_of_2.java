public class Power_of_2 {
    public static void main(String[] args) {
        int n=16;
        int temp=0,power=0;

        // for(int x=0;x<Math.sqrt(n);x++)
        // {
        //     if(n==Math.pow(2, x)){
        //         System.out.println("true");

        //     }
        //     else
        //     {
        //         System.out.println("false");
        //     }

        // }
        
        while (temp<n) {
            temp =(int)Math.pow(2,power);
            power++;
        }
         if(temp==n)
            {
             System.out.println("true");

            }
            else
            {
                System.out.println("false");
            }
       
    }
    
}
