public class IntegerToRoman {
    public static String intToRoman(int num) {
        String roman= "";
     int value[]= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
     String romanletters[]= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

     for(int i=0; i< value.length;i++){
        while(num>= value[i]){
        roman= roman+ romanletters[i];
        num= num - value[i];
        }
     }
     return roman;
    }

 public static void main(String [] args){
    int n= 11;
    String ans= intToRoman(n);
    System.out.println("The Roman value of Integer "+ n+ " is "+ ans);
 }
}