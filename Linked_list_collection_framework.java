// previously we have implemented linked list through basic method 
// but now we will implement it through collection framwork


import java.util.*;
public class Linked_list_collection_framework {

    public static void main(String [] args){
LinkedList<String> list = new LinkedList<>();

list.addFirst("Hello"); //inbuild method in the collection framwork you do not need to create seperate method for it
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

//another way to print the element
System.out.println();
System.out.println("Second method to print the linked list: ");
for (int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i)+ "->"); // list.get method to get the element at a particular location

}
System.out.println();
System.out.println("Sizeof linked list: "+ list.size());
    }
}
