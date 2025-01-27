public class Insert_In_Array {

public static void insert_At_any(int arr[], int n, int value){

    int len= arr.length;

     int arrFinal[]= new int[len+1];

    for (int i = 0; i < n-1; i++) {
        arrFinal[i]=arr[i];
    }

    arrFinal[n-1]=value;
    for (int i = n; i < arrFinal.length; i++) {
        arrFinal[i]= arr[i-1];
    }

    for (int i = 0; i < arrFinal.length; i++) {
       System.out.print(arrFinal[i]+ ", "); 
    }
}
    public static void main(String[] args){
       int arr[]= {1,6,4,8,4,2};
       insert_At_any(arr, 5,5);
//        int n= arr.length;
//        int arr1[]= new int[n+2];
//        int beg= 5;
//        int end=10;
//        arr1[0]=beg;
// arr1[arr1.length-1]=end;

// for(int i=0;i<arr1.length-2;i++){
//    arr1[i+1]=arr[i];
// }

// for(int i=0;i<arr1.length;i++){
//    System.out.print(arr1[i]+", ");
//  }
 

//     }
    }

}
