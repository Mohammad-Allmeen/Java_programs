import java.util.Arrays;

public class Supercoder {
   public static void main(String [] args){
    int n=70973521;
    String s="";
    while(n!=0){
        int n1 = n%10;
        s= n1+s;
        n=n/10;
    }
    String arr[]= s.split("");
    Arrays.sort(arr);
    String ans="";
    if(arr[0].equals("0")){
        ans = arr[1]+arr[0];
    }
    String sec="";
    for ( int i = 2; i < arr.length; i++) {
        sec= sec+arr[i];
    }
    String fin= ans+sec;
    System.out.println(fin);
    


   } 
}


// second method

// import java.util.Arrays;

// public class Supercoder {
//     public static void main(String[] args) {
//         int n = 7097564;
//         String s = "";

//         // Convert the number into a string with its digits reversed
//         while (n != 0) {
//             int n1 = n % 10;
//             s = s + n1;
//             n = n / 10;
//         }
        
//         // Convert string into character array for sorting
//         char[] arr = s.toCharArray();
//         Arrays.sort(arr); // Sorting characters in ascending order

//         // Handling the case where the first digit is '0'
//         if (arr[0] == '0') {  // Use '==' for char comparison, but equals() for strings
//             // Swap first '0' with the first non-zero element
//             for (int i = 1; i < arr.length; i++) {
//                 if (arr[i] != '0') {
//                     char temp = arr[0];
//                     arr[0] = arr[i];
//                     arr[i] = temp;
//                     break;
//                 }
//             }
//         }

//         // Convert sorted character array back to a string
//         String fin = new String(arr);
//         System.out.println(fin);
//     }
// }

