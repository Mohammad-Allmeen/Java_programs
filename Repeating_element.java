//ArrayList order is there because it uses Indexing

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Repeating_element{

    public static int count(int arr[]){
        int count=0;
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!visited.contains(arr[i])){
              for (int j = 0; j < arr.length; j++) {
                if(i!=j && arr[i]==arr[j]){
                    visited.add(arr[i]);
                    System.out.println(arr[i]);
                    count++;
                    break;
                }
              } 
            }
        }

        LinkedHashSet<Integer> check = new LinkedHashSet<>();
        for(int i:arr){
            check.add(i);
        }
        System.out.println("Array after removing duplicates");
          for(int i:check){
            System.out.print(i+", ");
        }
        System.out.println();
    return count;
    }


public static void main(String[] args){
int arr[]= {5,4,5,6,7,6,9,0,7};
int n = count(arr);
System.out.println("Number of repeating Character is: "+ n);
}
}

/*

     int c=0;

        HashSet<Integer> visited= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!visited.contains(arr[i]))
            {
            int count =1; 
            for (int j = 0; j < arr.length; j++) {
                if(j!=i && arr[i]==arr[j]){
                 System.out.print(arr[i]+ " ");
                  count++;
                  break;
                }
              
            }
            if(count>1){
                c++;
            }
            visited.add(arr[i]);
        }     
        }

        LinkedHashSet<Integer> check = new LinkedHashSet<>();// as it contains only unique elements
        for(int num:arr){
          check.add(num);
        }
        System.out.println("Array after removing the duplicates: ");
        for (Integer integer : check) {
            System.out.print(integer+ ", ");
        }
        return c;
*/