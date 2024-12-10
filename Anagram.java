

import java.util.*;

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