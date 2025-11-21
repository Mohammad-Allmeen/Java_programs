// Bit manipulation is performed to change modify or know the bits
/* There are 4 operations in Bit Manipulation-  
 * 1. get- to get the bit of that particular position
 * 2. set- to set the bit at particular location or positions
 * 3. clear- to make all the bit as zero then we will use clear 
 * 4. update- to change or modify the bit from one to zero and from zero to one
 * 
 * 
 * 1. GET BIT OPERATION-
 * For this process we create a bit mask- 
 * for example the Number is (0101) thereafterr you will take 1(0001) and shift it to particular position given in the question for example 2
 * so 1<<2(1 left shift by 2-> 0100) this 0100 is called Bit Mask and thereafter we perform AND operation with this and the given Number
 * AND Opearation between 0101 and 0100 will provide the ans as 0100 
 * Now if the answer is non-zero(0100) therefore the bit that we want to get is 1 but if the AND operation results in zero(0000) then
 * the bit that we want to get is 0
 * 
 * NOTE- the logic behind this is as you know the AND operation results only to one when both the numbers are 1
 * if in that partuclar position meaning third place(0101) if the number is 1 then the AND operation 
 * between 0101 and 0100 will result in one otherwise all will be zero
 */ 

public class Bit_manipulation {

    public static void getBITOPERATION(){
        int n=5; //0101
        int pos=2;
        int bitmask= 1<<pos; //0100

        if((bitmask &n)==0){ // 0101 AND 0100 = 0100 -> therefore at the third pos the bit is one 
       System.out.println("The Bit is at third position is zero ");
        } else{
            System.out.println("he Bit is at third position is One");
        }

       // To know about the second position
       bitmask= 1<<1; //0010

        if((n&bitmask)==0){ // 0101(5) AND 0010(bitmask) the result is 0000 therefore the bit will zero
            System.out.println("The Bit at second position is zero");
        } else{
            System.out.println("The Bit at second position is one");
        }
    }

   public static void setBITOPERATION(){
     int n=5; // 101
     int bitmask= 1<<3; //1000

     int ans= n | bitmask;//  101 OR 1000 -> 1101 ANS performing OR operation will result in adding one to that particular bit
     System.out.println("The set operation of the bit is "+ ans); 
    }

    public static void clearBITOPERATION(){
        int n=5; // 0101 if you want to convert it into 0001
        int bitmask= 1<<2; //0000
        bitmask= ~bitmask;

        int result = n & bitmask;
        System.out.println(result);
     
        
       }

       public static void updateBITOPERATION(){
        int n=5; // 101
        int bitmask= 1<<3; //1000
   
        // CHANGING 0 TO 1
        int ans= n | bitmask;//  101 OR 1000 -> 1101 ANS performing OR operation will result in adding one to that particular bit
        System.out.println(ans); 

        // CHANGING 1 TO 0

        //  EXAMPLE for 6(110) i have to make 100 
        //Create the bitmask like 2(010) create a complement of of 010 that will be 101 and the perform AND & operation 

        int n1=6;
        int bitmask2= 1<<1;
        bitmask2 = ~bitmask2; // compliment of 2(010) is 5(101)
        
        int ans1= n1 & bitmask2; // 6(110) AND 5(101) is 4(100)
        System.out.println("The bit updated from "+n1+ " to " + ans1);
       }
    public static void main(String[] args){

    getBITOPERATION();
    setBITOPERATION();
    clearBITOPERATION();
    updateBITOPERATION();

    }
}
