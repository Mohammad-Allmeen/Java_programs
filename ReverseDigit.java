

public class ReverseDigit {

    public static int reverseNumberBruteForce(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

         String s= "534321";
        int n= Integer.parseInt(s);

        System.out.println(n*1);
        return reversed;
    }

    public static int reverseParsingMethod(int number){

        String s= Integer.toString(number);
        String revString="";
        for (int i= s.length()-1; i>=0 ;i--) {
            revString+=s.charAt(i);
        }

        return Integer.parseInt(revString);
    }



    public static void main(String[] args) {
        int number = 12345;

        //Brute force approach 
        System.out.println(reverseNumberBruteForce(number));


        // 2nd by parsing to String reversing and then to Int

        System.out.println(reverseParsingMethod(number));

    }
}
