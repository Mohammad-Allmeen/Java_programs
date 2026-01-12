import java.util.Arrays;
import java.util.Scanner;

public class MissingEven {

    public static int missingEven(int arr[]){
        //Arrays.sort(arr);
       int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            for (int j = 0; j<n-1; j++) {
                if(arr[j+1]-arr[j]!=2){
                    return arr[j]+2;
                }
            }
        }
        return -1;

}
    public static void main(String[] args) {
        System.out.println("Enter the array");
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("The missing element is " + missingEven(arr));

    }
}
