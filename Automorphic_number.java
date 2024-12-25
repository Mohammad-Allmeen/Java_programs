import java.util.*;
public class Automorphic_number {
    static int n;
    Automorphic_number(int n){
        int square = n*n;
        boolean value= true;
        while(n>0){
        if(n%10!=square%10){
        value =false;
        break;
        }
        n=n/10;
        square=square/10;
        }
        if(value){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not Automorphic");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Automorphic_number ob1=new Automorphic_number(number);
    }
}
