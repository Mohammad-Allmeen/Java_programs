import java.util.Arrays;

public class LargestNumberForm {
         public static String largestNumber(String arr[]){

            
            Arrays.sort(arr, (a,b)-> (b+a).compareTo(a+b));

            if(arr[0].equals('0')){
                return "0";
            }

            StringBuilder str= new StringBuilder();
            for(String s: arr){
                str.append(s);
            }
            return str.toString();
         }
       public static void main(String[] args) {
        String[] arr1 = {"3", "30", "34", "5", "9"};
        System.out.println(largestNumber(arr1)); // 9534330

        String[] arr2 = {"54", "546", "548", "60"};
        System.out.println(largestNumber(arr2)); // 6054854654
    
    }
}
