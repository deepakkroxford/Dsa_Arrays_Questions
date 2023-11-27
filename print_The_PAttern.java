import java.util.ArrayList;
import java.util.Scanner;

public class print_The_PAttern {
    public static void main(String[] args) {
        /*
         * Print a sequence of numbers starting with N, without using loop, where
         * replace N with N - 5, until N > 0. After that replace N with N + 5 until N
         * regains its initial value.
         * 
         * Example 1:
         * Input:
         * N = 16
         * Output:
         * 16 11 6 1 -4 1 6 11 16
         * Explaination:
         * The value decreases until it is greater than 0. After that it increases and
         * stops when it becomes 16 again.
         * 
         * Example 2:
         * Input:
         * N = 10
         * Output:
         * 10 5 0 5 10
         * Explaination: It follows the same logic as per the above example.
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();

        int i =0;
        int temp = n;
        ans.add(temp);
        while(i<temp)
        {
            temp = temp-5;
            ans.add(temp);
        }
        for(int x=0;x<n;x++)
        {
            temp= temp+5;
            ans.add(temp);
            if(temp==n)
            {
                break;
            }
        }
        System.out.println(ans);

    }
}
