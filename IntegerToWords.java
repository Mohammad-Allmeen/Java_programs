

import java.util.*;

public class IntegerToWords {

    static String[] small = {
        "zero","one","two","three","four","five","six","seven","eight","nine",
        "ten","eleven","twelve","thirteen","fourteen","fifteen",
        "sixteen","seventeen","eighteen","nineteen"
    };

    static String[] tens = {
        "", "", "twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty", "ninety"
    };

      public static String convert(int n){
      
        int thousand= n/1000;
        int hundred= (n/100)%10;
        int lastTwo= n%100;

        String result="";
        if(thousand>0){
            result+=small[thousand]+" thousand ";
        }

        if(hundred>0){
            result+=small[hundred]+ " hundred ";
        }

        if(lastTwo>0){
            if(lastTwo<20){
                result+=small[lastTwo];
            }
            else{
                result+= tens[lastTwo/10];
                result+=small[lastTwo%10];

            }
        }
        
     return result;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            System.out.println(convert(n));
        
    }
}

