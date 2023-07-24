// You are given a string s. You need to reverse the string.
// You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.
// Expected Time Complexity: O(|S|).
// Expected Auxiliary Space: O(1).
// s = Geeks
// Output: skeeG
public class reverse_string {
    public static void main(String[] args) {
         // Reverse the string str
         String str ="Geeks";
       String rev="";
       for(int i =str.length()-1;i>=0;i--)
       {
           rev= rev+str.charAt(i);
       }
       //in geeks for geeks return rev;
       System.out.println(rev);
    }
}
