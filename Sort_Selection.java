import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Sort_Selection {

    public static void SelectionSort(int arr[], int n, int arr2[]){
        int minIndex =0;
        for (int i = 0; i < n-1; i++) {
            minIndex=i;
         for(int j=i+1;j<n;j++){
            if(arr[j]< arr[minIndex])
            {
                minIndex = j;
            }
        }
            int temp = arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i]=temp; 
        }
    
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


     //Sorting with Arrays.sort function and using different loop
     System.out.println("Sorting with Arrays.sort function and using different loop");
        Arrays.sort(arr2);
        for(int num : arr2){
            System.out.println(num +" ");
        }
    
    }
           public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of element you want to enter");
     int n = sc.nextInt();
     int arr[] = new int[n];
     for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
     }
   
    //  for (int i = 0; i < n; i++) {
    //     arr[i] = sc.nextInt();
    //  }

    int arr2 [] ={4,6,2,9,1};
    SelectionSort(arr, n, arr2);
      
    }
}
