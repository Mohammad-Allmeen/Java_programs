public class Linked_List {
Node head;
private int size;

Linked_List()
{
    this.size=0;
}

    class Node{
        String data;
        Node next; 

        Node(String data){
            this.data= data;
            this.next= null; // as it is new node so it will be null
            size++;
        }
    }

    // method to add element in the starting of the linked list

    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    // method to add element in the last of the linked list

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }

        Node currNode=head;
        while (currNode.next!=null){
         currNode= currNode.next; 
        }

        currNode.next=newNode; //when the current Node is traversed to the last we will add the value in the Linked List
    }


// method to delete element from the starting of the linked list

public void deleteFirst(){
//corner case
if(head==null){
    System.out.println("No element in the linked list");
    return;
}
size--;
head=head.next; // when the head is changed to the next node the first element gets deleted, and this is why we should not change/modify the head, use any other variable to traverse the linked list 
}

// method to delete element from the end of the linked list

public void deleteLast(){
    //corner case
if(head==null){
    System.out.println("No element in the linked list");
    return;
}

// Second corner case if there is only one element in the link list
size--;
if(head.next==null){
    head=null;
    return;
}


Node secondLast= head; // variable to traverse the linked list 
Node lastNode = head.next;

if(lastNode.next!=null){ // it will travel till the lastNode.next comes null i.e we have reached the last node which has no address for the next element
    secondLast= secondLast.next;
    lastNode= lastNode.next;
}

secondLast.next=null; // you will delete the address stored in the second last which will break the link with the last node 
  
}


    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode= head;
        while(currNode!=null){ // here you do not use currNode.next as you have to print last element also
            System.out.print(currNode.data+" -> ");
            currNode= currNode.next;
        }
    }

    public void getsize(){
        System.out.println("The size of Linked list is "+size);
    }
   public static void main(String [] args){
    Linked_List list= new Linked_List();
     list.addFirst("Salam");
     list.addFirst("Hello");
     list.addFirst("Good Morning");
     list.addLast("Hii");
     list.printList();
     System.out.println();
     list.deleteFirst();
     list.printList();

     System.out.println();
     list.deleteLast();
     list.printList();
     System.out.println();
     list.getsize();;
   } 
}

