//ArrayList order is there because it uses Indexing

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Repeating_element{

    public static int count(int arr[]){
        int c=0;

        HashSet<Integer> visited= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!visited.contains(arr[i]))
            {
            int count =1; 
            for (int j = 0; j < arr.length; j++) {
                if(j!=i && arr[i]==arr[j]){
                  count++;
                }
              
            }
            if(count>1){
                c++;
            }
        
            visited.add(arr[i]);
        }     
        }
        LinkedHashSet<Integer> check = new LinkedHashSet<>();
        for(int num:arr){
          check.add(num);
        }
        for (Integer integer : check) {
            System.out.print(integer+ ", ");
        }
        return c;
    }


public static void main(String[] args){
int arr[]= {5,4,5,6,7,6,9,0};
int n = count(arr);
System.out.println("Number of repeating Character is: "+ n);
}
}