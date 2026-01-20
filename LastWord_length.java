public class LastWord_length {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        int n= s.lastIndexOf(" ");
        System.out.println(n);
        for(int i=n+1;i<=s.length()-1;i++){
            count++;

        }

        String word= s.substring(n+1, s.length());
        System.out.println(word);
        // 2nd approach to find the length of last word

        String arr[]= s.split(" ");
        String lastWord= arr[arr.length-1];
        int len= lastWord.length();

        // return len;
        return count;
    }
    public static void main(String [] args){
        String s= "Hello World, Java";
        int len= lengthOfLastWord(s);
        System.out.println(len);
    }
}
