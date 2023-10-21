import java.util.Scanner;
public class Sum_ofalldivisorsfrom_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum =0;
        for(int i =1;i<=n;i++)
        {
            int div = n/i;
            sum =sum+div*i;
        }
        System.out.println(sum);
    }
}
/*
 * long sum = 0;
        for(int i =1;i<=N;i++)
        {
            int div = N/i;
            sum = sum+div*i;
        }

 n=4

if i= 1
div = 1
sum = 0+4*1=4 so now sum is 4
so it means that f(1)=4

if i = 2
div=4/2;
sum = 4 + 2*2 =8;

if i = 3
div = 4/3 = 1
sum = 8+1*3=11

if i = 4 
div = 4/4 =1
sum = 11 +1*4=15

 */