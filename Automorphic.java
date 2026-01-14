
class Automorphic{
    public static boolean check(int n){
         int sq= (int)Math.pow(n,2);
         int temp=n;
         int c=0;
         while(n>0){
                n/=10;
                c++;
         }
        int c2=0;
         for (int i = 0; i < c; i++) {
            if(temp%10==sq%10){
            c2++;
            temp/=10;
            sq/=10;
            }
         }
         if(c2==c){
            return true;
         }

        return false;
    } 

    //2nd concept/ approach

    public static boolean check_auto(int n){
        int sq=n*n;
        int temp=n;
        while(temp>0){
            if(sq%10!=temp%10){
                return false;
            }
            sq/=10;
            temp/=10;
        }
        return true;
    }
    public static void main(String[] args){
        int n=25;
        if(check(n)){
        System.out.println("It is Automorphic");
        }else{
            System.out.println("It's not automorphic");
        }


        if(check_auto(n)){
        System.out.println("Yes");
        }}
}


