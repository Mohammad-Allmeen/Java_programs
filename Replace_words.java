/*
 * 25. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.

Sample string : "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown cat jumps over the lazy dog.         
 */

public class Replace_words {

    public static String replace(String str){
    String rep= "cat";
   String ars[]= str.split(" ");

   StringBuilder newStr= new StringBuilder();
   for(int i=0;i<ars.length;i++){
    if(ars[i].equals("fox")){
    newStr= newStr.append(rep).append(" ");
    }else{
        newStr= newStr.append(ars[i]).append(" ");
    }
   }
   return newStr.toString();
    }
    public static void main(String[] args){
    String str="The quick brown fox jumps over the lazy dog.";
   System.out.println(replace(str));
    }
}
