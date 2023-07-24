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
