import java.util.Arrays;
import java.util.Scanner;

public class ArrayTo_String
{
    public static void main(String [] args){
        
    Scanner sc= new Scanner(System.in);
    String arr[]= new String[2];
    for (int i = 0; i < arr.length; i++) {
        arr[i]= sc.nextLine();
    }
     String str="";
     StringBuilder string2 = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
        // 1st Method
        string2= string2.append(arr[i]).append(" ");

        // 2nd Method
        str= str+ arr[i]+" ";

    }
    str= str.trim();
      System.out.println(str);//Output-  Hello today is Monday 
      System.out.println(string2); //Output-  Hello today is Monday

      
      // 3rd Method
      String string3= Arrays.toString(arr);
      System.out.println(string3);//Output-   [Hello, today, is, Monday]


      // equals and equalsIgnoreCase
     String comp = "Hello today";
     System.out.println(comp.equals(str));
    }

}