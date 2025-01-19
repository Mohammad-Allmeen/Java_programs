public class Sum_Two_Prime {
    
    public static boolean isPrime(int num){
        for (int i = 2; i <=num/2; i++) {
            if(num%i==0){
             return false;
            }
        }
      return true;
    }

    public static boolean check(int n){
    for (int i = 2; i < n; i++) {
        int complement = n-i;
        if(isPrime(i)&& isPrime(complement)){
            System.out.println("The number can be represented as "+ i +" and " + complement);
            return true;
        }
    }
    System.out.println("Cannot be represented");
    return false;
    }

    public static void main(String[] args){
        int n=11;
        check(n);

        
    }
}


/*
 * import java.util.*;

public class Solution {

       static boolean prime(int n) {

              if (n <= 1)
                     return false;

              for (int i = 2; i * i <= n; i++) {
                     if (n % i == 0) {
                            return false;
                     }
              }

              return true;
       }

       static boolean isPrime(int n) {

              if (prime(n) && prime(n - 2)) {
                     return true;
              } else {
                     return false;
              }
       }

       public static void main(String[] args) {

              int n = 19;

              if (isPrime(n)) {
                     System.out.println("Yes");
              } else if (isPrime(n)) {
                     System.out.println("No");
              }
       }
}
 */