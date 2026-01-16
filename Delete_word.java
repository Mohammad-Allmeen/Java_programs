import java.util.Scanner;

public class Delete_word 
{
public static String delete_word(String sentence, String delWord){
   if(sentence.isBlank()){
    System.out.println("Error!Enter the sentence");
   }
   
    StringBuilder str= new StringBuilder();
    String arr[]= sentence.split(" ");
    for (int i = 0; i < arr.length; i++) {
        if(!arr[i].equals(delWord)){
            str= str.append(arr[i]).append(" ");
        }
    }
     String s= str.toString();
        s.trim();
        return s;
}
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to delete");
        String delete_word = sc.nextLine();
        System.out.println(delete_word(sentence, delete_word));

        
    }
}

