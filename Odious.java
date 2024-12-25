/*
 * 2 is an odious number. Because the binary representation of 2 is 10, and 1 + 0 = 1, and 1 is an odd number.

3 is not an odious number. Because the binary representation of 3 is 11, and 1 + 1 = 2, and 2 is not an odd number.
 */

 import java.util.*;
public class Odious {
    static int n;
   Odious(int n){
    int dig=0;
        while (n>0){
            int rem= n%2;
            n= n/2;
            dig+=rem;
        }
        if(dig%2==1){
       System.out.println("Odious number");
        }
        else{
            System.out.println("Not an odious number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Odious ob1=new Odious(number);
    }
}
