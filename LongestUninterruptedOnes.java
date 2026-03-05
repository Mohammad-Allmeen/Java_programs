public class LongestUninterruptedOnes {
      public static int count(int arr[]){

        // this method find how many time number 1 is present when it is seperated by 0
        int count=0;
        int j=0;
      for (int i = 0; i < arr.length; i++) {

        if(arr[i]==1){
            count++;

            for (j = i; j < arr.length; j++) {
            if(arr[j]==0){
                i=j;
                break;
            } 
        }
        }
        if(j==arr.length){
            return count;
        }
      }
      return count;
      }


      // this method find the most consecutive ones

      public static int findConsecutive(int arr[]){
        int max= Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
            int count=0;
         for (int j = i; j < arr.length; j++) {
            if(arr[j]==1){
                count++;
            } else{
                break;
            }
         }
         if(count>max){
            max=count;
         }
         }
        return max;
      }

      // Optimized code to find the longest consecutive ones

          public static int countOptimized(int[] arr) {
        int currentCount = 0;
        int maxCount = 0;

        for (int num : arr) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }


    public static void main(String[] args) {
        int arr[]= {1,0,1,1,1,1,1,1,0,1};
        System.out.println(count(arr)); 

        System.out.println(findConsecutive(arr));

        System.out.println(countOptimized(arr));


    }
}
