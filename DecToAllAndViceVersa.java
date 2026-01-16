public class DecToAllAndViceVersa {
    public static void main(String[] args) {
        
        // Decimal to Binary, Octal and Hexadecimal

        int dec= 250;
        
        String decToBin= Integer.toBinaryString(dec);
        System.out.println("Dec to Binary- "+decToBin );

        String decToOct= Integer.toOctalString(dec);
        System.out.println("Dec to Octal- "+ decToOct);
        
        String decToHex= Integer.toHexString(dec);
        System.out.println("Dec to Hex- "+decToHex);


        //  Binary, Octal and Hexadecimal to Decimal
        
        System.out.println("Binary to Decimal- "+ Integer.parseInt(decToBin,2));

        System.out.println("Binary to Octal- "+ Integer.parseInt(decToOct,8));

        System.out.println("Binary to Hex.- "+ Integer.parseInt(decToHex,16));
    }
}










/*
1. Decimal → Binary / Octal / Hexadecimal
1.1 Integer.toBinaryString(int)

Decimal → Binary

int n = 25;
String binary = Integer.toBinaryString(n);
System.out.println(binary); // 11001



1.2 Integer.toOctalString(int)

Decimal → Octal

int n = 25;
String octal = Integer.toOctalString(n);
System.out.println(octal); // 31



1.3 Integer.toHexString(int)

Decimal → Hexadecimal

int n = 25;
String hex = Integer.toHexString(n);
System.out.println(hex); // 19

1.4 Long equivalents (for large numbers)
long n = 100L;

Long.toBinaryString(n);
Long.toOctalString(n);
Long.toHexString(n);


2. Binary / Octal / Hexadecimal → Decimal
2.1 Integer.parseInt(String s, int radix)

Universal conversion → Decimal

Radix	Number System
2	Binary
8	Octal
10	Decimal
16	Hexadecimal
Binary → Decimal
String binary = "11001";
int decimal = Integer.parseInt(binary, 2);
System.out.println(decimal); // 25

Octal → Decimal
String octal = "31";
int decimal = Integer.parseInt(octal, 8);
System.out.println(decimal); // 25

Hexadecimal → Decimal
String hex = "19";
int decimal = Integer.parseInt(hex, 16);
System.out.println(decimal); // 25



2.2 Integer.valueOf(String s, int radix)

Same as parseInt, but returns an Integer object.

Integer decimal = Integer.valueOf("11001", 2);
System.out.println(decimal); // 25



3. Direct Base ↔ Base Conversion (Without Manual Decimal Step)
3.1 Integer.toString(int i, int radix)

Decimal → Any Base (2–36)

int n = 25;

String binary = Integer.toString(n, 2);  // 11001
String octal  = Integer.toString(n, 8);  // 31
String hex    = Integer.toString(n, 16); // 19



3.2 Binary → Hex (via Java built-ins only)
String binary = "11001";
int decimal = Integer.parseInt(binary, 2);
String hex = Integer.toHexString(decimal);

System.out.println(hex); // 19
 */

