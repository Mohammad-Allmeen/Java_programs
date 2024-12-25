import java.util.Scanner;

public class Amicable_pair {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first and Second number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum1=0,sum2=0;
    for(int i =1;i<n1;i++){
        if(n1%i==0){
            sum1=sum1+i;
        }
    }
    for(int i =1;i<n2;i++){
        if(n2%i==0){
            sum2=sum2+i;
        }
    }
    if(n1==sum2&&n2==sum1){
        System.out.println("The number "+n1+ " and "+ n2+ " are the amicable pair");
    }else{
        System.out.println("No they are not");
    }
    }
}
