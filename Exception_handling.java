/*  Exception handling is a crucial concept which is used to handle the run time error of the program
// It ensure the running of the code without any error 
// example in a aeroplane system, suppose the light system program of the plane fails, when all are interconnected
and exception handling is not used it will the system which handle the engine will also get stopped nd this and result in dangerous situation
// hence when excpetion handling is used it make sure that when a part of program causes error or contain bugs it make sure that the other part of program runs smoothly
Exception handling also helps the developers to find out location of error in the code

Another example - in the Mobile if the network connection is not available we can use exception handling to show the error messages 
and to handle the exception we can re-try connecting to the network.

try - the code that can cause error is written in the try block
catch- catch block will be executed when the error is encountered
throw - throw will explecitely throw the error
finally- finally block is executed whether the error is encountered or not
*/

public class Exception_handling { 

    public static void main(String[] args){
        int value =0;
        try{
            value= 18/20;
            if(value==0){
             throw new ArithmeticException();
            }
        }
        catch(Exception e){
            System.out.println("Error divide by zero");
            value= 18/1;
            System.out.println(value +" :this is the default value");
        
        }
    }
}
