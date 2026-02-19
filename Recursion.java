/* 
Recursion is the process in which the function calls itself again and 
TWO cases in recursion- 
 1. Base Case- The condition when the recursion stops 
 2. Recursion Case - this is the modified case where the function calls itself untill base case is reached
 The function calls itself untill the Base Case is reached 
 Recursion is the alternative of the loop
Recursion are used in various fields for example
1. Tree, Graph, Linked list etc
2. Backtracking (Suduko Solver, N-Queen Problem)
3. Dynamic Programming (Divide and conquer techniques)

In Recursion every time the function is called a new memory is created for every varibale present inside the function
This is the reason recursion used a lot of memory.
This is the Reason if the base case is not written and recursion is called infinite times the memory gets full and it
creates the situation of Stack Overflow

*/


public class Recursion {
    public static void printNumber(int n){
        if(n==0){
            return;
        }else{
            System.out.print(n+" ");
            printNumber(n-1);
        }
    }

    public static void printNumber2(int n){
        if(n==6){
            return;
        }else{
            System.out.print(n+" ");
            printNumber2(++n);
        }
    }
    
    public static void sum_Natural_Number(int i,int n, int sum){
     if(i==n){
       sum+=i;
       System.out.println(sum);
       return;
     }else{
        sum+=i;
        i++;
       sum_Natural_Number(i, n, sum);
     }
     System.out.print(i+" "); // this will print all the i value as in the stack the memory created for every function called is removed till it reaches the initial value
    }

    public static void factorial(int n, int fact){
        
        if(n==0){
            System.out.println("factorial is "+ fact);
        }
        else{
            fact= fact*n;
            factorial(n-1, fact);
        }
    }

    public static int factorial_second_way(int n){
        
        if(n==0|| n==1){
            return 1;
        }
        
       int fact_num= factorial_second_way(n-1);
       int fact_n=n* fact_num;
       return fact_n;
    }

    public static void fibonacci(int n, int a, int b){
        if(n==10){
            return;
        } else{
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            fibonacci(n+1, a, b);
        }
    }

    // Recursion method to find x^n

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
        return 0;
        }
        int xpnm1= power(x, n-1);
        int nPown= x*xpnm1;
        return nPown;

    }

    // Recursive method to print the reverse of a string

    public static void reverse_string(String str, int ind){
    if(ind==0){
        System.out.println(str.charAt(ind));
        return;
    }

    System.out.print(str.charAt(ind));
    reverse_string(str, ind-1);
    }

    // Recursive method to find the first and last occurence of an element in a string

    public static int first = -1; // taken static so that at every recursion the new variable is not created as in recusrion if the variable is not-static at every recursive call in the memory the variable is intialized
    public static int last = -1;

    public static void elementOccurence(String str, int idx, char element){
     
   
    if(idx==str.length()){
        System.out.println("First Occurence is "+ first+ " and Last Occurence is "+ last);
        return;
    }

    char currChar= str.charAt(idx);
     if(currChar==element){
        if(first==-1){
            first=idx;
        }
        else{
         last=idx;
        }
     }

     elementOccurence(str, idx+1, element);
    }

    
    // Recursive method to check if the array is sorted 

    public static boolean checkSorted(int arr[], int len){

        if (len==0){
            System.out.println("The array is sorted");
            return true;
        }
        if(arr[len]>=arr[len-1]){
            checkSorted(arr, len-1);
        }else{
            System.out.println("The array is not sorted");
            return false;
        }
        return false; 
    }

    


   public static void main(String args[]){
    printNumber(5); // Printing number from 5 to 1
    System.out.println();
    printNumber2(1); // Printing number from 1 to 5
    System.out.println();
    sum_Natural_Number(1, 10, 0);
    int fact=1;
    factorial(5,fact);
    
    int fact_num = factorial_second_way(5);
    System.out.println(fact_num);
    int a=0;
    int b=1;
    System.out.print(a+ " "+b+" ");
    fibonacci(1, a,b);


        // Recursive method to print the reverse of a string

    String str= "abcd";
    reverse_string(str, str.length()-1);


    // Recursive method to find the first and last occurence of an element in a string

    String str2="aabbccdsfadsa";
    elementOccurence(str2, 0, 'a');

    // Recursive method to check if the array is sorted 

    int array[]={1,2,3,4,5};
    
    checkSorted(array, 4);


   }
}

