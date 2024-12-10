import java.util.Scanner;

public class Special_number {
    public int number;
    Special_number(int number_obj)
    {
        this.number = number_obj;
    
   // public void check_special(int number){
        int sum=0;
        int compare=number;
        while(number !=0 )
        {
         int fact=1;
         int digit = number%10;
         for(int i=1;i<=digit;i++){
          fact = fact *i;
         }
         sum = sum+fact;
         number = number/10;
        }
        if(sum==compare)
        {
            System.out.println("Yes it is a special number ");
        }
        else
        {
            System.out.println("not a special number");
        }
    }
   
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        Special_number ob1 = new Special_number(number);
        Special_number ob2 = new Special_number(146);
    }
    
}
