import java.util.Scanner;

public class BinarytoDecimal {
    public static int binToDec(int value){
        int dec=0;
        int i=0;
        while(value>0){
            int rem= value%10;
            dec=dec+ (int) Math.pow(2,i)*rem;
            i++;
            value/=10;
        }
        return dec;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int bin= sc.nextInt();
        System.out.println("The decimal value is "+ binToDec(bin));
    }
    
}
