/*
 * Example 1:
Input: string=”abcdefghij google microsoft”
Output: google
Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words

Example 2:
Input: string = “cameron blue”
Output: -1
Explanation: No word has more than 1 letter.
 */

import java.util.*;

public class Repeated_letters_words {
    public static void find(String s){
       

        String maxLetter_rep= "";
        s= s.trim();
        int maxInt=0;
    String arr[]= s.split(" ");
    for (int i = 0; i < arr.length; i++) {
        String word= arr[i];
        int count=1;
        for (int j = 0; j <word.length(); j++) {
           for (int j2 = 0; j2 < word.length(); j2++) {
            if(word.charAt(j)==word.charAt(j2) && j!=j2){
                count++;
            }
           }
           
         if(count>maxInt){
         maxInt=count;
         maxLetter_rep= arr[i];
         }

        }
        
    }
    System.out.println(maxLetter_rep);
    }
    public static void main(String[] args){
     String s= "Google headquarter is in America";
     find(s);
    }
}
