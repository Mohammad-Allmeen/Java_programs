public class Insert_In_Array {

public static int[] insert_At_any(int arr[], int n, int value){
    
    int arr2[]= new int[arr.length+1];

    for (int i = 0; i < n; i++) {
        arr2[i]= arr[i];
    }
    arr2[n-1]=value;
    for (int i = n; i < arr2.length; i++) {
        arr2[i]=arr[i-1];
    }

    for (int i : arr2) {
        System.out.print(i+", ");
    }

    return arr2;
}
    public static void main(String[] args){
       int arr[]= {1,6,4,8,4,2};
       insert_At_any(arr, 5,5);
      
    }

}

