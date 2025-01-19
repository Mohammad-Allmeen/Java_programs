public class Ap_Gp {
    public static void sum_AP(){
        int n=4,a=2,d=2;
        int sum=0;
       for (int i = 0; i < n; i++) {
        sum=sum+a;
        a+=d;
       }
       System.out.println("The sum of Ap series is "+ sum);

    }
    public static void main(String[] args){
        int n1= 2;
        int lt= 4;
        int n=10;
        for (int i = 0; i < n-2; i++) {
            int t= lt*2;
            lt=t;
            System.out.println(lt);
        }
        

        int a=3;
        int r=5;
        n=2;
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum+ a;
            a= a*r;
            //a= (int) Math.pow(2, 2);
        }
        System.out.println(sum);

        sum_AP();
    }
}
