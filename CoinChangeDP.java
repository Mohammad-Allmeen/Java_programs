import java.util.Scanner;

class Hide_Credit{
    public static String hide_number(long number){
        int j=0;
       String lastfour= "";
        for (int i = 0; i <4; i++) {
            long n= number%10;
            lastfour=  n+lastfour;
            number/=10;
        }
        lastfour= "XXXX-XXXX-XXXX-"+ lastfour;
        return lastfour;
    }

    public static void string_approach(String str){
        String last_four= str.substring(12,16);
        String output= "XXXX-XXXX-XXXX-"+last_four;
        System.out.println(output);

        //another way
        String x="XXXX-XXXX-XXXX-";
        String output2= x.concat(last_four);
        System.out.println(output2);
    }
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Credit card number");
     long number = sc.nextLong();

     String output= hide_number(number);
     System.out.println(output);

     // another approach to solve iT by taking the card number as String
     String str= "1234567890123456";
     System.out.println(str.substring(0));
     string_approach(str);
    }
}





public class CoinChangeDP {

    public static int minCoins(int[] coins, int total) {
        int[] dp = new int[total + 1];

        // Initialize dp array
        for (int i = 1; i <= total; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0; // Zero coins needed for amount 0

        // Build up the dp table
        for (int amount = 1; amount <= total; amount++) {
            for (int coin : coins) {
                if (amount - coin >= 0 && dp[amount - coin] != Integer.MAX_VALUE) {
                    dp[amount] = Math.min(dp[amount], dp[amount - coin] + 1);
                }
            }
        }

        return dp[total] == Integer.MAX_VALUE ? -1 : dp[total];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int total = 11;

        int result = minCoins(coins, total);

        System.out.println(result);
    }
}
