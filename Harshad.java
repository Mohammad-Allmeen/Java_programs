/* 
Example 1:
Input: 378
Output: Yes it is a Harshad number.
Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

Example 2:
Input: 379
Output: No
 it is not a Harshad number.
Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.

*/

public class Harshad {
    public static void main(String[] args) {
        int n=387;
         int sum=0;
         int temp=n;
        while(n!=0){
            int rem= n%10;
            sum+=rem;
            n/=10;
        }

        if(temp%sum==0){
            System.out.println("Harshad number");
        }
    }

}
