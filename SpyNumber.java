import java.util.*;
public class SpyNumber {
    public static boolean is_SpyCheck(int n){
     int sum=0;
     int pro=1;

     while(n>0){
        int rem=n%10;
        sum+=rem;
        pro*=rem;
        n/=10;
     }

     if(sum==pro){
        return true;
     }
     return false;
    }
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int number= sc.nextInt();
if(is_SpyCheck(number))
{
    System.out.println("yes it is the SPY number");
}else{
    System.out.println("No its not");
}

}
}




