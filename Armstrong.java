import java.util.Scanner;

public class Armstrong{
    
   public static boolean armstrong_check(int num){
    int check=num;
    String s= Integer.toString(num);
    int len= s.length();
    int sum=0;
     while(num!=0){
     int rem = num%10;
     sum=sum+ (int) Math.pow(rem, len);
     num/=10;
     }
     if(sum==check){
        return true;
     }
     
    return false;
   }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        
       // ob1.armstrong_check(number);
        if (armstrong_check(num))
        {
            System.out.println("Yes it is the armstrong number");
        }
        else
        {
            System.out.println("No it is not an Armstrong number");
        }

    }
}
