import java.util.Scanner;

public class String_to_Array {
    public static void reverse(String str){
    str= str.trim();
    String rev="";
    String arr[]= str.split(" ");
    for (int i = 0; i<arr.length; i++) {
        String string = arr[i];
        for (int j = 0; j < string.length(); j++) {
            rev= string.charAt(j)+ rev;
        }
        System.out.print(rev+ " ");
        rev="";
    }
    }
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();
    reverse(str);

    String str1= "Hello ";
    String s[]= str1.split(" ");
   
}
}

//when method is final in java you will not be able to override 
//when there is static class in java you cannot inherit it