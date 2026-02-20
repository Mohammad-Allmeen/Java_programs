public class GoodNumber {

    public static boolean check(int n){
        
        if(n<10 && n!=0){
            if(n%n==0){
                return true;
            }
        }
        else{
            int sum=0;
            int num=n;
        while(n!=0){
         int d=n%10;
         sum=sum+d;
         n/=10;
        }
        if(num%sum==0){
            return true;
        }
        }
        
        return false;
    }
    public static void main(String[] args) {
        int n=18;
      boolean checkAns= check(n);
      System.out.println(checkAns);
    }
}
