import java.util.*;

public class NegativeToAbsolute {

    public static List<Integer> replaceToAbsolute(List<Integer> number)
    {
     List<Integer> result = new ArrayList<>();
     for (int i: number) {
        result.add(i<0 ? Math.abs(i): i);
     }
     return result;
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();
    
        System.out.println("Enter the number of integers");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            number.add(sc.nextInt());

        }
        List<Integer> output = replaceToAbsolute(number);
        System.out.println(output);
    }
    
}
