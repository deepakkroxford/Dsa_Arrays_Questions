//{ Driver Code Starts
//Initial Template for Java
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        //brute force technique
        //o(n^2)
        for(int i =0;i<=size-1;i++)
        {
            int count=0;
            for(int j=0;j<=size-1;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            
            if(count>size/2)
            {
                return a[i];
            }
        }
        
            return -1;
        
    }
}