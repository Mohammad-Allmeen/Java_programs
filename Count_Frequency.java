import java.util.Scanner;

public class Count_Frequency {
    public static void frequency(int arr[]){
    int len = arr.length;
    
    boolean visited[]= new boolean[len];
    for (int i = 0; i < arr.length; i++) {
        
        if(visited[i]==true){
            continue;
        }
        int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println("The frequency of the character is"+ arr[i]+"is" +count);
        }
   
    
    }
    

    //Method to find the frequency of each letter in the String 

    public static void frequencyLetter(String str){
     
        boolean visited[]= new boolean[str.length()];
        int len= str.length();
        for (int i = 0; i < len; i++) {
            if(visited[i]==true|| !Character.isLetter(str.charAt(i))|| Character.isDigit(str.charAt(i))==true){
                continue;
            }
            int count=1;
            for (int j = i+1; j < len; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println("The frequency of letter " +str.charAt(i)+" is " +count);
        }

    }



   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int arr[]= new int[7];
    for (int i = 0; i < arr.length; i++) {
        arr[i]= sc.nextInt();
    }
    frequency(arr);


    String str= "Alhamdulillah for Everything 12";
    frequencyLetter(str);

 

   } 
}
/*
 *   int len= arr.length;
   
   boolean visited[]= new boolean[len];
   for (int i = 0; i < len; i++) {  
    if(visited[i]==true){
        continue;
    }
    int count=1;
    for (int j = i+1; j < len; j++) {
        if(arr[i]==arr[j]){
            visited[j]=true;
            count++;
        }
    }
    System.out.println("The frequency of the digit "+ arr[i]+ " is "+ count);
   }
 */