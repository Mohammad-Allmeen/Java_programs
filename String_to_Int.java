public class String_to_Int {
    public static void main(String[] args){
        String str= "45678";
        int val= Integer.parseInt(str); // Function to convert String into Integer
        
        int calc= (int)Math.pow(val, 2);
        System.out.println(calc);
    }
}
