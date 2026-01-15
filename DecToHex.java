import java.util.Scanner;

public class DecToHex {

    public static char alphavalue(int rem){
       char ch;
      switch(rem){
          case 10:
          ch='A';
          break;
          case 11:
          ch='B';
          break;
          case 12:
          return 'C';  //we can use return also 
          case 13:
          ch='D';
          break;
          case 14:
          ch='E';
          break;
          case 15:
          return 'F';
         // break;
          default:
          ch='0';
      }
        return ch;
    }
    public static String decToHex(int dec){
       StringBuilder hex = new StringBuilder();
        while (dec>0){
            int rem = dec%16;
            if(rem<10){
                 hex= hex.append(rem);
                 dec/=16;
            }
            else{
             hex=hex.append(alphavalue(rem));
             dec/=16;
            }
        }
        return hex.reverse().toString();
    }
     public static void main(String [] args)
     {
        Scanner sc = new Scanner(System.in);
        int dec= sc.nextInt();
        System.out.println("The Hexadecimal value is "+ decToHex(dec));
    }
}
