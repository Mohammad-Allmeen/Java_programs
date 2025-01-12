import java.util.Scanner;

public class Max_IN_Array {
    public static int maximum(int arr[], int n){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]> max){
                max= arr[i];
            }
        }
        return max;
    }
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
         arr[i]= sc.nextInt();
    }
    int max= maximum(arr, n);
    System.out.println("The max number in the array is "+max);
   } 
}
