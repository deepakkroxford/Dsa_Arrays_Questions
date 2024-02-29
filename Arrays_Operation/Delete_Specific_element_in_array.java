 package Arrays_Operation;

class Delete_Specific_element_in_array {
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
     int ans[] =new int[arr.length-1];
     int j =0;
    int num =3;

    
    for(int i =0;i<arr.length;i++)
    {
        if(arr[i]!=num)
        {
            ans[j]=arr[i];
            j++;
        }
    }
    

    for (int i : ans) {
        System.out.println(i);
    }

    



   
    

    
}
    
}