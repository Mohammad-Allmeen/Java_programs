import java.util.Scanner;

public class Unique_Number {
    public static boolean unique_check(int n){
     String num= Integer.toString(n);
     int count=0;
     for (int i = 0; i < num.length(); i++) {
        char ch= num.charAt(i);
        for (int j = 0; j <num.length(); j++) {
            if (ch==num.charAt(j)) {
             count++;   
            }
        }
        if(count==2){
            return false;
        }
        count=0;
     }
     return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check");
        int n= sc.nextInt();

        if(unique_check(n)){
            System.out.println("It is the Unique Number");

        }else{
            System.out.println("Not a Unique Number");
        }
        
    }
}
