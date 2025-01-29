import java.util.Stack;

class Stack_making{
    static int stackArray[];
    static int top;
    static int capacity;


public Stack_making(int size){ // Constructor to initialize the stack
    stackArray= new int[size];
    top=-1;
    capacity= size;
}


 public static void push(int element){
    if(isfull()){
     System.out.println("stack is full cannot enter the element ");
    }
    else{
        stackArray[++top]=element;
        System.out.println("Element Pushed");
    }
 }

 public static boolean isfull(){
    return top==capacity-1;
 }
 public static boolean isEmpty(){
    if(top==-1){
        return true;
    }
    return false;
 }


}

public class Stack_Building {
    public static void main(String[] args){
        // Java in build method to create Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int pop = stack.peek();
        System.out.println(pop);

       int size=5;
       Stack_making s1= new Stack_making(size);
       s1.push(5);
       s1.push(6);
       s1.push(7);

   
    }
}


/*
 * class Stack {
    private int[] stackArray;   // Array to store stack elements
    private int top;            // Points to the top of the stack
    private int capacity;       // Maximum capacity of the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method to add an element to the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }
        stackArray[++top] = element;
        System.out.println("Pushed: " + element);
    }

    // Pop method to remove the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    // Peek method to view the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
 */