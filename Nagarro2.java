/* Angela has an students in our class and has announced a surprise debate. 
An integer RAA has our own number of all any students for the debate. The students 
will be cropped in pair where the student that has the smallest role number will 
be paired with the student that has the largest role number the student that has the 
second smallest role number will be paired with the student that has the second 
largest number and Zone a pair can debate if the sum of their role number is 
divisible by an integer K in case there is only one student left, and twice his 
role number is divisible by K that student will debate with Angela. Your task is 
to find and return and integer value representing the lowest role number amongst 
All the possible divisible pairs if only one student is left then return that student 
role number in case no student is chosen return minus one input the first input and 
integer value and representing the number of students in the class input to an integer
at a a representing the role number of the students Input three and integer value K 
representing the value K to be used in divisibility test

Example- input1-6
Input2 -{2,1,3,5,4}
Input3 - 6

Output will be 1 write java code */

import java.util.Scanner;

public class Nagarro2 {
    public static int findLowestRoleNumber(int n, int[] roles, int k) {
        int minRole = Integer.MAX_VALUE;
        boolean pairFound = false;

        // Check all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = roles[i] + roles[j];
                if (sum % k == 0) {
                    pairFound = true;
                    minRole = Math.min(minRole, Math.min(roles[i], roles[j]));
                }
            }
        }

        // Check if one student is left
        if (n % 2 != 0) {
            int remainingStudent = roles[n / 2]; // The student left after pairing
            if ((remainingStudent * 2) % k == 0) {
                return remainingStudent;
            }
        }

        // Return the result
        return pairFound ? minRole : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students (n): ");
        int n = scanner.nextInt();

        // Input role numbers
        System.out.println("Enter the role numbers of students: ");
        int[] roles = new int[n];
        for (int i = 0; i < n; i++) {
            roles[i] = scanner.nextInt();
        }

        // Input divisibility number k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Output the result
        int result = findLowestRoleNumber(n, roles, k);
        System.out.println("Result: " + result);

        scanner.close();
    }

}
