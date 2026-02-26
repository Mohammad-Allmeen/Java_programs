public class Longest_common_prefix {
    
    //     public String longestCommonPrefix(String[] strs) {
    //         if (strs.length==0 || strs==null)
    //         {
    //             return " ";
    //         }
    //         String word_1 = strs[0];
    //         for (int i = 0;i< strs.length;i++)
    //         {
    //              String word_2 = strs[i];
    //              int j=0;
    //             while(j<word_1.length() && j< word_2.length() && word_1.charAt(j)==word_2.charAt(j)){
    //                 j++;
    //             }
            
    //         if (j==0)
            
    //             return "";
            
    //         word_1 = word_1.substring(0,j);
            
        
    //     }
    //     return word_1;
    // }

    public String longestCommonPrefix(String[] strs) {
      String word1= strs[0];
      int j=0;
      int min= Integer.MAX_VALUE;
      for (int i = 1; i < strs.length; i++) {
        String word2= strs[i];
        j=0;
        while (j<word1.length() && j<word2.length() && word1.charAt(j)==word2.charAt(j)){
            j++;
        }
        if(j==0){
            System.out.println("No Common Prefix");
            return "";
        } 
         if(j<min){
            min=j;
        }
      }
     return word1.substring(0,min);
      

    }
    public static void main (String [] args)
    {
        Longest_common_prefix s1 = new Longest_common_prefix();
        String strs[] = {"flow", "flower", "flight", "float"};
        String result1 = s1.longestCommonPrefix(strs);
        System.out.println(result1);
    
        String strs2[] ={"car", "bike", "river"};
        String result2 = s1.longestCommonPrefix(strs2);
        System.out.println(result2);
    
    }
    }





    