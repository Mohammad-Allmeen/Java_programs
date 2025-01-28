/*
 * Given a string s, return the longest 
palindromic
 
substring
 in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */

public class Longest_Palindromic_substring {
    
        public static boolean isPalindrome(String str, int start, int end){
            while (start< end){
                if (str.charAt(start)!= str.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
        public static String longestPalindrome(String s) {
            int len = s.length();
            int maxlength= 0;
            String longestPalindrome="";
    
            for(int i =0;i<len;i++){
                for(int j=i;j<len;j++){
                    if(isPalindrome(s,i,j))
                    {
                        int currentlength = j-i+1;
                        if(currentlength>maxlength){
                            maxlength = currentlength;
                            longestPalindrome= s.substring(i, j+1);
                        }
                    }
                }
            }
            return longestPalindrome;
        }
    public static void main(String[] args) {
        String s= "babad";
        System.out.println(longestPalindrome(s));

    }
}
