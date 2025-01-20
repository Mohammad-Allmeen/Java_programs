
import java.util.*;
class Anagram{
public static boolean check_Anagram(String s1, String s2){
if(s1.length()!=s2.length()){
  System.out.println("Cannot be Anagram ");
  return false;
}

s1= s1.toLowerCase();
s2= s2.toLowerCase();
char ch1[]= s1.toCharArray();
char ch2[]= s2.toCharArray();



Arrays.sort(ch1);
Arrays.sort(ch2);

for (int i = 0; i < ch1.length; i++) {
  if(ch1[i]!=ch2[i]){
    return false;
  }
}
return true;
}

public static void main(String [] args){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the first String");
  String s= sc.nextLine();
  System.out.println("Enter the second String ");
  String s2= sc.nextLine();
  if(check_Anagram(s, s2)){
    System.out.println("Anagram");
  }else{
    System.out.println("Not Anagram");
  }
  }
}

/*
 *   if(s1.length()!=s2.length()){
    System.out.println("Length of two string must be Equal");
    return false;
  }
  char c1[]= s1.toCharArray();
  char c2[]= s2.toCharArray();

  Arrays.sort(c1);
  Arrays.sort(c2);
  for (int i = 0; i < c2.length; i++) {
    if(c1[i]!=c2[i]){
      return false;
    }
  }
return true;
 */
















/* 

class Anagram{
    public static boolean checkAnagram(String str1, String str2){
      if(str1.length()!=str2.length())
      {
      System.out.println("The length of string must be equal");
        return false;
      }
        int count=0;
        int length = str1.length();
        char ch1[] = str1.toCharArray();
        char ch2[]= str2.toCharArray();
     
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i=0;i<ch1.length;i++){
            if(ch1[i]==ch2[i]){
                count++;
            }
        }
        if(str1.length()==count){
          return true;  
        }

    return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second string");
        String str2 = sc.nextLine();

       if( checkAnagram(str1, str2)){
        System.out.println("Yes it is anagram");

       }else{
        System.out.println("Not an anagram");
       }
    }
}
    */