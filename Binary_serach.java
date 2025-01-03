import java.util.Arrays;
import java.util.Scanner;

public class Binary_serach {
public static void bubble_sort(int arr[]){
    int n= arr.length;
for (int i = 0; i < n-1; i++) {
    for (int j = 0; j <n-1-j ; j++) {
      if(arr[j]>arr[j+1]){
      int temp = arr[j];
      arr[j]=arr[j+1];
      arr[j+1]= temp;
      }  
    }
}
}

    public static void binary_serach(int arr[], int target)
    {
   int st= 0;
   int end= arr.length-1;
   int mid;
   while(st<=end){
    mid= st + (end-st)/2;
    if(target>arr[mid]){
        st= mid+1;
    }else if (target<arr[mid]) {
        end=mid-1;
    }else{
        System.out.println("The element "+target+ "present at index "+mid);
        break;
    }
   }
    }
    
public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    int arr[]= new int[5];
    System.out.println("Enter the array");
    for (int i = 0; i < arr.length; i++) {
        arr[i]= sc.nextInt();
    }
    //Arrays.sort(arr);
    System.out.println("Enter the target value to search");
    int target = sc.nextInt();
    bubble_sort(arr);
    binary_serach(arr, target);   
}
    
}

