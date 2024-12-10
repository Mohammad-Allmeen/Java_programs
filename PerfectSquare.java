import java.util.*;
public class PerfectSquare {
    public static boolean is_check(int n){
        double sqrt= Math.sqrt(n);
        return ((sqrt-Math.floor(sqrt))==0);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    if(!is_check(n)){
        System.out.println("Not a Perfect sqaure");
    }
    else{
        System.out.println("Perfect Square");
    }
    
    }
}
