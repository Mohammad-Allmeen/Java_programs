import java.util.Scanner;

public class Delete_word 
{
    public static void delete_word(String sentence, String deleString){
    String arr[] = sentence.split(" ");
    StringBuilder newSent = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
        if(!arr[i].equals(deleString))
        {
            newSent= newSent.append(arr[i]).append(" ");
        }
    }
    System.out.println(newSent);
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
