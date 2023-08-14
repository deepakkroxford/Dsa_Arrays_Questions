public class primefactor {
    public static void main(String[] args) {
        double n =24;
        for(int i=2;i<=n;i++)
        { 
            /*
             * this loop check if it is fully divisible by i or not
             * if yes then divide by that number 
             */
            
            while(n%i==0) 
            {
              n = n/i;
              System.out.println(i);
            }
            
        }
        

    }
}
