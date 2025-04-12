import java.util.Scanner;

public class Pronic_number {
    public static void isPronic(int number) {
        for(int i=1;i<=number/2;i++){
            if(i*(i+1)==number){
                System.out.println("Pronic");
                break;
            }
        if(i==number/2){
System.out.println("Not Pronic");
        }
        } 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number");
        int number= sc.nextInt();
        isPronic(number);
    }
}