import java.util.*;
public class factorial {

    public static int fact(int n ){
        return (n==0)? 1: n*fact(n-1);
        
    }


    public static String reverse(String str){
        String rev1= "";
     StringBuilder rev = new StringBuilder();
     for(int i=0; i<str.length();i++){
        rev1 = str.charAt(i)+rev1;
      rev= rev.append(str.charAt(i));
     }
     System.out.println(rev1);
     return rev.reverse().toString();
    }




    public static void main(String [] args){
        int n=5;
        int fact=1;
         for (int i=1;i<=n;i++){
            fact = fact*i;
         }
         System.out.println(fact);

         int rec= fact(n);
         System.out.println(rec);


         // Reversing the String
         String str= "Hello I am JAVA";
         String rev = reverse(str);
         System.out.println(rev);

         
    }
}
