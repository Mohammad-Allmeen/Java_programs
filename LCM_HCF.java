
public class LCM_HCF {
    public static void h_CF(){
        int n1=100;
        int n2=120;
       int hcf=0;
        for (int i = 1; i <=Math.min(n1, n1); i++) {
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
    }
   public static void main(String[] args){
   int n1=45;
   int n2= 20;
    

   // 1st
   int lcm;;
   for (lcm = 45; lcm < Integer.MAX_VALUE; lcm++) {
      if (lcm%n1==0 && lcm%n2==0){
      break;
   }
   }
   System.out.println(lcm);
 
// 2nd approach to find lcm

    int i= Math.max(n1,n2);
    boolean check=false;
   
    while(check== false){
        if(i%n1==0 && i%n2==0){
            check=true;
            break;
        }
        ++i;
    }

   
 System.out.println("The LCM is "+ i);


 h_CF();
} 
}