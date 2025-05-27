public class Linked_List {
Node head;
    class Node{
        String data;
        Node next; 

        Node(String data){
            this.data= data;
            this.next= null; // as it is new node so it will be null
        }
    }

    public void addFirst(String data){
        Node newNode= new Node(data);

        newNode.next=head;
        head=newNode;
    }


    public void printList(){
        Node curr= head;
        while(curr!=null){
            System.out.println(curr.data);
            curr= curr.next;
        }
    }
   public static void main(String [] args){
    Linked_List list= new Linked_List();
     list.addFirst("Salam");
     list.addFirst("Hello");
     list.addFirst("Good Morning");
     list.printList();
   } 
}
