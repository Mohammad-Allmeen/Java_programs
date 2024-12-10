public class Fascinating {
    public static boolean check(){
        int n1=327;
        int n3,n2;
        n2=n1*2;
        n3=n1*3;
        String concatStr= n1+""+n2+n3;
       boolean found = true;
        for (char ch = '1'; ch <='9'; ch++) {
          int  count=0;
            for (int i = 0; i < concatStr.length(); i++) {
                char c=concatStr.charAt(i);
                if (ch== c) {
                    count++;
                }
            }
            if (count>1||count==0||count!=1) {
                found= false;
                break;
            }
        }
        if(found){
            System.out.println("It is a fascinating number");
         }else{
             System.out.println("It is not fascinating number");
         }
        return found;
    }
    public static void main(String[] args){
        if(check()){
       System.out.println("It is a fascinating number");
    }else{
        System.out.println("It is not fascinating number");
    }
}
}
    

