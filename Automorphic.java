
class Automorphic{
    public static boolean check(int n){
        int c=0;
        int temp=n;
        while(n>0){
         n=n/10;
         c++;
        }
        boolean ch= false;
        int count=0;
        int sq= (int) Math.pow(temp,2);
        for (int i = 0; i < c; i++) {
             if(sq%10==temp%10){
            count++;
            }

        }
        if(c==count){
            return true;
        }
        return false;
    } 

    //2nd concept/ approach

    public static boolean check_auto(int n){
        int sq=n*n;
         int temp=n;
         boolean ch= true;
        while(n>0){
            if(sq%10==temp%10){
                return false;
            }
            n=n/10;
            temp=temp%10;
        }
        return true;
    }
    public static void main(String[] args){
        int n=25;
        if(check(n))
        System.out.println("It is Automorphic");


        if(check_auto(n));
        System.out.println("Yes");
    }
}