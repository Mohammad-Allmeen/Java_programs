// In this operation do not have to use extra/ another list to reverse use the same list means the space complexity should be O(1)
// Constraint is to have space complexity as O(1) not O(n)

import java.util.LinkedList;

public class Linked_list_reversing {
    public static void main(String [] args){

    
  LinkedList<String> list = new LinkedList<>();

list.addFirst("Hello"); //inbuild method in the collection framework you do not need to create seperate method for it
list.addFirst("Salam");
System.out.println(list);

list.addLast("Good Morning"); //inbuild method in the collection framwork you do not need to create seperate method for it
list.addLast("Hii");
list.addLast("Hey");
System.out.println(list);

System.out.println(list.size());

list.removeFirst();
list.removeLast();
list.remove(2); // Inbuild function to remove the element at a particlar position 

for (String i: list) {
    System.out.print(i+"->");
}
    }  
}
