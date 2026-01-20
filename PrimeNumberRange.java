public class PrimeNumberRange {
       public static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
       }


     public static void main(String [] args){
        int l1=10;
        int l2=20;
         int count=0;
  
            for (int j = l1+1; j <l2; j++) {
            for (int i = 2; i < l2; i++) {
                if(j%i==0 && i<j){
                    count++;
                }
            }
            if (count==0) {
                System.out.println(j);
            }
            count=0;
            }


            // Another approach to solve this problem
            System.out.println("The prime numbers are");
            for (int i = l1; i < l2; i++) {
               if(isPrime(i)){
                System.out.println(i);
               } 
            }
    }
}




