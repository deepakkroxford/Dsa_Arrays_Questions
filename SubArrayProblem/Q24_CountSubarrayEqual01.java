package SubArrayProblem;

import java.util.HashMap;

public class Q24_CountSubarrayEqual01 {
    public static int SubarayCount(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int subArray=0;
        int sum = 0;
        map.put(sum, 1);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                sum +=-1;
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum))
            {
                subArray +=map.get(sum);
            }
                map.put(sum , map.getOrDefault(sum,0)+1);  
            
        }
        return subArray;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 1};

       int result=  Q24_CountSubarrayEqual01.SubarayCount(arr);
       System.out.println(result);
    }
}
