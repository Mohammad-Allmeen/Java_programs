/* 
-Binary search is one of the best efficient and optimized seraching algo which has time complxity of BigO (log n)
-Works on divide and conquer method - means divides the array and searches it
-Note- binary search only works on the sorted array, Ascending or Descending
-example in the Dictionary  
 */

import java.util.Arrays;
import java.util.Scanner;

public class Search_Binary {
    public static int check(int arr[], int s){
        Arrays.sort(arr);
        int start =0;
        int end= arr.length-1;
      int mid=0;
        while(start<=end){
            //mid= (start+end)/2;

            // Optimized way to find the mid to avoid interger overflow condition
            // as when data will be large the start and end value can be intgers maximum value that an Integer datatype can hold and when both will be added it will overflow the capacity of the integer
            mid= start +(end-start)/2; 

                if(s<arr[mid]){
                    end= mid-1;
                }else if(s>arr[mid]){
                    start= mid+1;
                }else{
                    return mid;
                }
        }
        return -1;
    }
    
    public static int binary(int arr1[], int s1, int st1, int end1){
        int mid1=0;
        if(st1<=end1){
        mid1 = st1+ (end1-st1)/2;
        if(s1<arr1[mid1]){
            return binary(arr1, s1, st1, mid1-1);
        }
        else if(s1>arr1[mid1]){
            return binary(arr1, s1, mid1+1, end1);
        }   
        else
        {
            return mid1;
        }
        }
 return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,6,9,3,7,0,2,56,32,23,12,43,12,45,25};
        System.out.println("Enter the element you want to search");
        int s= sc.nextInt();
        int n= check(arr,s);
        System.out.println("Element present at the index: " + n);

        int st=0;
        int end= arr.length-1;
        int recursion_ans= binary(arr,s,st, end);
        System.out.println("Element present at the index: "+recursion_ans);

    }
}

