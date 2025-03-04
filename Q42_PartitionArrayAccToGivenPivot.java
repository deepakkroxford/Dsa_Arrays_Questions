import java.util.ArrayList;

public class Q42_PartitionArrayAccToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int res[] = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int j =nums.length - 1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<pivot){
                res[left]=nums[i];
                left++;
            }
            if(nums[j]>pivot){
                res[right]=nums[j];
                right--;
            }
            j--;
        }
        while(left<=right)
        {
            res[left]=pivot;
            left++;
        }
        return res;
    }
    public int[] pivotArray_SecondWay(int[] nums, int pivot) {
        int res[] = new int[nums.length];
        ArrayList<Integer> lessThanPivot = new ArrayList<>();
        ArrayList<Integer> equalToPivot = new ArrayList<>();
        ArrayList<Integer> greaterThanPivot= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot){
                lessThanPivot.add(nums[i]);
            }
            else if(nums[i]==pivot){
                equalToPivot.add(nums[i]);
            }
            else{
                greaterThanPivot.add(nums[i]);
            }
        }

        int i =0;
        int j=0;
        int k =0;
        int x=0;
        while(i<lessThanPivot.size())
        {
            res[x]=lessThanPivot.get(i);
            i++;
            x++;
        }

         while(j<equalToPivot.size())
        {
            res[x]=equalToPivot.get(j);
            j++;
            x++;
        }

          while(k< greaterThanPivot.size())
        {
            res[x]= greaterThanPivot.get(k);
            k++;
            x++;
        }

        return res;
    }

    public int[] pivotArray_ThirdWay(int[] nums, int pivot) {
        // we can count the number that is less than pivot and equal to pivot
        int countless =0;
        int countequal = 0;
        for (int i : nums) {
            if(i<pivot){
                countless++;
            }
            else if(i==pivot){
                countequal++;
            }
        }
        int res[] = new int[nums.length];
        int i =0;
        int j =countless;
        int k = countless+countequal;

       for(int x=0;x<nums.length;x++){
        if(nums[x]<pivot){
            res[i]=nums[x];
            i++;
        }
        else if (nums[x]>pivot){
            res[k]=nums[x];
            k++;
        }
        else{
            res[j]=nums[x];
            j++;
        }
       }
        return res;

    }

    
    public static void main(String[] args) {
        /*
        leetcode =2161. 
          https://leetcode.com/problems/partition-array-according-to-given-pivot/description/?envType=daily-question&envId=2025-03-03
         * You are given a 0-indexed integer array nums and an integer pivot. Rearrange
         * nums such that the following conditions are satisfied:
         * 
         * Every element less than pivot appears before every element greater than
         * pivot.
         * Every element equal to pivot appears in between the elements less than and
         * greater than pivot.
         * The relative order of the elements less than pivot and the elements greater
         * than pivot is maintained.
         * More formally, consider every pi, pj where pi is the new position of the ith
         * element and pj is the new position of the jth element. If i < j and both
         * elements are smaller (or larger) than pivot, then pi < pj.
         * Return nums after the rearrangement.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [9,12,5,10,14,3,10], pivot = 10
         * Output: [9,5,3,10,10,12,14]
         * Explanation:
         * The elements 9, 5, and 3 are less than the pivot so they are on the left side
         * of the array.
         * The elements 12 and 14 are greater than the pivot so they are on the right
         * side of the array.
         * The relative ordering of the elements less than and greater than pivot is
         * also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
         * Example 2:
         * 
         * Input: nums = [-3,4,3,2], pivot = 2
         * Output: [-3,2,4,3]
         * Explanation:
         * The element -3 is less than the pivot so it is on the left side of the array.
         * The elements 4 and 3 are greater than the pivot so they are on the right side
         * of the array.
         * The relative ordering of the elements less than and greater than pivot is
         * also maintained. [-3] and [4, 3] are the respective orderings.
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 105
         * -106 <= nums[i] <= 106
         * pivot equals to an element of nums.
         */

        int nums[] = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        Q42_PartitionArrayAccToGivenPivot obj = new Q42_PartitionArrayAccToGivenPivot();
        int res[] = obj.pivotArray(nums, pivot);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        System.out.println();
        int nums1[] = { -3, 4, 3, 2 };
        int pivot1 = 2;
        int res1[] = obj.pivotArray_SecondWay(nums1, pivot1);
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i] + " ");
        }

        System.out.println();
        int nums2[] = { -3, 4, 3, 2 };
        int pivot2 = 2;
        int res2[] = obj.pivotArray_ThirdWay(nums2, pivot2);
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i] + " ");
        }

    }
}
