// Program to represent the number in two prime number sum example 74= 71+3 both are prime

public class Sum_Two_Prime {
   public static boolean isPrime(int n){

    for (int i = 2; i <=n/2 ; i++) {
        if(n%i==0){
            return false;
        }
    }
    return true;
   }

    public static void check(int n){

        for (int i = 2; i < n; i++) {
            int complement= n-i;
            if(isPrime(i) && isPrime(complement)){
                System.out.println("yes the number can be presented as "+ i +" and "+ complement);
                return;
            }
        }
        System.out.println("Cannot be represented");
    }
  
    public static void main(String[] args){
        int n=12;
        check(n);
    }
}


/*
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

*/