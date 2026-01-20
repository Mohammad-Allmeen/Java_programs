/* 
Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/


public class Substring_check {
  public static int strStr(String str, String sub){

    // for (int i = 0; i < str.length(); i++) {
   // String temp = str.substring(i,i+sub.length());
    //     if(str.substring(temp.equals(sub)){
    //         return i;
    //     }
    // }
    // return 1;  
    
    int len1= str.length(), len2= sub.length();
    
 for (int i = 0; i < len1; i++) {
    
    if(i+len2<=len1 && str.substring(i, i+len2).equals(sub) ){
        return i;
    }
 }

    return -1;
}
public static void main(String[] args){
String hayStack= "aadbutsad";
String needle= "sad";
int index= strStr(hayStack, needle);
System.out.println(index);
}
    }




/* 
public int strStr(String haystack, String needle) {
    // for(int i =0;i<haystack.length()-needle.length();i++){
    // if(haystack.substring(i, i+ needle.length()).equals(needle)){
    //     return i;
    // }
    // }
    // return -1;
    if(needle.isEmpty()){
        return 0;
    }
    int len1= haystack.length();
    int len2= needle.length();

    for (int i =0; i<= len1-len2;i++){
        int j=0;
        while(j<len2 && haystack.charAt(i+j)==needle.charAt(j))
        {
            j++;
        }
        if(j==len2){
            return i;
        }
    }
    return -1;

    */