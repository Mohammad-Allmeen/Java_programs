import java.util.Scanner;

class Hide_Credit{

//1st Approach 

    public static String hide_number(long number){
      String lastFour ="";
        for (int i = 0; i <=3; i++) {
            long value = number%10;
           lastFour= value+ lastFour ;
            number/=10;
        }
        lastFour = "XXXX-XXXX-XXXX-"+ lastFour;
        return lastFour;
    }

// 2nd Approach 
    public static void string_approach(String str){
        String last_four= str.substring(12,16);
        String output= "XXXX-XXXX-XXXX-"+last_four;
        System.out.println(output);

//  another way
        String x="XXXX-XXXX-XXXX-";
        String output2= x.concat(last_four);
        System.out.println(output2);
    }
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Credit card number");
    long number = sc.nextLong();

     String output= hide_number(number);
     System.out.println(output);

     // another approach to solve it by taking the card number as String
     String str= "1234567890123457";
     System.out.println(str.substring(11,15)); // clarifying that the substring starts from 0 or 1 therefore it starts from 0
     string_approach(str);
    }
}


