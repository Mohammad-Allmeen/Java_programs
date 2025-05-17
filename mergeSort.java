import java.util.Scanner;

public class mergeSort {

    public static void conquer(int arr[], int si, int mid, int ei){

    int merged[]= new int[ei-si+1]; // another array to store the sorted elements

    int idx1=si;
    int idx2=mid+1;
    int x=0; // to track the index of merged array

    while (idx1<=mid && idx2<=ei) {
       if(arr[idx1]<=arr[idx2]){  // comparing between the divided elements
        merged[x++]= arr[idx1++];
       }else{
        merged[x++]= arr[idx2++];
       }
    } 

    while (idx1<=mid){
        merged[x++]= arr[idx1++];
    }

    while (idx2<=ei){
        merged[x++]= arr[idx2++];
    }

    for (int i = 0,j=si; i < merged.length; i++,j++) {
        arr[j]=merged[i];
    }
    }


    public static void divide(int arr[], int si, int ei){  // method to divide the arr into different parts

        if(si>=ei){
         return;
        }
    int mid= si+ (ei-si)/2;   // calculating mid like this to avoid the memory overflow and spac complexity comstraint
    divide(arr, si, mid);
    divide(arr, mid+1, ei);
    conquer(arr, si, mid, ei); 
    }
    public static void main(String[] args){
 int arr[]= {5,3,2,4,8,9,0,1};

divide(arr, 0, 7);

for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
}
    }
}
