import java.util.Scanner;

public class Replace_word 
{
    public static void replace_word(String sentence, String prev_word, String rep_word){
    String arr[] = sentence.split(" ");
    StringBuilder newSent = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
        if(arr[i].equals(prev_word))
        {
            newSent = newSent.append(rep_word).append(" ");
        }
        else{
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
        String prev_word = sc.nextLine();
        String rep_word = sc.nextLine();
        replace_word(sentence, prev_word, rep_word);
        
    }
}
