
import java.util.*;
class Anagram{

  public static boolean check_Anagram(String s1, String s2){

   
     
    if(s1.isBlank() || s2.isBlank() || s1.length()!=s2.length()){
      return false;
    }
    

    char ch[]= s1.toCharArray();
    char ch2[]= s2.toCharArray();

   Arrays.sort(ch);
   Arrays.sort(ch2);

    for (int i = 0; i < ch2.length; i++) {
      if(ch[i]!=(ch2[i])){
       return false;
      }
    }

    

    return true;
  }


public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the first String");
  String s1= sc.nextLine();
  System.out.println("Enter the second String ");
  String s2= sc.nextLine();
  if(check_Anagram(s1, s2)){
    System.out.println("Anagram");
  }else{
    System.out.println("Not Anagram");
  }
  }
}