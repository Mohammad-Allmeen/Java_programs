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