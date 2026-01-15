import java.util.Scanner;

public class MagicNumber {

    public static boolean magicNumber(int n){
       String bin= "";
        while(n>0){
            int rem= n%2;
            bin=rem+bin;
            n/=2;
        }
       int sum=0;
        for (int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i)=='0'){
                sum+=1;
            }else{
                sum+=2;
            }
        }

        if(sum%2==1){
            return true;
        }
        return false;
    }
   public static void main(String[] args) {
    System.out.println("Enter the value of N");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for (int i = 0; i <=n; i++) {
        if(magicNumber(i)){
            System.out.println(i);
        }
    }
   } 
}
