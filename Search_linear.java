//time complexity of linear search in worst case is - Big o(n)
import java.util.*;
public class Search_linear {
    public static int search(int arr[], int s){
        //Arrays.sort(arr);
        if(arr.length==0){
            System.out.println("elements not in the array");
        }else{    
    for (int i = 0; i < arr.length; i++) {
        if (s==arr[i]) {
            return i;
            }
        }
    }
    return 0;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to search");
        int s= sc.nextInt();
        int result = search(arr, s);
        if(result==0){
            System.out.println("Element not found ");
        }
        else{
            System.out.println("Element found at index: "+result);
        }
        
    }
    
}
