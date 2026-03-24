import java.util.HashSet;
import java.util.Scanner;

public class Count_Frequency {

    // method to count the frequency of the digit

    public static void frequency(int arr[]) {
   
        HashSet<Integer> visited= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int n= arr[i];
            if(visited.contains(n)){
                continue;
            }
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(n== arr[j]){
                    count++;
                }
            }
            visited.add(n);
           System.out.println("Frequency of digit "+n +"is "+ count);
        }
        
    }

    // method to count the frequency of the letters in the String

    public static void frequencyLetter(String str) {

        int len = str.length();

        HashSet<Character> vis= new HashSet<>();
        int count;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
           if(vis.contains(ch) || !Character.isLetter(ch)){
           continue;
           }
            count = 0;
            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == ch) {
                    count++;
     
                }
            }
            vis.add(ch);
            System.out.println("The freq of letter " + ch + "is:  " + count);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int arr[]= {1,2,1,2,4,4,8};
       frequency(arr); 

        String str = "Alhamdulillah for Everything 12";
        frequencyLetter(str);
    }
}
/*

-> Second approach of letter frequency

 * int len = str.length();
 * boolean visited[] = new boolean[len];
 * 
 * for (int i = 0; i < len; i++) {
 * 
 * if (visited[i]==true || !Character.isLetter(str.charAt(i))) {
 * continue;
 * }
 * 
 * int count = 1;
 * for (int j = i + 1; j < len; j++) {
 * if (str.charAt(i) == str.charAt(j)) {
 * visited[j] = true;
 * count++;
 * }
 * }
 * 
 * System.out.println("The frequency of letter " + str.charAt(i) + " is " +
 * count);
 * }
 */




/*
--> Second approach for  the freqency of the digit 

     int len = arr.length;
        boolean visited[] = new boolean[len];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("The frequency of the number " + arr[i] + " is " + count);
        }

*/