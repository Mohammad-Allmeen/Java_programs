import java.util.*;

public class ArrayList_example {
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();

     //add Element
    for (int i = 0; i < 5; i++) {
        list.add(i);
        
    }
     //get element

     int get= list.get(1);
     System.out.println(get);

     // to add element in between

     list.add(1,10); //index, element
     System.out.println(list);
     // set/change element

     list.set(1,5);
     System.out.println(list);

     //remove/delete the element

     list.remove(2);


     //to know the size of array list
     System.out.println("The size of array list is- " +list.size());

     //loops

     for (int i = 0; i < 5; i++) {
        System.out.print(list.get(i)+" ");
     }

     //sorting in array
    System.out.println();
     Collections.sort(list);
     System.out.println(list);

    }
}
