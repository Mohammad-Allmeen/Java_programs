/* 
Java code to find the maximum odd frequency and minumum even frequency in the string and return 
their absolute differences 
Example - aaabbbccdddd 
Output =1 
detail-
 maximum odd frequency =3 and 
 minumum even frequency =2 
 3-2=1 answer


import java.util.HashMap;
import java.util.HashSet;

*/

public class CountMaxMinFreq {


    public static void main(String[] args) {
        String str="aaabbccdddd";
        
     boolean visited [] = new boolean[256];
       int max=Integer.MIN_VALUE;
       int min= Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
             char ch = str.charAt(i);
            if(visited[ch]){
                continue;
            }
            int count=0;
       
            for (int j = 0; j < str.length(); j++) {
                if(ch==str.charAt(j)){
                count++;
                }
            }
            visited[ch]=true;
            if(count%2==0){
                min = Math.min(count,min);
            }else
                max= Math.max(count,max);
        }

        System.out.println(Math.abs(max-min));
    }
}
