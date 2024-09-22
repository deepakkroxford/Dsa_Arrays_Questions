// question from GeeksforGeeks 
// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
// User function Template for Java
public class missing_array_element{
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 5, 6};;
        int n = arr.length+1;
        int sumn= (n*(n+1))/2;
        int sum =0;
        for(int i =0;i<arr.length;i++)
        {
            sum = sum +arr[i];

        }
        System.out.println("the missing element in array is "+(sumn-sum));
    }
}
