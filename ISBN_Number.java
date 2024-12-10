import java.util.*;

public class ISBN_Number {
    public static boolean is_ISBN(long n){
        String str = Long.toString(n);
        int dig[] = new int[str.length()];
        for(int i =0;i<str.length();i++){
            dig[i]= Character.getNumericValue(str.charAt(i));
    }
        int sum=0;
        int j=1;
        for(int i=dig.length;i>0;i--)
        {
         sum+= j*dig[i-1];
         j++;
        }
        if(sum%11==0){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        if(is_ISBN(n)){
        System.out.println("Yes it is ISBN");
        }
        else
        {
            System.out.println("No, it is not ISBN");
        }
    }
}
/*  String str= Long.toString(n);
        int dig[]= new int[str.length()];
        for(int i=0;i<str.length();i++){
            dig[i]= Character.getNumericValue(str.charAt(i));
        } */
