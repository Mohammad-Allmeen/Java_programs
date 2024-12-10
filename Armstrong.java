import java.util.Scanner;

public class Armstrong{
    
   public static boolean armstrong_check(int num){
    String value= Integer.toString(num);
        int len= value.length();
     int sum= 0;
     int temp=num;
        while(num!=0){
            int digit = num%10;
            sum+= Math.pow(digit, len);
            num/=10;
        }
        if(temp==sum){
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
