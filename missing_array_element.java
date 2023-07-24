// question from GeeksforGeeks 
// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
// User function Template for Java
class Solution {
    int missingNumber(int array[], int n) {
        // first we have to find the sum of n number
        int sumn = n * (n + 1) / 2;
        int sum = 0;
        //then we find sum of the given array element 
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        //then after subtract from sum of n number and sum of array element
        return sumn - sum;
    }
}