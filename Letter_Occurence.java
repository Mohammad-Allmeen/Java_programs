public class Letter_Occurence {
    public static void occurence(String str){
    char ch= 'o';
    int count=0;
    
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==ch){
        count++;
        }
    }
    System.out.println(count);

   count=0;
    //Second method
    char chArr[]= str.toCharArray();
    for(int i=0;i<chArr.length;i++){
        if(chArr[i]==ch){
        count++;
        }
    }
    System.out.println("By Second Method: "+count);

    }
    public static void main(String[] args){
        String str= "Hello World";
        occurence(str);
    }
}
