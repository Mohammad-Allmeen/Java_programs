
import java.util.*;
public class CommonNumber {

    public static int commonFunction(int arr[], int arr2[]){
         int n1= arr.length;
         int n2= arr2.length;
         int count=0;
         for(int i=0;i<n1;i++){
            for (int j = 0; j < n2; j++) {
                if(arr[i]==arr2[j]){
                    count++;
                    break;
                }
            }
         }
        return count;
    }

    public static int secondMethod (int[] a, int[] b) {
Set <Integer> setA = new HashSet<> ();
Set<Integer> setB = new HashSet<> () ;

for (int num : a) setA.add (num);
for (int num : b) setB.add (num) ;
setA.retainAll(setB); // Intersection
return setA.size ();
}
    public static void main(String[] args) {
        int arr[] =  {2, 3, 5, 8, 12, 10};
        int arr2[] =  {4, 3, 11, 8, 5, 6, 8, 10};

        System.out.println(commonFunction(arr, arr2));

        System.out.println(secondMethod(arr,arr2));
    }
}


