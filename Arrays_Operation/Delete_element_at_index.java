package Arrays_Operation;

public class Delete_element_at_index {
    public static void main(String[] args) {
        int arr[ ]={1,2,3,4,5,6,7};
        int n = arr.length;

        int index = 3;

        //element 1  2   3   4   5   6   7
        //index   0  1   2   3   4   5   6

        //if i want to delet the element at Index 3 so our array will look like

        //element 1  2   3   5   6   7   
        //index   0  1   2   3   4   5   6 -> this index value is shifted towards left side
        //so after shifting in the left side our array length is less by one so we can reduce the length doing the operation n--;

        for(int i =index;i<n-1;i++)
        {
                arr[i]=arr[i+1];
        }
        n--;

        for (int i =0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        



    }
}
