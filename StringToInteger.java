import java.util.Scanner;

public class StringToInteger {
    public static int myAtoi(String s) {
      s= s.trim();
      int sign=+1;
      long ans=0;
      if(s.length()==0)
      return 0;
      if(s.charAt(0)=='-')
      {
      sign=-1;
      return 0;
      }
      int MAX= Integer.MAX_VALUE;
      int MIN = Integer.MIN_VALUE;
      int i= (s.charAt(0)=='-'|| s.charAt(0)=='+')? 1:0;
      while (i<s.length()){
      if(s.charAt(i)==' '|| !Character.isDigit(s.charAt(i)))
      {
        break;
      }
      ans = ans*10+s.charAt(i)- '0';
      if( ans> MAX) return MAX;
      if(ans< MIN) return MIN;
      }
      return (int) ans*sign;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        myAtoi(s);
    }  
}
