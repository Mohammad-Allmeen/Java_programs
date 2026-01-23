public class MaxOddMaxEvenCharacter {
      public static int findmaxOdd(String str){
       int count;
       int maxOdd=Integer.MIN_VALUE;
       for (int i = 0; i<str.length(); i++) {
        char ch= str.charAt(i);
        count=0;
      for(int j=0;j<str.length();j++){
        if(ch==str.charAt(j)){
            count++;
        }
      }
        if(count>maxOdd&& count%2==1){
            maxOdd=count;
        }
    }
        return maxOdd;
      }

         public static int findminEven(String str){
       int count;
       int minEven=Integer.MAX_VALUE;
       for (int i = 0; i<str.length(); i++) {
        char ch= str.charAt(i);
        count=0;
         for(int j=0;j<str.length();j++){
        if(ch==str.charAt(j)){
            count++;
        }
      }
        if(count<minEven&& count%2==0){
            minEven=count;
        }
    }
        return minEven;
      }

    public static void main(String[] args) {
        String str= "aatfurrrrr";
       int max= findmaxOdd(str);
       int min= findminEven(str);
       System.out.println(Math.abs(max-min));
    }
}
