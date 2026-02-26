/*
"1C0C1C1A0B1"

These logic gate operation will be performed 
for A- AND gate
    B- OR gate
    C- XOR gate

    operation to be performed from left to right
*/




public class BinaryLogicOperation {
    public static void main(String[] args) {
       
    String input= "1C0C1C1A0B1";
    //String input= "0A1B1C1";

     int ans=input.charAt(0)- '0';  // trick to conver charater integer into Integer 
    for(int i =1;i<input.length()-1;i++){
        if(input.charAt(i)=='C'){
           ans = ans ^ (input.charAt(i+1)- '0');
           i++;
        }
           else if(input.charAt(i)== 'B'){
           ans= ans | (input.charAt(i+1)-'0');
           i++;
           }else{
            ans= ans & (input.charAt(i+1)-'0');
            i++;
            }
    }
    System.out.println(ans);
    }

}









/* 


-> Trick to covert character numeric into Integer datatype

'0' has ASCII value 48
if str=1 // Ascii value of 1 is 49;
then-
str.charAt(i) - '0'

means 49-48=1 // this will return integer datatype 1 not character

It works for all value 

example 

str= 8;

int value = str.charAt(i)- '0'; 
ans =8 means 56-48= 8 ASCII value of 8 is 56 and 0 is 48



*/

