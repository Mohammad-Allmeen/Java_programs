import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeroInEnd {
  public static int [] zeroinEnd(int [] arr, int n){ 
       int arrAns[] = new int[n];
       int count=0;
        for(int i=0;i <arr.length;i++){
            if(arr[i]!=0){
            arrAns[count]=arr[i];
            count++;
            }
        }
        for (int i = count; i < arrAns.length; i++) {
            arrAns[i]=0;
        }

        return arrAns;
    }

    // 

    public static List<Integer> solvedbyArrayList(int arr[], int n){
     
        ArrayList<Integer> ans = new ArrayList<>();
        int count=0;
        for(int i:arr){
            if(i!=0){
                ans.add(i);
            } else{
                count++;
            }
        }
        for (int j = 0; j < count; j++) {
            ans.add(0);
        }
        return ans ;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter "+ n+ " number of elements in the array" );
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int arrans[]= zeroinEnd(arr, n);
        System.out.println("The ouput by first method is ");
        for (int i = 0; i < arrans.length; i++) {
            System.out.print(arrans[i]+" ");
        }

        // Second method or approach, solved by ArrayList 
      System.out.println("The output by solving the program using List: ");
       List<Integer> arrans2= solvedbyArrayList(arr, n);
       for(int i: arrans2){
        System.out.print(i+" ");
       }
    }
}
