public class Ap_Gp {
    public static void series_AP() {
        int n = 4, a = 2, d = 2;
        int sum = 0;
        System.out.print("The AP series is: ");
        for (int i = 1; i <= n; i++) {
            sum = sum + a;
            System.out.print(a+" ");
            a += d;
        }
        System.out.println();
        System.out.println("The sum of Ap series is: " + sum);

    }

    public static void series_GP(){
        int a=3;
        int d=3;
        int sum=0;
        System.out.println("The GP series is: ");
        for (int i = 1; i < 5; i++) {
            System.out.print(a+" ");
            sum=sum+a;
            a=a*d;
        }
        System.out.println();
        System.out.println("The sum of GP series is: "+sum);
    }

    public static void main(String[] args) {

      series_AP();
      series_GP();



    }
}


/*
 // Print AP series
        int n1 = 2;
        int d = 3;
        System.out.println("The AP series is ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(n1 + " ");
            n1 = n1 + d;
        }

        // Printing GP series
        System.out.print("The GP series is ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(n1 + " ");
            n1 = n1 * d;
        }

        System.out.println();

        // Sum of the GP series
        int a = 3;
        int r = 5;
        int n = 4;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + a;
            a = a * r;
            // a= (int) Math.pow(2, 2);
        }
        System.out.println("The sum of GP series is: "+sum);

        sum_AP();
*/