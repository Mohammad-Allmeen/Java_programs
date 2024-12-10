/*iam works as a data analyst for a company that stores massive amounts of numerical data. 
He has been tasked with determining how many commas are used when writing numbers in
the range of one to end in a specific format in this format if numbers are more than
four digit long commas are used to separate the numbers into a group of three 
starting from the right for the representation of the number your task is to help 
Liam find and return an integer value representing the total number of commas used 
when writing all the integers Take input and representing the number range and output 
returns of integer value representing total number of commas used when writing all 
the integers in the range one to an example if input is 1010 the output will be 11 
means the 11 commas are used in the rangeWrite a Java program to find out.*/


public class Nagarro1 {
    // Method to count the number of commas for numbers up to n
    public static int countCommas(int n) {
        int commaCount = 0;
        
        // Iterate through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Convert the number to a string to calculate its length
            String numberStr = Integer.toString(i);
            
            // If the number is greater than 999, it will have commas
            if (numberStr.length() > 3) {
                // Calculate how many commas are needed
                commaCount += (numberStr.length() - 1) / 3;
            }
        }
        
        return commaCount;
    }

    public static void main(String[] args) {
        // Input value
        int n = 1010; // Example input
        
        // Call the countCommas method and print the result
        int result = countCommas(n);
        System.out.println("Total number of commas used: " + result);
    }

}
