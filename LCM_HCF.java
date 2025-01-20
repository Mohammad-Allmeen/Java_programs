
public class LCM_HCF {
    public static void h_CF(){
        int n1=80, n2=40;
        int gcd=1;
        for (int i = 1; i <=Math.min(n1, n2); i++) {
            if(n1%i==0 && n2%i==0){
                gcd =i;
            }
        }
        System.out.println("The HCF is "+ gcd);
    }
   public static void main(String[] args){
    int n1=8;
    int n2=12;
    int i=12;
    boolean check=false;
    
        
   while(check==false){
    if(i%n1==0&& i%n2==0){
        check=true;
        break;
    }
    ++i;
    }
   
 System.out.println("The LCM is "+ i);
 h_CF();
} 
}

