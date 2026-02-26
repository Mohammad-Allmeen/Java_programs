/*
 * A Cloth merchant has some pieces of cloth of different lengths. He has an order of curtains of length of 12 feet. He has to find how many curtains can  be made from these pieces. Length of pieces of cloth is recorded in feet.

Note : You are expected to write code in the findTotalCurtains function only which receive the first parameter as the number of items in the array and second parameter as the array itself. You are not required to take the input from the console.

Example

Finding the total curtains from a list of 5 cloth pieces.

Input
input 1 : 5
input 2 : 3 42 60 6 14

Output
9

Explanation
The first parameter 5 is the size of the array. Next is an array of measurements in feet. The total number of curtains is 5 which is calculated as under

3 -> 0
42 -> 3
60 -> 5
6 -> 0
14 -> 1
total = 9
 */



public class Curtains {

    public static void interest(){
        int arr[]= {2000,4000,6000, 8000, 10000};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>2000){
                max=max+ (20*arr[i])/100;
            }
        }
        System.out.println("The interest is "+max);

    }
    
public static void main(String[] args){
    int count=0;
    int arr[]= {3,42,6,60,14, 12};
    for(int i=0; i<6; i++){
        if(arr[i]>=12){
            int quotient= arr[i]/12;
            count+=quotient;
        }
    }
    System.out.println(count);
    interest();
}
}




/*
 * 1. Calculate the total interest on loans for an array of amounts. However, till the amount of 2000, there is no interest applicable, but, there is a 20% interest applicable for the remaining amounts in the array.

In this case, we will be writing a calculate TotalInterest function that receives the first input as the number of amounts in the array and the second input as the array of amounts.

For instance, if there are 5 amounts with the first input as 5 and the amounts being 2000, 4000, 6000, 8000 and 10000.

The total sum would be = 20% of 4000 + 20% of 6000 + 20% of 8000 + 20% of 10000 = 5600 (as the 2000 will not be considered for interest)
 */