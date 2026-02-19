/*

Hs = (s + 1)3 + Lk=1 k * k, where s >= 0

Thus, we get
Ho = (0 + 1)3 + Lk=1 k * K = (1)3 + 0 = 1
H1 = (1 + 1)3 + 2k=1k * k = (2)*+1*1=8+1 = 9
H2= (2 + 1)3 + Zk=1k * k=(3)3+1*1+2*2=27+1 +4= 32 
*/


import java.util.*;
public class House_number {
    public static int find_number(int n)
    {
        if(n<0){
            return 0;
        }
        int first_half= (n+1)*(n+1)*(n+1);
        int second_half=0;

        for (int i = 1; i <=n; i++) {
            second_half=second_half+(i*i);
        }
        return first_half+second_half;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= sc.nextInt();
        for (int i = 0; i <= n; i++) {
        System.out.println(find_number(i)); 
        }
    }
}
