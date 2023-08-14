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

// optimize method 

class Solution1
{
    static int majorityElement(int a[], int size)
    {
      int ans = 0;
        int count = 0;

        // Step 1: Find a candidate for the majority element
        for (int i=0;i<size;i++) {
            if (count == 0) {
                ans = a[i];
            }

            if (a[i] == ans) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i=0;i<size;i++) {
            if (a[i] == ans) {
                count++;
            }
        }

        if (count >size / 2) {
            return ans;
        } else {
            return -1;
        }
}
}