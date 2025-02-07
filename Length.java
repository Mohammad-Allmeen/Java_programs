import java.util.Arrays;

public class Length {
    public static void main(String[] args){
        String s= "Hello World!";
        int arr[]= {1,2,6,8,5,3,6,9};
    
        int index = Arrays.binarySearch(arr, 8);// inbuilt method in java to do binary search
        int arr1[]= new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
           System.out.println();
        }
        System.out.println(index);
        System.out.println(s.length());
        System.out.println(arr.length);
        System.out.println(s.substring(1, 6));

        int a = 12, b = 25;
        int bitiseAND= a&b;
        int bitiseOR= a|b;
        int bitiseXOR= a^b;
        System.out.println(("Bitwise AND Output "+bitiseAND));
        System.out.println("Bitwise OR Ouput "+ bitiseOR);
        System.out.println("Bitwise XOR Ouput "+ bitiseXOR);

    }
}
