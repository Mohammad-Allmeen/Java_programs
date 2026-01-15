import java.util.Scanner;

public class DecToBinary {
    public static String findBinary(int number) {
        StringBuilder result = new StringBuilder();

     while(number!=0){
     int rem= number%2;
     result= result.append(rem);
     number/=2;
     }
    return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String binaryRepresentation = findBinary(number);
        System.out.println("The binary representation of " + number + " is: " + binaryRepresentation);
    }
}









/*
 *     // Special case for 0
     if(number==0){
     return "";
    }
    StringBuilder result = new StringBuilder();
    while(number>0){
        int rem= number%2;
        result.append(rem);
        number/=2;

    }
    return result.reverse().toString();
 */