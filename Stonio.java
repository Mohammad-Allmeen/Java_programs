/*1386*2=2772, we observe that at tens and hundreds place digits are the same. Hence, 1386 is a stonio number. 
1221*2=2442, digits at tens and hundreds place are the same. Hence, 1221 is a stonio number.

 */

public class Stonio {
    public static void main(String[] args){
        int n=1386;
        n=n*2;
        n=n/10;
        int tens=n%10;
        n=n/10;
        int huns = n%10;
        if (tens==huns) {
            System.out.println("Stonio number");
        }else
        {
            System.out.println("Not stonio");
        }
    }
}
