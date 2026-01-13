
import java.util.*;
class Anagram{

  public static boolean check_Anagram(String s1, String s2){
    
    if(s1.isBlank()&& s2.isBlank()){
      System.out.println("String is empty");
    return false;
    }

    if(s1.length()!=s2.length()){
      System.out.println("String length is not equal");
    return false;
    }
 
    char ch1[]= s1.toCharArray();
    char ch2[]= s2.toCharArray();

    Arrays.sort(ch1);
    Arrays.sort(ch2);

    for (int i = 0; i < ch2.length; i++) {
      if(ch1[i]!=ch2[i]){
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

/* 

public static boolean check_Anagram(String s1, String s2){

  if(s1.isBlank()&& s2.isBlank()){
    System.out.println("Cannot be Anagram, length are different or string is empty");
  }
if(s1.length()!=s2.length() && s1.isBlank()&& s2.isEmpty()){
  System.out.println("Cannot be Anagram, length are different or string is empty");
}

char c1[]= s1.toCharArray();
char c2[]= s2.toCharArray();

Arrays.sort(c1);
Arrays.sort(c2);

for (int i = 0; i < c2.length; i++) {
  if(c1[i]!=c2[i]){
    System.out.println("Is not Anagram");
    return false;
  }
}
System.out.println(Arrays.equals(c1,c2));
return true;

*/