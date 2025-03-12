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

// to find the frequency of elements in a array
public static void frequency(int freq[])
{
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


//MEDIAN-to find median if n is odd then middle digit and if n is even then avg of 2 middle elements
public static void median(int arr[]){
    int l=arr.length;
    int mid= l/2;
    int median=0;
     if(l%2==0){
         median= (arr[mid-1]+arr[mid])/2;
         System.out.println("Median is "+ median);
     }
     else{
        System.out.println(arr[mid]); 
     }
}
    public static void main(String args[]){

// 1. To reverse the elements of the array
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

// 2. to find second largest and second smallest number
       int arrFind[]={34,10,5,6,49};
       find(arrFind);

//3. to find the frequency of the array
       int freq[]= {11,12,11,13,15,16,12,14,13};
    frequency(freq);

//4.  to find median if n is odd then middle digit and if n is even then avg of 2 middle elements
     median(freq);
    }
}
