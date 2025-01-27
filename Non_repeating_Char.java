// Program to print Non repeating character 
// Ex- Google: Output- le

public class Non_repeating_Char {
    public static void find(String s){
        s=s.toLowerCase();
     for (int i = 0; i < s.length(); i++) {
        int count=1;
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(i)==s.charAt(j) && i!=j){
           count++;
            }
        }
        if(count==1){
            System.out.print(s.charAt(i));
        }
     }
    }
    public static void main(String[] args){
        String s="Google";
        find(s);
    }
}
