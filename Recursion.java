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
creates the situation of Statck Overflow

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

    // public static void factorial(int n, int fact){
        
    //     if(n==0){
    //         System.out.println("factorial is "+ fact);
    //     }
    //     else{
    //         fact= fact*n;
    //         factorial(n-1, fact);
    //     }
    // }

    public static int factorial(int n){
        
        if(n==0|| n==1){
            return 1;
        }
        
       int fact_num= factorial(n-1);
       int fact_n= n* fact_num;
       return fact_n;
    }


   public static void main(String arrgs[]){
    printNumber(5); // Printing number from 5 to 1
    System.out.println();
    printNumber2(1); // Printing number from 1 to 5
    System.out.println();
    sum_Natural_Number(1, 10, 0);
    int fact=1;
    //factorial(5,fact);
    int fact_num = factorial(5);
    System.out.println(fact_num);
   } 
}

