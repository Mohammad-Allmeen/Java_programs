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
