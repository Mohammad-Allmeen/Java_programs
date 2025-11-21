/*
 * The amicable numbers are two different numbers (a pair of numbers) so related that the sum of the proper divisors (excluding the number itself) of one of the numbers is equal to the other.
 *  A proper divisor of a number is a divisor other than the number itself. It is also known as friendly numbers.

The sum of the divisor of the first number = The sum of the divisor of the second number
The sum of the divisor of the second number = The sum of the divisor of the first number
The smallest pair of amicable numbers is (220, 284). Because:

The divisor of 220 are: 1,2,4,5,10,11,20,22,44,55,and 110

The sum of divisor of 220 is = 284

The divisor of 284 are: 1,2,4,71,142

The sum of divisor of 284 is = 220


 */


import java.util.Scanner;

public class Amicable_pair {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first and Second number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum1=0,sum2=0;
    for(int i =1;i<n1;i++){
        if(n1%i==0){
            sum1=sum1+i;
        }
    }
    for(int i =1;i<n2;i++){
        if(n2%i==0){
            sum2=sum2+i;
        }
    }
    if(n1==sum2&&n2==sum1){
        System.out.println("The number "+n1+ " and "+ n2+ " are the amicable pair");
    }else{
        System.out.println("No they are not");
    }
    }
}
