public class Perfect_number {
    public static void main(String[] args){
        int n=6;
        int value=n;
        int sum=0;
        for (int i = 1; i <=n/2; i++) {
            if(n%i==0){
            sum=sum+i;
            }
            
        }
        System.out.println(sum);
        if(sum==value){
            System.out.println("Perfect number");
        }
    }
}
