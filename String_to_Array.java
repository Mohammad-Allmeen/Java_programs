import java.util.Scanner;

public class String_to_Array {
    public static void reverse(String str){
     str=str.trim();
     String rev="";
    String arr[]= str.split(" ");
    for (int i = arr.length-1; i>=0; i--) {
        String word= arr[i];
       for (int j = 0; j < word.length(); j++) {
        rev = word.charAt(j)+rev;
       }
       System.out.print(rev+" ");
       rev="";
    }
    }
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    reverse(str);
}
}

 