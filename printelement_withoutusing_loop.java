
class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
          if(N==0){
            return;
        }
        else{
            printNos(N-1);
            System.out.print(N+" ");
        }
        
       
        
    }
}