import java.util.Scanner;

public class ArrayTo_String
{
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        String arr[]= new String[3];
        System.out.println("Enter the Array");
        for (int i = 0; i < arr.length; i++) {
             arr[i]= sc.nextLine();
        }
         String string2= "";
         StringBuilder str = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            
            str= str.append(arr[j]).append(" ");
            
            //second method
            string2= string2 +arr[j]+" ";
        }
      System.out.println(str);
      System.out.println(string2);

    }

}