/* 
QUESTION

For a given number N (0 < N <= 100), little Johnny wants to find out the minimum positive integer X divisible by N, where the sum of digits of X is equal to N, and X is not equal to N

Note: If such a number X does not exist then output should be -1.

Input Specification:

input1: An integer N

Output Specification:

Return the minimum positive integer X

Example 1:

input1: 9

Output: 18

*/


import java.util.Scanner;

public class MinimumDivisbleAddition{

    public boolean sumOfDigit(int n, int number){
        int sum=0;
        while(n>0){
            int rem= n%10;
            sum=sum+rem;
            n/=10;

        }
        if(sum==number){
         return true;
        }
        return false;
    }

    public int func(int n){
        for (int i = n+1; i < 100000; i++) {
            if (i%n==0 && sumOfDigit(i, n)) {
             return i;  
            }
        }
    return -1;
}
public static void main(String[] args) {
    System.out.println("Enter the Integer number");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    MinimumDivisbleAddition ob = new MinimumDivisbleAddition();
    int value= ob.func(n);
    System.out.println(value);
}
}