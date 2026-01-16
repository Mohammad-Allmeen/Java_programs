/* 

Minimum Coins Required
Given an array coins[] of size N and a target value V, where coins[i] represents the coins of different denominations. You have an infinite supply of each of coins. 
The task is to find minimum number of coins required to make the given value V. If it’s not possible to make a change, print -1.

Examples:
Input: coins[] = {25, 10, 5}, V = 30
Output: Minimum 2 coins required. We can use one coin of 25 cents and one of 5 cents.
Input: coins[] = {9, 6, 5, 1}, V = 11
Output: Minimum 2 coins required. We can use one coin of 

*/

import java.util.Arrays;



public class MinimumCoinsRequired {
    public static int findMin(int arr[], int v){

     int sum=arr[arr.length-1];
    for (int i = 0; i < arr.length; i++) {
        if(sum+arr[i]==v){
            System.out.println("Minimum two coins required");
            return 0;
        }
    }
    int n=0;
    for (int i = arr.length-1; i >=0 ; i--) {
        if(sum+arr[i]<v){
            sum+=arr[i];
            n=i;
        }
    }
   

       for (int i = arr.length-1; i >=0 ; i--) {
        if(sum+arr[i]==v&& i!=n){
           System.out.println("3 coins required");
        }
  
}
  return 0;
    }
  public static void main(String[] args) {
    int v=15;
    int arr[]={9, 6, 5, 1};
    Arrays.sort(arr);
    findMin(arr,v);
   

  }  
}
