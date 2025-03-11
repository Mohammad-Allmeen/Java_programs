import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class prep_placement {
    public static int[] sort(int arr[], int n){
        int arrans[]= new int[n];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
           arrans[j++]= arr[i];
        }
 return arrans;
    }

    // to find second largest and second smallest number
public static void find(int arr[]){
   // Arrays.sort(arr);
    int n=arr.length;
    //Bubble sort
   for(int i=0;i<n;i++){
    for(int j=0;j<n-i-1;j++){
     if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
     }
    }
   }
    System.out.println(arr[1]);
    System.out.println(arr[arr.length-1]);
}
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
       int arrans[]= sort(arr, n);
       for (int i = 0; i <arr.length; i++) {
        System.out.println(arrans[i]);
    }

       // to find second largest and second smallest number
       int arrFind[]={34,10,5,6,49};
       find(arrFind);

       // to find the frequency of the array
       int freq[]= {11,12,11,13,15,16,12,14,13};

       HashSet<Integer> set= new HashSet<>();
       for (int i = 0; i < freq.length; i++) {
        int count=0;
        if(!set.contains(i)){
            for (int j = 0; j < freq.length; j++) {
                if(freq[i]==freq[j]){
                    count++;
                    set.add(j);
                }
            }
            System.out.println(freq[i]+" "+count);
        }
       }
    }
}
