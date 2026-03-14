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

      public static void MinMax(int arr[]){

        int len= arr.length;
        for(int i=0;i<len-1;i++){
           for(int j=0;j<len-1-i;j++){
            if(arr[j]>arr[j+1]){
              int temp= arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
           }
           }
        }
        System.out.println("Max="+arr[len-1] + "Min="+arr[0]);
      }

    public static void main(String[] args) {
        String str= "aatfurrrrr";
       int max= findmaxOdd(str);
       int min= findminEven(str);
       System.out.println(Math.abs(max-min));

       // function to find Min/max in the array

       int arr[]={6,3,8,9,2,10,1};
       MinMax(arr);

    }
}
