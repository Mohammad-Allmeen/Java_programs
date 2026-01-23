import java.util.Scanner;

public class Special_number {
    public int number;
    Special_number(int number_obj)
    {
        this.number = number_obj;
    
   // public void check_special(int number){
      
      int sum=0;
     int check = number;
      while(number>0){
        int rem=number%10;
        int fact=1;
        for (int i = 1; i <=rem; i++) {
            fact*=i;
        }
        sum+=fact;
        number/=10;
      }
      if(sum==check){
        System.out.println("Special number");
      }else{
        System.out.println("Not a Special Number");
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
