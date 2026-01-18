 /* 
 Question- Program to find the identical blocks in the Arrays

 Input - 2,3,3,3,2,2,6,4,4,4,4
 Output - 3 blocks- 333,22,4444
 
 */

public class IdenticalBlock {
    
    public static int func(int arr[]){
          int count=0;
        for (int i = 0; i < arr.length; i++) {
                int value=arr[i];
                int freq=0;
                int j=i;
            while(j<arr.length && arr[j]==value){
              freq++;
              j++;
            }
            if(freq==value){
                count++;
            }
        }
        return count;
    }


public static void main(String[] args) {
   //System.out.println("Enter the value of the array");
   int arr[] = {2,3,3,3,2,2,6,4,4,4,4};
   System.out.println(func(arr)); 

}
}

