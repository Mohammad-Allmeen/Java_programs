import java.util.Scanner;

class Hide_Credit{
    public static String hide_number(long number){
        int j=0;
       String lastfour= "";
        for (int i = 0; i <4; i++) {
            long n= number%10;
            lastfour=  n+lastfour;
            number/=10;
        }
        lastfour= "XXXX-XXXX-XXXX-"+ lastfour;
        return lastfour;
    }

    public static void string_approach(String str){
        String last_four= str.substring(12,16);
        String output= "XXXX-XXXX-XXXX-"+last_four;
        System.out.println(output);

        //another way
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

     // another approach to solve iT by taking the card number as String
     String str= "1234567890123456";
     System.out.println(str.substring(0));
     string_approach(str);
    }
}