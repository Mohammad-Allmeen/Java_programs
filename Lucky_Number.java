
public class Lucky_Number {
    
public static int  count =2; 
    Lucky_Number(int  number)
    {
        if (is_lucky(number))
        {
            System.out.println("lucky number ");
        }
        else
        {
            System.out.println("Not a lucky number");
        }
    }
 public static boolean is_lucky(int number)
 {
int count =0;
if(count>number)
{
    return true;
}
 else if(number%count==0){
return false;
 }
 else{
number = number -(number/count);
count++;
return is_lucky(number); // Recursive function where the function is calling itself
} 
  }
    public static void main(String [] args){
        int  number= 8;

        Lucky_Number ob1= new Lucky_Number(number);

    }
}
