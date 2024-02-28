/**
 * Innermove_All_0_front
 */
class Solutionxy {
    public void moveZeroes(int[] nums) {
        int nonzero=nums.length-1;
        for(int i =nums.length-1;i>=0;i--)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i]=nums[nonzero];
                nums[nonzero]=temp;
                nonzero--;
            }
        }
        
        
         
    }
}

public class move_All_0_front {
    public static void main(String[] args) {
        Solution s = new Solution();

        int arr[]={0,1,0,2,3,12};
        s.moveZeroes(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
