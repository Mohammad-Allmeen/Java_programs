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
        if(strs.length==0||strs==null){
            return " ";
        }
        String word_1=strs[0];
        for(int i=0;i<strs.length;i++){
            String word_2= strs[i];
         int j=0;
            while(j<word_1.length() && j<word_2.length() && word_1.charAt(j)==word_2.charAt(j))
            {
                j++;
            }
            if(j==0)
                return "";
            
             word_1= word_1.substring(0,j);
              
        }
        return word_1;
    }
    public static void main (String [] args)
    {
        Longest_common_prefix s1 = new Longest_common_prefix();
        String strs[] = {"flow", "flower", "flight"};
        String result1 = s1.longestCommonPrefix(strs);
        System.out.println(result1);
    
        String strs2[] ={"car", "bike", "river"};
        String result2 = s1.longestCommonPrefix(strs2);
        System.out.println(result2);
    
    }
    }

