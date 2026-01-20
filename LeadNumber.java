import java.util.Scanner;
public class LeadNumber {
    int num;
    LeadNumber(int n){
     num=n;
     int sumeven=0;
     int sumodd=0;
     while(num!=0){
        int rem=num%10;
        if(num%2==0){
            sumeven+=rem;
            num/=10;
        }
        else{
            sumodd+=rem;
            num/=10;
        }
     }
     if(sumeven==sumodd){
        System.out.println("Lead number");
     }else{
        System.out.println("Not Lead");
     }
    }
   public static void main(String args[] ){
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    LeadNumber ob= new LeadNumber(n);
   } 
}
