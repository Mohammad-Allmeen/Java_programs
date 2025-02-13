//here in StringBuilder all the operation are performed on the same string giving faster operations and output thats the reason StringBuilder is immutable and
// considered by the programmer at it is efficient 

public class String_Builder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Allmeen");

        System.out.println(sb.charAt(0));// to get the character at particular index
        
        // Function to replace at any value
        sb.setCharAt(6,'m'); 
        System.out.println(sb); //Allmeem
        sb.setCharAt(6, 'n');

        // Function to insert at any place 
        sb.insert(0, "Mohammad ");
        System.out.println(sb); //Mohammad Allmeen

        //Function to delete any value
        sb.delete( 9, 16); //here the 16 is exclusive meaning it will not include 16th index
        System.out.println(sb); // Mohammad

        //append in the String
        sb.append("Allmeen");
        System.out.println(sb); 

        //reverse

        String s= sb.reverse().toString();
        System.out.println(s);
        System.out.println(sb.reverse());

        int a=8;
        System.out.println(a>>1);// binary right shift will be 4
        System.out.println(a<<1); // Binary left shif will be 16
    }
}
