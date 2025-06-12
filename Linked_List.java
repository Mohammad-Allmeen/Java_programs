public class Linked_List{
    Node head;


    class Node{
    String data;
    Node next;

    Node(String data){
    this.data = data;
    this.next=null;
    }
    }

    public void addFirst(String data){
     Node newNode = new Node(data);
     newNode.next= head;
     head= newNode;
    }

    public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode= currNode.next;
        }
    }

    public static void main(String [] args){
        Linked_List list= new Linked_List();
        list.addFirst("Salam");
        list.addFirst("Hello");
        list.printList();
        list.addLast("Good Morning");
        list.printList();

    }
}