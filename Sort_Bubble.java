import java.util.Arrays;
import java.util.Scanner;

public class Sort_Bubble {

    public static void BubbleSort(int arr[], int n, int arr2[]){
        for(int i=0;i<n;n++){
            for(int j=0;j<n-i-j;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
    BubbleSort(arr, n, arr2);
      
    }
}
/*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        } */