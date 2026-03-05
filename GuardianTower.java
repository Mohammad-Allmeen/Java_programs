
// you need to find the number that has no greater number to its right which will act as guardian tower

import java.util.ArrayList;

public class GuardianTower {
    public static ArrayList<Integer> detectFunction(int arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean check =true;
             for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                check=false;
               break;
            }
        }
        if(check==true){
         result.add(arr[i]);
        }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {16, 17, 4, 3, 5, 2};
        System.out.println(detectFunction(arr));
    }
}
