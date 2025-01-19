public class Replace_Integer {
    public static void main(String[] args){
        int n=432010;
        int sum=0;
        int temp=1;
        while(n!=0){
            int rem=n%10;
            if(rem==0){
                sum= 1*temp+sum;
                n/=10;
            } else{
             sum = rem*temp+sum;  
             n/=10; 
            }
            temp*=10;
        }
        System.out.println(sum);
    }
}
