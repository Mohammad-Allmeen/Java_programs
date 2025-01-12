import java.util.Scanner;

public class Vowel_Count {
    public static int vowels(String str){
        str= str.toLowerCase();
        int count =0;
        for (int i = 0; i < str.length(); i++) {
             char ch= str.charAt(i);
           if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'|| ch=='u') {
            count++;
           }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int count = vowels(str);
        System.out.println(count);
    }
}
