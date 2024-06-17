import java.util.Scanner;;

public class checkPrime_Number {
    public static void main(String[] args) {
        Scanner soc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int N = soc.nextInt();
        int count = 0;

        if (N <= 1) {
            System.out.println("not prime");

        }

        for (int i = 1; i < N; i++) {

            if (N % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println(" prime");
        } else {
            System.out.println(" not prime");
        }

    }
}
