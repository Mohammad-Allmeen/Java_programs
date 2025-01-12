import java.util.Scanner;

public class Letter_Shift {

    public static void shift(String str){
       char inc, inc2, inc3;
        char ch[]= str.toCharArray();
        StringBuilder newstr= new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            char l= ch[i];
            if(Character.isLetter(l)){
                char base = Character.isLowerCase(l)? 'a': 'A';
                char decryptedletter = (char)((l-base+3)%26+ base);
                newstr = newstr.append(decryptedletter);

                //another method 
                inc= ++l;
                inc2=++inc;
                inc3=++inc2;

                System.out.print(inc3);
                
            }else{
                newstr= newstr.append(l);
            }
        }
        System.out.println();
        System.out.println(newstr);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        shift(str);
        
    }
}
