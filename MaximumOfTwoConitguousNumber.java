/*


arr = [4, 3, 1, 5, 6]

Output - 9

arr = [4, 4, 1, 2, 5]

Output - 8 
*/


public class MaximumOfTwoConitguousNumber {

    public static int functionMax(int arr[]){
      int max=Integer.MIN_VALUE;
       int add=0;

       for (int i = 0; i < arr.length-1; i++) {
         add= arr[i]+arr[i+1];
        if(add >max){
            max= add;
        }
       }
        return max;
    }
    public static void main(String[] args) {
        
        int arr[] =  {4, 3, 8, 5, 6};
        System.out.println(functionMax(arr));
    }
}
