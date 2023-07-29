
/*
 * Given an array A[] of size n. The task is to find the largest element in it.
 * Input:
n = 5
A[] = {1, 8, 7, 56, 90}
Output:
90
Explanation:
The largest element of given array is 90.

 */
//geeks for geeks
class Compute {

    public int largest(int arr[], int n) {
        int max = arr[0];

        for (int i = 0; i < n; i++) {

            if (max < arr[i]) {
                max = arr[i];

            }

        }
        return max;

    }
}

// int arr[]={1, 8, 7, 56, 90};
// int max = arr[0];
// for(int i =0;i<arr.length;i++)
// {

// if(max<arr[i])
// {
// max = arr[i];
// }

// }
// System.out.println(max);
