import java.util.ArrayList;
import java.util.HashSet;

public class Non_Repeating {

    public static void non_repeating(){
    String str= "alphaadida";
    int count=0, f=0;

     for(int i =0; i<str.length();i++){

      for (int j = 0; j < str.length(); j++) {
        count =0;
        if(str.charAt(i)==str.charAt(j)&& i!=j){
            count=1;
            break;
        }
      }
      if(count==0){
        f++;
        System.out.print(str.charAt(i)+", ");
      }
     }
     System.out.println(f);
    }



    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int arr[]= {5,6,5,6,5,7,8,8};
   boolean check;
   int count=0;
for (int i = 0; i < arr.length; i++) {
    check = false;
    count=0;
    for (int j = 0; j < arr.length; j++) {
        if(arr[i]==arr[j]&& i!=j){
         check= true;
         count++;
        break;
        }
    }
    if(!check&& count==0)
    System.out.println(arr[i]);

}
non_repeating();
}

}


