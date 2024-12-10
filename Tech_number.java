import java.util.Scanner;

public class Tech_number {
    public static boolean is_check(int n){
        int count=0;
        int first_half=0, second_half=0;
        int dig=n;
        int total=0;
    while(n>0){
        count++;
        n=n/10;
    }
    if(count%2==0){
        int pow= count/2;
        second_half= dig% (int)(Math.pow(10, pow));//(int) because Math.pow return double datatype
        first_half = dig/ (int) (Math.pow(10, pow));
        total = (first_half+second_half)*(first_half+second_half);
    }
    if(total ==dig){
        return true;
    }

    return false;
    }
    public static void main(String [] args){
       // Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        for (int i = 1; i < 100000; i++) {
       if (is_check(i)){
        System.out.println(i+ " is Technical number");
       }
       
    }}
    }

