/* 

Wine Bottle Transport
Given an array Arr[] of size N representing N houses built along a straight line with equal distance between adjacent 
houses. Each house has a certain number of wine and they want to buy/sell those wines to other houses. Transporting 
one bottle of wine from one house to an adjacent house results in one unit of work. The task is to find the minimum 
number of work is required to fulfill all the demands of those N houses.

Examples:
Input: N = 5, Arr[] = {5, -4, 1, -3, 1}
Output: 9
Explanation: 1th house can sell 4 wine bottles to 0th house, total work needed 4*(1-0) = 4, new Arr[] = 1,0,1,-3,1. Now,
 3rd house can sell wine to 0th, 2th and 4th. So total work needed = 1*(3-0)+1*(3-2)+1*(4-3) = 5. Total work will be 
 4+5 = 9.
Input: N = 6, Arr[]={-1000, -1000, -1000, 1000, 1000, 1000}
Output: 9000
Explanation: 0th house sells 1000 wine bottles to 3rd house, total work needed 1000*(3-0) = 3000.
 1st house sells 1000 wine bottles to 4th house, total work needed 3000 + 1000*(3-0) = 6000. 2nd house sells 1000 
 wine bottles to 5th house, total work needed 6000 + 1000*(3-0) = 9000. So total work will be 9000 units.
 */


public class TransportWork {

    public static int calculateWork(int arr[]){
       
        int work=0,balance=0;
        for (int i : arr) {
            balance+=i;
            work+=Math.abs(balance);
        }

        return work;
    }
    public static void main(String[] args) {
       int n = 5;
      int arr[] = {5, -4, 1, -3, 1};
     System.out.println(calculateWork(arr)); 

     int arr2[]={-1000, -1000, -1000, 1000, 1000, 1000};
     System.out.println(calculateWork(arr2)); 


    }
}
