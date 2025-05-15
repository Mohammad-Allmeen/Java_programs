import java.util.HashSet;

public class Recursion_2 {

    public static void moveString(String str, int idx, String newStr, int count){
     
        if(idx==str.length()){
            for (int i = 0; i<count; i++) {
                newStr+="x";
            }
            System.out.println(newStr); 
            return; 
        }

        if(str.charAt(idx)!='x'){
        newStr+=str.charAt(idx);
        moveString(str, idx+1 , newStr, count);
        }
        else{
            count++;
            moveString(str, idx+1, newStr, count);
        }
    }

            // Recursive method to remove all the duplicates in the string

            public static boolean map[] = new boolean[26];
            
            public static void remove_duplicate(String str, int idx, String newStr){


                if(idx==str.length()){
                    System.out.println(newStr);
                    return;
                }
                char currChar= str.charAt(idx);
                if(map[currChar-'a']==true){
                    remove_duplicate(str, idx+1, newStr);
                }
                else{
                    newStr+=currChar;
                    map[currChar-'a']=true;
                    remove_duplicate(str, idx+1, newStr);
                }
            }


                // Recursive method to generate subsequences of the string

                public static void subsequence(String str, int idx, String newStr){

                    if(idx== str.length()){
                        System.out.println(newStr);
                        return;
                    }

                    char currChar= str.charAt(idx);

                    // to be, meaning including the character 
                    subsequence(str, idx+1, newStr+currChar);

                   // not to be, meaning excluding the character 
                   subsequence(str, idx+1, newStr);
                }

            // Recursive method to find the unique subsequence of the string using HashSet as it only stores unique values

            public static void unique_subsequence(String str, int idx, String newStr, HashSet<String> set){
           
                if(idx==str.length()){
                    if(set.contains(newStr)){
                        return;
                    }else{
                        System.out.println(newStr);
                        set.add(newStr);
                        return;
                    }
                }


                char currChar= str.charAt(idx);
                unique_subsequence(str, idx+1, newStr+currChar, set);
                unique_subsequence(str, idx+1, newStr, set);
            }



    public static void main(String[] args){

    // Recursive method to move all the x value in the end
    String str= "abxxcxd"; 
    moveString(str, 0, "",0); // Time complexity O(n)+ O(count)i.e =n as the max x can be n times therefore O(2n), removing constant in asymptotic notation comes O(n)

        
    // Recursive method to remove all the duplicates in the string
     remove_duplicate("aabbccddee", 0, "");

    // Recursive method to find out the subsequences of the string

    subsequence("abc", 0, "");

    // Recursive method to find the unique subsequence of the string using HashSet as it only stores unique values
    
    HashSet<String> set= new HashSet<>();
    unique_subsequence("aaa", 0, "", set);

    }
}
