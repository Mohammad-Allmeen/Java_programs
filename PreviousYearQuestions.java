/*
Write a function that accepts three parameters: two positive integers r and unit, and a positive integer array arr of size n.
-
• r represents the number of rats present in an area.
• unit is the amount of food each rat consumes.
• Each element of the array arr represents the amount of food present in each house, where the index of the array corresponds to the house number.
The function should determine the minimum number of houses required to provide enough food for all the rats.

Constraints :
• Return -1 if the array is null.
• Return O if the total amount of food from all houses is not sufficient for all the rats.
• Computed values lie within the integer range.
Example:
• Input:
• r: 7
• unit: 2
• n: 8
• arr: [2, 8, 3, 5, 7, 4, 1, 2]
• Output: 4
*/


public class PreviousYearQuestions {

    public static void minHouseRequired(int arr[], int r, int unit){
        int totalFood= r*unit;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum>totalFood){
                System.out.println(i+1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{2, 8, 3, 5, 7, 4, 1, 2}; 
        int r=10;
        int unit= 2;

        minHouseRequired(arr,r, unit);
    }
}
