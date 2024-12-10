import java.util.*;
public class Xylem_Phloem {
public static void is_Xylem_phloem(int n){

   Math.abs(n);
   int dup=n;
   int extreme=0, mean=0;
   while (n!=0) {
    if(dup==n||n<0){
     extreme+=n%10;
    }
    else{
        mean+=n%10;
        n=n/10;
    }
   }
   System.out.println(mean);
   System.out.println(extreme);
   if(mean==extreme){
    System.out.println("Xylem number");
   }else
   {
    System.out.println("Phloem number");
   }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
       // Xylem_Phloem ob1 = new Xylem_Phloem(n)
        
        is_Xylem_phloem(n);

    }
}
