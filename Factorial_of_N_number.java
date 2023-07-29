// Given a positive integer, N. Find the factorial of N.
// Input:
// N = 4
// Output:
// 24
// Explanation:
// 4*3*2*1 = 24

//Geeks for Geek
class Solution{
    static long factorial(int N){
        // code here
    //the important point is we have to store the value in long not in int
       long res = 1;
        for (int i = 2; i <= N; i++)
            res = res*i;
        return res;
    }
}



   
    //     Scanner sc = new Scanner(System.in);
    //    System.out.println("enter the value of n");
    //    int n = sc.nextInt();
    //    long fact=1;
    //    for(int i=1;i<=n;i++)
    //    {
    //     fact =fact*i;
    //    }
    //    System.out.println(fact);
       


