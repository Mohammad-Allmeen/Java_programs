/*
 * Example 1:
Input: string str = "take12% *&u ^$#forward"
Output: takeuforward
Explanation:
Characters 1,2,%,*,&,^,$,# along with whitespaces are 
removed but the order of remaining alphabets is preserved.

Example 2:
Input: String str = "1.Python & 2.Java"
Output: PythonJava
Explanation: 
Characters 1.&2. along with whitespaces are removed 
but the order of remaining alphabets is preserved.
 */

public class Character_print {
    public static void character_Print(String s){
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int n= (int) ch;
            if (n==32) {
                System.out.print(ch);
            }
            if(n>=65 && n<=90|| n>=97 && n<=122 ){
                System.out.print(ch);
            }
        }
    }
    public static void main(String args[]){
        String s= "Alhamdulilah,&& Allah swt guided me ** to work hard consistently";
        character_Print(s);
    }
}
