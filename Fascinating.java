public class Fascinating {
    public static boolean check(){
    int n1=327;
    int n2= n1*2;
    int n3= n1*3;
    String str=n1+""+n2+n3;
    
    for(char ch='1'; ch<='9';ch++){
      int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(ch== str.charAt(i)){
                count++;
            }
        }
            if(count>1||count==0){
                return false;
        }   
    }
return true;
    }
    public static void main(String[] args){
        if(check()){
       System.out.println("It is a fascinating number");
    }else{
        System.out.println("It is not fascinating number");
    }
}
}
    





