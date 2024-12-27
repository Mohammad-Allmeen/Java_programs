public class LastWord_length {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        int n= s.lastIndexOf(" ");
        System.out.println(n);
        for(int i=n;i<s.length()-1;i++){
            count++;

        }
        return count;
    }
    public static void main(String [] args){
        String s= "Hello World";
       int len= lengthOfLastWord(s);
    }
}
