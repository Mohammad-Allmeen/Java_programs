/*
 
Collection framework- Java collection framework provides the feature for storing and manipulation of groups or large amount of data
Example - List,Set, Queue, Maps, HastSet etc

Without collection framework you will require array which has fixed size and does not support dynamic resizing and advanced operation like sorting, searching or iteration

Collection framework provides dynamic resizing 

In Array you can store primitive datatype  

In ArrayList everything is stored in the form of object and its stored in the heap memory

In Array List, the time complexity of searching operation is Big O(1), as arr[7], i.e in one operation we found the element which is the efficient way

However for the insert operation the time complexity will become Big O(n), as we need to shift every element which is time taking and not the efiecient way hence here comes the use of Linked List

As in Linked List we insert the element just by changing/pointing the links of the address, there is no shifting of the elements therefore it is more efficient 
 
In Conclusion:-

                      ArrayList         V/S           Linked List

Insert Op-             O(N)              >               O(1)

Search Op-             O(1)              <               O(N)
*/


import java.util.*;
public class Array_List {
    public static void main(String[] args){

        ArrayList<Integer> intList= new ArrayList<>(); // creating array list of Integers object
        ArrayList<Float> floatList= new ArrayList<>(); // creating array list of Float object
        ArrayList<Boolean> booleanList= new ArrayList<>(); // creating array list of Boolean object
        ArrayList<String> stringList= new ArrayList<>();   //  creating array list of String object   
        
        // adding element in the array list (.add method)
        intList.add(1); // manually

        for (int i = 0; i < 5; i++) {
            intList.add(i);
        } 

        System.out.println(intList);

        // get element  (.get Method)
        System.out.println(intList.get(1));

        //to add element in between (.add Method)
        intList.add(6, 100);
        System.out.println(intList);

        //set element, to change the element at a particular index (.set Method)
        intList.set(6, 10);
        System.out.println(intList );

        // to find the size of arrayList (.size method)
        System.out.println("The size of arrayList is: " + intList.size());

        //to delete the element (.remove Method)
        intList.remove(6);
        System.out.println(intList);

        // Sorting technique on arrayList (Collection.sort(arrayList)) we use sort function of Collection class
        Collections.sort(intList);
        System.out.println(intList);

    }
    
}
