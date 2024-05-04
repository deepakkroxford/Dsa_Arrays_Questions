/*
 * Given an integer array and another integer element.
 *  The task is to find if the given element is present in array or not.
Input:
n = 4
arr[] = {1,2,3,4}
x = 3
Output: 2
Explanation: There is one test case 
with array as {1, 2, 3 4} and element 
to be searched as 3.  Since 3 is 
present at index 2, output is 2.
 */

//geeks for geeks
class Solutionx {

    static int search(int arr[], int N, int X) {

        // Your code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                return i;
            }

        }
        return -1;

    }

    public void moveZeroes(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'moveZeroes'");
    }

}

/*
 * this method is not optimise
 */
// Scanner sc = new Scanner(System.in);
// int arr[] =new int [5];
// System.out.println("enter the number of an element");
// int key =3;
// for(int i =0;i<arr.length;i++)
// {
// arr[i]=sc.nextInt();
// }
// for(int i=0;i<arr.length;i++)
// {
// System.out.print(arr[i]+"\n");
// }
// for(int i =0;i<arr.length;i++)
// {
// if(arr[i]==key)
// {
// System.out.println("the key element present at index"+i);
// }
// }
