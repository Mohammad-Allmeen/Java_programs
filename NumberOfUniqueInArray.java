import java.util.HashSet;

public class NumberOfUniqueInArray {

    public static int functionUnique(int arr[]){

        HashSet<Integer> set= new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int size= set.size();

        return size;

    }

    public static boolean functionCheck(int arr[]){
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1]){
             count++;
            }
        }
        if(count==arr.length-2){
        return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]= {5,5,4,3,3,2,2,1,-1,-1};
        System.out.println(functionUnique(arr));

        int arr2[]= {5,6,7,1,2,3,4};
       System.out.println( functionCheck(arr2));
    }
}
