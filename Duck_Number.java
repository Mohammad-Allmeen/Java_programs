import java.util.*;
public class Duck_Number {
    // public static boolean is_duckCheck(int n){
    //     String ch= Integer.toString(n);
    //     if(ch.charAt(0)=='0'){
    //         return false;
    //     }
    // for(int i=1; i<ch.length();i++){
    //     if(ch.charAt(i)=='0'){
    //    return true;
    //     }
    // }
    // return false;
        
    // }

    public static boolean is_duckCheck(int n)
{
    while(n!=0){
        int dig=n%10;
        if(dig==0){
            return true;
        }
        n/=10;
    }
return false;

}    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int number= sc.nextInt();
if(is_duckCheck(number))
{
    System.out.println("yes it is the duck number");
}else{
    System.out.println("No its not");
}

}
}
