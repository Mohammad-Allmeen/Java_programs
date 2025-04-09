import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeroInEnd {
    public static int[] zeroinEnd(int []arr, int n){
        int arrans[]= new int[n];
        int count=0;
        int zeroCount=0;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i]!=0){
         arrans[count]=arr[i];
         count++;
          }
          else{
            zeroCount++;
          }  
        }
        for (int i = count; i < count+zeroCount; i++) {
            arrans[i]=0;
        }
        return arrans;
    }

    // 

    public static List<Integer> solvedbyArrayList(int arr[], int n){
    ArrayList<Integer> newarr= new ArrayList<>();
    int count=0;  
    for(int i : arr){
    if(i!=0){
        newarr.add(i);
    }
    else{
        count++;
    }
    }
    for (int j = 0; j < count; j++) {
        newarr.add(0);
    }
    return newarr;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int arrans[]= zeroinEnd(arr, n);
        for (int i = 0; i < arrans.length; i++) {
            System.out.print(arrans[i]+" ");
        }

        // Second method or approach, solved by ArrayList 

       List<Integer> arrans2= solvedbyArrayList(arr, n);
       for(int i: arrans2){
        System.out.print(i+" ");
       }
    }
}
