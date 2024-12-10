
import java.util.*;
class first
{
    public static void frequency(String str){
       int leng= str.length();
       int minfrq = Integer.MAX_VALUE;
       char minChar = str.charAt(0);

       //first loop/outer loop
       for (int i = 0; i < leng; i++) 
       {
        char currentChar = str.charAt(i);
       int count =0;
    //second loop/inner loop
    for(int j=0; j<leng;j++){
     if (currentChar==str.charAt(j)) {
        count++;
     }//end of if condition
    }//end of inner loop

    if (count < minfrq || (count==minfrq && str.indexOf(currentChar) < str.indexOf(minChar) )) {
        minChar=currentChar;
        minfrq=count;
    }
       }
System.out.println("the minimum freq char is " + minChar);
       
    }
    public static void main(String args []){ 
        System.out.println("Enter the characters");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        frequency(str);
    }
}