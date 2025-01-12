public class Palindrome {
    public static boolean palindrome_number(int n){
        int num_check=n;
        int pal=0;
        while(n!=0){
            int rem = n%10;
            pal = pal*10+rem;
            n/=10;
        }
        if(num_check==pal){
        return true;
        }
     return false;
    }

    public static void palindrome_string(String str){
     String pal_str="";
        for (int i = str.length()-1; i >=0; i--) {
          pal_str= pal_str+ str.charAt(i);  
        }
        if(pal_str.equals(str)){
            System.out.println("String is Palindrome");
        }
    }
    public static void main(String [] args){
        int n = 458;
        if (palindrome_number(n)){
            System.out.println("Palindrome");
        }
        String str="madan";
        palindrome_string(str);
        

    }
}
