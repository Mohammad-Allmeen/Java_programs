public class Prime_factorization {

    public static boolean check(int i){
        int count=0;
      for (int j = 2; j <= i; j++) {
        if(i%j==0){
            count++;
        }
      }
      if(count==1){
        return true;
      }
        return false;
    }
    public static void main(String[] args){
        boolean check= false;
        int n=60;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
               check= check(i);
            }
           if(check){
            System.out.println(i+" ");
           }
        }
    }
}
