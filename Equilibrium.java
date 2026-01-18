/* 
Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0
*/

public class Equilibrium {
    public static int find(int arr1[]){
     
        for (int i = 0; i < arr1.length; i++) {
            int sum1=0, sum2=0;
            for (int j = 0; j < i; j++) {
                sum1+=arr1[j];
            }
            for (int j = i+1; j < arr1.length; j++) {
                sum2+=arr1[j];
            }
            if(sum1==sum2){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        
        int arr1[]={2,3,-1,8,4};
       // int arr2[]={1,-1,4};
        int index=find(arr1);
        System.out.println(index);
    }
}
