// Binary -> Decimal -> Octal
import java.util.Scanner;

 class BinToOctal {

    public static int binToDec(int b){
        int i=0, dec=0;
        while(b!=0){
        int rem= b%10;
        dec+= (int) Math.pow(2,i)*rem;
        b/=10;
        i++;
        }
        return dec;
    }
    public static String binToOct(int bin){
      int dec= binToDec(bin);
      StringBuilder oct= new StringBuilder();
      while(dec!=0){
        int rem= dec%8;
        oct= oct.append(rem);
        dec/=8;
      }
      return oct.reverse().toString();
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int bin= sc.nextInt();
        System.out.println("The Octal value is "+ binToOct(bin)); // binary-> Decimal->Octal


    }   
}

