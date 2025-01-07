// Binary -> Decimal -> Octal
import java.util.Scanner;

public class BinToOctal {
    public static int bintoDec(int value){
       int i=0;
       int dec=0;
        while(value>0){
            int rem= value%10;
            dec=dec+(int) Math.pow(2,i++)* rem;
            value/=10; 
        }
    return dec;
    }
    public static String binToOct(int value){
       int dec= bintoDec(value);
       StringBuilder oct = new StringBuilder();
       while(dec>0){
         int rem=dec%8;
         oct= oct.append(rem);
         dec/=8;
       }
       return oct.reverse().toString();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int bin= sc.nextInt();
        System.out.println("The decimal value is "+ binToOct(bin));


    }
    
}
