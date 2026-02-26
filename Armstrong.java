import java.util.Scanner;

public class Armstrong{
    
   public static boolean armstrong_check(int num){
   String str= Integer.toString(num);
   int check=num;
   int len= str.length();

   int sum=0;
 while(num!=0){
    int r= num%10;
    sum=sum+(int) Math.pow(r,len);
    num/=10;
 }
 if(sum==check){
    return true;
 }
 return false;
   }
    public static void main(String [] args){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
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

