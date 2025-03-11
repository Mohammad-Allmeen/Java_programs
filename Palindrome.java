class Palindrome {

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

     //1st Way
     for (int i = 0; i<str.length(); i++) {
        pal_str=str.charAt(i)+pal_str; 
      }
      System.out.println(pal_str);

      //2nd Way
     
      String pal_str2="";
        for (int i = str.length()-1; i >=0; i--) {
          pal_str2= pal_str2+ str.charAt(i);  
        }
        System.out.println(pal_str2);
        if(pal_str2.equals(str)){
            System.out.println("String is Palindrome");
        }
    }

    public static void palindrome_in_range(int l, int u){
        
         for (int i = l; i<=u; i++) {
            int num=i;
            int pal= 0;
            while(num!=0){
                int d=num%10;
                pal=pal*10+d;
                num/=10;
            }
            if(i==pal){
                System.out.print(i+" ");
            }
            
         }
    }
    public static void main(String [] args){
        int n = 454;
        if (palindrome_number(n)){
            System.out.println("Palindrome");
        }

        String str="Tech Mahindra";
        palindrome_string(str);
        int l=10;
        int u=50;
        palindrome_in_range(l,u);
    }
}


