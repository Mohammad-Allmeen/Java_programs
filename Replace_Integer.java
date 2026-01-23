public class Replace_Integer {
    public static void replace(int n){
        int sum=0,rem=0;
        int temp=1;
        while(n!=0){
            rem=n%10;
            if(rem==0){
                sum=1*temp+sum;
            }
            else{
                sum=rem*temp+sum;
            }
            temp*=10;
            n/=10;
        }
        System.out.println(sum);
    }

    public static void replaceString(int n){
        String str= Integer.toString(n);
        String rev="";
        StringBuilder rev2= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='0'){
          rev+=1;
          rev2=rev2.append(1);
            }else{
                rev+=str.charAt(i);
                rev2=rev2.append(str.charAt(i));
            }
        }
        System.out.println(rev);
        System.out.println(rev2);
    }

    public static void main(String[] args){
        int n=402010;
        replace(n);
        replaceString(n);
      
    }
}
  