

import java.util.Scanner;

public class DecToOctal {
    public static String decToOct(int value){
        System.out.println("Hex String = " + Integer.toHexString(value));
        StringBuilder result = new StringBuilder();
        while(value>0){
            int rem= value%8;
            result = result.append(rem);
            value/=8;
        }
        return result.reverse().toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int dec= sc.nextInt();
        System.out.println("The octal value is "+ decToOct(dec));
    }
    
}
