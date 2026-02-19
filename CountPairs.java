/*

You're given a list of numbers. Your task is to find how many pairs of numbers in that list add up to 
an even number. A pair consists of two different numbers from the list. 
For example, in the list [1, 2, 3, 4], the pairs that sum to an even number are (1, 3) and (2, 4).

*/


public class CountPairs {

    public static int countPairs(int arr[], int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            for (int j = i+1; j < n; j++) {
                if((arr[i]+arr[j])%2==0){
                    count++;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int n=6;
        int arr[]={2,2,1,7,5,3};
        System.out.println(countPairs(arr,n));
    }
}
