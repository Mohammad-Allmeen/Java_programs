import java.util.ArrayList;

public class ShitingBykPositions {

    public static ArrayList<Integer> shiftingFunction(int arr[], int k){
        ArrayList<Integer> result =new ArrayList<>();
        int len= arr.length;
        k= k%len; //if k is greater then length

        // reversing the entire array
        reverse(arr, 0, len-1);

        //reversing the first k element
        reverse(arr, 0, k-1);

        //reversing after k to end

        reverse(arr, k, len-1);

        for(int n: arr){
            result.add(n);
        }
return result;
    }

    public static void reverse (int arr[], int start, int end){

        while (start<end){
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
         int arr[]={1,2,6,9,3,7,0,2};
        int k=3;
        System.out.println(shiftingFunction(arr,k));

    }
}
