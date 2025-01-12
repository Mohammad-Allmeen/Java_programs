import java.util.Scanner;

public class Delete_word 
{
public static String delete_word(String sentence, String delWord){
    StringBuilder newSet = new StringBuilder();
    String nSent= "";
    String arr[]= sentence.split(" ");
    for (int i = 0; i < arr.length; i++) {
        if(!arr[i].equals(delWord)){
         nSent = nSent+ arr[i]+" ";
         newSet= newSet.append(arr[i]).append(" ");
        }
    }
    return newSet.toString();
}
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to delete");
        String delete_word = sc.nextLine();
        delete_word(sentence, delete_word);
        
    }
}
